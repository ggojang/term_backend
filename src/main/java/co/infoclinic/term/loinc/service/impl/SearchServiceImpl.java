package co.infoclinic.term.loinc.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import co.infoclinic.term.loinc.model.dto.SearchResultDTO;
import co.infoclinic.term.loinc.service.SearchService;

/**
 * LOINC Search Service (PostgreSQL 기반, Elasticsearch 대체)
 *
 * /search/LOINC?q=&page=&size= 엔드포인트 처리
 *   - 코드 검색: LOINC 코드 패턴(nnnnnn-n) → loinc.LOINC.CODE 정확 매치
 *   - 용어 검색: LONG_COMMON_NAME ILIKE 또는 콜론 포함 시 FSN 전체 매치
 */
@Service("LncSrchSvc")
public class SearchServiceImpl implements SearchService {

    Logger log = LoggerFactory.getLogger(SearchServiceImpl.class);

    @Autowired
    private DataSource dataSource;

    // ----------------------------------------
    // Public Methods
    // ----------------------------------------

    @Override
    public Page<SearchResultDTO> searchByWord(String word, int page, int size) {
        if (StringUtils.isEmpty(word) || page < 1 || size < 1) {
            return new PageImpl<>(new ArrayList<>());
        }

        int offset = (page - 1) * size;

        if (isCode(word)) {
            return searchByCode(word.toUpperCase(), offset, size, page);
        } else {
            return searchByTerm(word, offset, size, page);
        }
    }

    @Override
    public Page<SearchResultDTO> searchByWordAndField(String word, String field, int page, int size) {
        if (StringUtils.isEmpty(word) || StringUtils.isEmpty(field) || page < 1 || size < 1) {
            return new PageImpl<>(new ArrayList<>());
        }

        int offset = (page - 1) * size;
        String column = mapFieldToColumn(field);

        String sql = "SELECT code, long_common_name AS fsn, short_name, status " +
                     "FROM loinc.loinc WHERE " + column + " ILIKE ? " +
                     "ORDER BY LENGTH(long_common_name) LIMIT ? OFFSET ?";
        String countSql = "SELECT COUNT(*) FROM loinc.loinc WHERE " + column + " ILIKE ?";
        String pattern = "%" + word + "%";

        try (Connection conn = dataSource.getConnection()) {
            long total = 0;
            try (PreparedStatement ps = conn.prepareStatement(countSql)) {
                ps.setString(1, pattern);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) total = rs.getLong(1);
                }
            }
            List<SearchResultDTO> list = new ArrayList<>();
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, pattern);
                ps.setInt(2, size);
                ps.setInt(3, offset);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) list.add(map(rs));
                }
            }
            return new PageImpl<>(list, new PageRequest(page - 1, size), total);
        } catch (Exception e) {
            log.error("searchByWordAndField error", e);
            return new PageImpl<>(new ArrayList<>());
        }
    }

    // ----------------------------------------
    // Private Methods
    // ----------------------------------------

    private Page<SearchResultDTO> searchByCode(String code, int offset, int size, int page) {
        String sql = "SELECT code, long_common_name AS fsn, short_name, status " +
                     "FROM loinc.loinc WHERE code = ? LIMIT ? OFFSET ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, code);
            ps.setInt(2, size);
            ps.setInt(3, offset);
            List<SearchResultDTO> list = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
            return new PageImpl<>(list, new PageRequest(page - 1, size), list.size());
        } catch (Exception e) {
            log.error("searchByCode error", e);
            return new PageImpl<>(new ArrayList<>());
        }
    }

    private Page<SearchResultDTO> searchByTerm(String word, int offset, int size, int page) {
        boolean hasColon = word.contains(":");

        String sql;
        String countSql;
        String[] params;

        if (hasColon) {
            // 전체 FSN 매치
            sql = "SELECT code, long_common_name AS fsn, short_name, status FROM loinc.loinc " +
                  "WHERE LOWER(long_common_name) = ? ORDER BY LENGTH(long_common_name) LIMIT ? OFFSET ?";
            countSql = "SELECT COUNT(*) FROM loinc.loinc WHERE LOWER(long_common_name) = ?";
            params = new String[]{ word.toLowerCase() };
        } else {
            // 각 단어별 ILIKE AND
            String[] words = word.toLowerCase().split("\\s+");
            StringBuilder where = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (i > 0) where.append(" AND ");
                where.append("long_common_name ILIKE ?");
            }
            sql = "SELECT code, long_common_name AS fsn, short_name, status FROM loinc.loinc " +
                  "WHERE " + where + " ORDER BY LENGTH(long_common_name) LIMIT ? OFFSET ?";
            countSql = "SELECT COUNT(*) FROM loinc.loinc WHERE " + where;
            params = Arrays.stream(words).map(w -> "%" + w + "%").toArray(String[]::new);
        }

        try (Connection conn = dataSource.getConnection()) {
            long total = 0;
            try (PreparedStatement ps = conn.prepareStatement(countSql)) {
                for (int i = 0; i < params.length; i++) ps.setString(i + 1, params[i]);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) total = rs.getLong(1);
                }
            }
            List<SearchResultDTO> list = new ArrayList<>();
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                int idx = 1;
                for (String p : params) ps.setString(idx++, p);
                ps.setInt(idx++, size);
                ps.setInt(idx, offset);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) list.add(map(rs));
                }
            }
            return new PageImpl<>(list, new PageRequest(page - 1, size), total);
        } catch (Exception e) {
            log.error("searchByTerm error", e);
            return new PageImpl<>(new ArrayList<>());
        }
    }

    private SearchResultDTO map(ResultSet rs) throws Exception {
        SearchResultDTO dto = new SearchResultDTO();
        dto.setCode(rs.getString("code"));
        dto.setFsn(rs.getString("fsn"));
        dto.setShortName(rs.getString("short_name"));
        dto.setStatus(rs.getString("status"));
        return dto;
    }

    /** ES 필드명 → LOINC 컬럼명 매핑 */
    private String mapFieldToColumn(String field) {
        switch (field.toLowerCase()) {
            case "component":   return "component";
            case "property":    return "property";
            case "time":
            case "timeaspect":  return "time_aspect";
            case "system":      return "system";
            case "scale":
            case "scaletype":   return "scale_type";
            case "method":
            case "methodtype":  return "method_type";
            default:            return "long_common_name";
        }
    }

    /** LOINC 코드 여부 판정 (nnnnnn-n 패턴) */
    private boolean isCode(String q) {
        if (q == null) return false;
        int len = q.length();
        if (len < 3 || len > 10 || !q.contains("-")) return false;
        String lastTwo = q.substring(len - 2);
        return lastTwo.startsWith("-") && Character.isDigit(lastTwo.charAt(1));
    }
}
