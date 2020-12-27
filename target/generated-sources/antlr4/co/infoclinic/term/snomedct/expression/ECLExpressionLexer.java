// Generated from co/infoclinic/term/snomedct/expression/ECLExpression.g4 by ANTLR 4.5
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
public class ECLExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESCENDANTOF=1, DESCENDANTORSELFOF=2, CHILDOF=3, ANCESTOF=4, ANCESTORSELFOF=5, 
		PARENTOF=6, MEMBEROF=7, COLON=8, PLUS=9, COMMA=10, LPARAN=11, RPARAN=12, 
		LCBRACKET=13, RCBRACKET=14, CONJUNCTION=15, DISJUNCTION=16, EXCLUSION=17, 
		EQUAL=18, ANY=19, TERM=20, SCTID=21, NUMBER=22, STRING=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DESCENDANTOF", "DESCENDANTORSELFOF", "CHILDOF", "ANCESTOF", "ANCESTORSELFOF", 
		"PARENTOF", "MEMBEROF", "COLON", "PLUS", "COMMA", "LPARAN", "RPARAN", 
		"LCBRACKET", "RCBRACKET", "CONJUNCTION", "DISJUNCTION", "EXCLUSION", "EQUAL", 
		"ANY", "TERM", "SCTID", "NUMBER", "STRING", "ESCAPE_CHAR", "NONWSNONPIPE", 
		"DIGIT", "DIGITNONZERO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'<<'", "'<!'", "'>'", "'>>'", "'>!'", "'^'", "':'", "'+'", 
		"','", "'('", "')'", "'{'", "'}'", "'AND'", "'OR'", "'MINUS'", "'='", 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DESCENDANTOF", "DESCENDANTORSELFOF", "CHILDOF", "ANCESTOF", "ANCESTORSELFOF", 
		"PARENTOF", "MEMBEROF", "COLON", "PLUS", "COMMA", "LPARAN", "RPARAN", 
		"LCBRACKET", "RCBRACKET", "CONJUNCTION", "DISJUNCTION", "EXCLUSION", "EQUAL", 
		"ANY", "TERM", "SCTID", "NUMBER", "STRING", "WS"
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


	public ECLExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ECLExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7\25"+
		"o\n\25\f\25\16\25r\13\25\3\25\3\25\3\25\7\25w\n\25\f\25\16\25z\13\25\3"+
		"\25\3\25\3\26\5\26\177\n\26\3\26\3\26\3\26\7\26\u0084\n\26\f\26\16\26"+
		"\u0087\13\26\3\27\3\27\5\27\u008b\n\27\3\27\3\27\7\27\u008f\n\27\f\27"+
		"\16\27\u0092\13\27\3\27\3\27\7\27\u0096\n\27\f\27\16\27\u0099\13\27\5"+
		"\27\u009b\n\27\3\27\3\27\5\27\u009f\n\27\3\27\3\27\3\27\3\27\6\27\u00a5"+
		"\n\27\r\27\16\27\u00a6\5\27\u00a9\n\27\3\30\3\30\3\30\7\30\u00ae\n\30"+
		"\f\30\16\30\u00b1\13\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00b9\n\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\u00af\2\36\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\32\3\2\5\4\2$$"+
		"^^\6\2\13\f\16\17\"\"~~\5\2\13\f\16\17\"\"\u00cf\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\29\3\2\2\2\3;\3\2\2"+
		"\2\5=\3\2\2\2\7@\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rH\3\2\2\2\17K\3\2\2\2"+
		"\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2"+
		"\2\35Y\3\2\2\2\37[\3\2\2\2!_\3\2\2\2#b\3\2\2\2%h\3\2\2\2\'j\3\2\2\2)l"+
		"\3\2\2\2+~\3\2\2\2-\u00a8\3\2\2\2/\u00aa\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba"+
		"\3\2\2\2\65\u00bc\3\2\2\2\67\u00be\3\2\2\29\u00c0\3\2\2\2;<\7>\2\2<\4"+
		"\3\2\2\2=>\7>\2\2>?\7>\2\2?\6\3\2\2\2@A\7>\2\2AB\7#\2\2B\b\3\2\2\2CD\7"+
		"@\2\2D\n\3\2\2\2EF\7@\2\2FG\7@\2\2G\f\3\2\2\2HI\7@\2\2IJ\7#\2\2J\16\3"+
		"\2\2\2KL\7`\2\2L\20\3\2\2\2MN\7<\2\2N\22\3\2\2\2OP\7-\2\2P\24\3\2\2\2"+
		"QR\7.\2\2R\26\3\2\2\2ST\7*\2\2T\30\3\2\2\2UV\7+\2\2V\32\3\2\2\2WX\7}\2"+
		"\2X\34\3\2\2\2YZ\7\177\2\2Z\36\3\2\2\2[\\\7C\2\2\\]\7P\2\2]^\7F\2\2^ "+
		"\3\2\2\2_`\7Q\2\2`a\7T\2\2a\"\3\2\2\2bc\7O\2\2cd\7K\2\2de\7P\2\2ef\7W"+
		"\2\2fg\7U\2\2g$\3\2\2\2hi\7?\2\2i&\3\2\2\2jk\7,\2\2k(\3\2\2\2lp\7~\2\2"+
		"mo\7\"\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2"+
		"sx\5\63\32\2tw\7\"\2\2uw\5\63\32\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7~\2\2|*\3\2\2\2}\177\7/\2\2~}\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085\5\67\34\2\u0081\u0084"+
		"\5\65\33\2\u0082\u0084\7/\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086,\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7%\2\2\u0089\u008b\7/\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\5\67"+
		"\34\2\u008d\u008f\5\65\33\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0097\7\60\2\2\u0094\u0096\5\65\33\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u00a9\3\2\2\2\u009c\u009e\7%\2\2\u009d\u009f\7/\2\2\u009e\u009d\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\62\2\2\u00a1"+
		"\u00a2\7\60\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\5\65\33\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u0088\3\2\2\2\u00a8\u009c\3\2\2\2\u00a9.\3\2\2\2"+
		"\u00aa\u00af\7$\2\2\u00ab\u00ae\5\61\31\2\u00ac\u00ae\n\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7$"+
		"\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\u00b9\7$\2\2\u00b6\u00b7"+
		"\7^\2\2\u00b7\u00b9\7^\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\62\3\2\2\2\u00ba\u00bb\n\3\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\4\62;\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\4\63;\2\u00bf8\3\2\2\2\u00c0\u00c1\t\4\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\b\35\2\2\u00c3:\3\2\2\2\23\2pvx~\u0083\u0085"+
		"\u008a\u0090\u0097\u009a\u009e\u00a6\u00a8\u00ad\u00af\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}