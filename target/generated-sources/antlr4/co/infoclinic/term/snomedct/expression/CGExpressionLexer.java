// Generated from co/infoclinic/term/snomedct/expression/CGExpression.g4 by ANTLR 4.5
package co.infoclinic.term.snomedct.expression;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUIVALENT_TO=1, SUBTYPE_OF=2, LPARAN=3, RPARAN=4, COLON=5, PLUS=6, COMMA=7, 
		EQUAL=8, LCBRACKET=9, RCBRACKET=10, TERM=11, SCTID=12, NUMBER=13, STRING=14, 
		WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQUIVALENT_TO", "SUBTYPE_OF", "LPARAN", "RPARAN", "COLON", "PLUS", "COMMA", 
		"EQUAL", "LCBRACKET", "RCBRACKET", "TERM", "SCTID", "NUMBER", "STRING", 
		"ESCAPE_CHAR", "NONWSNONPIPE", "DIGIT", "DIGITNONZERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'==='", "'<<<'", "'('", "')'", "':'", "'+'", "','", "'='", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUIVALENT_TO", "SUBTYPE_OF", "LPARAN", "RPARAN", "COLON", "PLUS", 
		"COMMA", "EQUAL", "LCBRACKET", "RCBRACKET", "TERM", "SCTID", "NUMBER", 
		"STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CGExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CGExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7\fD\n"+
		"\f\f\f\16\fG\13\f\3\f\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\3\f\3\r\5\r"+
		"T\n\r\3\r\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\16\3\16\5\16`\n\16\3\16\3"+
		"\16\7\16d\n\16\f\16\16\16g\13\16\3\16\3\16\7\16k\n\16\f\16\16\16n\13\16"+
		"\5\16p\n\16\3\16\3\16\5\16t\n\16\3\16\3\16\3\16\3\16\6\16z\n\16\r\16\16"+
		"\16{\5\16~\n\16\3\17\3\17\3\17\7\17\u0083\n\17\f\17\16\17\u0086\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008e\n\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\u0084\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\21\3\2\5\4\2$$^^"+
		"\6\2\13\f\16\17\"\"~~\5\2\13\f\16\17\"\"\u00a4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7\61\3\2\2\2\t\63\3"+
		"\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2"+
		"\25?\3\2\2\2\27A\3\2\2\2\31S\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u008d"+
		"\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2"+
		")*\7?\2\2*+\7?\2\2+,\7?\2\2,\4\3\2\2\2-.\7>\2\2./\7>\2\2/\60\7>\2\2\60"+
		"\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7+\2\2\64\n\3\2\2\2\65\66\7"+
		"<\2\2\66\f\3\2\2\2\678\7-\2\28\16\3\2\2\29:\7.\2\2:\20\3\2\2\2;<\7?\2"+
		"\2<\22\3\2\2\2=>\7}\2\2>\24\3\2\2\2?@\7\177\2\2@\26\3\2\2\2AE\7~\2\2B"+
		"D\7\"\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HM\5!\21\2IL\7\"\2\2JL\5!\21\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7~\2\2Q\30\3\2\2\2RT\7/\2\2SR\3\2\2\2"+
		"ST\3\2\2\2TU\3\2\2\2UZ\5%\23\2VY\5#\22\2WY\7/\2\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\Z\3\2\2\2]_\7%\2\2^`\7/\2"+
		"\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\5%\23\2bd\5#\22\2cb\3\2\2\2dg\3\2\2"+
		"\2ec\3\2\2\2ef\3\2\2\2fo\3\2\2\2ge\3\2\2\2hl\7\60\2\2ik\5#\22\2ji\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oh\3\2\2\2op\3\2"+
		"\2\2p~\3\2\2\2qs\7%\2\2rt\7/\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\62"+
		"\2\2vw\7\60\2\2wy\3\2\2\2xz\5#\22\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|~\3\2\2\2}]\3\2\2\2}q\3\2\2\2~\34\3\2\2\2\177\u0084\7$\2\2\u0080"+
		"\u0083\5\37\20\2\u0081\u0083\n\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\36\3\2\2\2"+
		"\u0089\u008a\7^\2\2\u008a\u008e\7$\2\2\u008b\u008c\7^\2\2\u008c\u008e"+
		"\7^\2\2\u008d\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e \3\2\2\2\u008f\u0090"+
		"\n\3\2\2\u0090\"\3\2\2\2\u0091\u0092\4\62;\2\u0092$\3\2\2\2\u0093\u0094"+
		"\4\63;\2\u0094&\3\2\2\2\u0095\u0096\t\4\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\b\24\2\2\u0098(\3\2\2\2\23\2EKMSXZ_elos{}\u0082\u0084\u008d\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}