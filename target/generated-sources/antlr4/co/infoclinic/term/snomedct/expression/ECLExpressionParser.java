// Generated from co/infoclinic/term/snomedct/expression/ECLExpression.g4 by ANTLR 4.5
package co.infoclinic.term.snomedct.expression;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ECLExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESCENDANTOF=1, DESCENDANTORSELFOF=2, CHILDOF=3, ANCESTOF=4, ANCESTORSELFOF=5, 
		PARENTOF=6, MEMBEROF=7, COLON=8, PLUS=9, COMMA=10, LPARAN=11, RPARAN=12, 
		LCBRACKET=13, RCBRACKET=14, CONJUNCTION=15, DISJUNCTION=16, EXCLUSION=17, 
		EQUAL=18, ANY=19, TERM=20, SCTID=21, NUMBER=22, STRING=23, WS=24;
	public static final int
		RULE_statments = 0, RULE_statement = 1, RULE_expression = 2, RULE_subExpression = 3, 
		RULE_nestedExpression = 4, RULE_focusConcept = 5, RULE_conceptReference = 6, 
		RULE_constraintOperator = 7, RULE_refinementOnly = 8, RULE_refinement = 9, 
		RULE_attributeOperator = 10, RULE_attributeGroup = 11, RULE_attributeNonGroup = 12, 
		RULE_attributeSet = 13, RULE_attribute = 14, RULE_attributeValue = 15;
	public static final String[] ruleNames = {
		"statments", "statement", "expression", "subExpression", "nestedExpression", 
		"focusConcept", "conceptReference", "constraintOperator", "refinementOnly", 
		"refinement", "attributeOperator", "attributeGroup", "attributeNonGroup", 
		"attributeSet", "attribute", "attributeValue"
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

	@Override
	public String getGrammarFileName() { return "ECLExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ECLExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatmentsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitStatments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitStatments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentsContext statments() throws RecognitionException {
		StatmentsContext _localctx = new StatmentsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			statement();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARAN) {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<TerminalNode> LPARAN() { return getTokens(ECLExpressionParser.LPARAN); }
		public TerminalNode LPARAN(int i) {
			return getToken(ECLExpressionParser.LPARAN, i);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> RPARAN() { return getTokens(ECLExpressionParser.RPARAN); }
		public TerminalNode RPARAN(int i) {
			return getToken(ECLExpressionParser.RPARAN, i);
		}
		public ConstraintOperatorContext constraintOperator() {
			return getRuleContext(ConstraintOperatorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(LPARAN);
			setState(40);
			subExpression();
			setState(41);
			match(RPARAN);
			setState(42);
			constraintOperator();
			setState(43);
			match(LPARAN);
			setState(44);
			subExpression();
			setState(45);
			match(RPARAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConstraintOperatorContext constraintOperator() {
			return getRuleContext(ConstraintOperatorContext.class,0);
		}
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case DESCENDANTOF:
			case DESCENDANTORSELFOF:
			case CHILDOF:
			case ANCESTOF:
			case ANCESTORSELFOF:
			case PARENTOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				constraintOperator();
				setState(48);
				subExpression();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				subExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubExpressionContext extends ParserRuleContext {
		public FocusConceptContext focusConcept() {
			return getRuleContext(FocusConceptContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ECLExpressionParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			focusConcept();
			setState(56);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(54);
				match(COLON);
				setState(55);
				refinement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedExpressionContext extends ParserRuleContext {
		public TerminalNode LPARAN() { return getToken(ECLExpressionParser.LPARAN, 0); }
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(ECLExpressionParser.RPARAN, 0); }
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterNestedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitNestedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LPARAN);
			setState(59);
			subExpression();
			setState(60);
			match(RPARAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FocusConceptContext extends ParserRuleContext {
		public List<ConceptReferenceContext> conceptReference() {
			return getRuleContexts(ConceptReferenceContext.class);
		}
		public ConceptReferenceContext conceptReference(int i) {
			return getRuleContext(ConceptReferenceContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ECLExpressionParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ECLExpressionParser.PLUS, i);
		}
		public FocusConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusConcept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterFocusConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitFocusConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitFocusConcept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FocusConceptContext focusConcept() throws RecognitionException {
		FocusConceptContext _localctx = new FocusConceptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_focusConcept);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			conceptReference();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(63);
				match(PLUS);
				setState(64);
				conceptReference();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConceptReferenceContext extends ParserRuleContext {
		public TerminalNode SCTID() { return getToken(ECLExpressionParser.SCTID, 0); }
		public TerminalNode TERM() { return getToken(ECLExpressionParser.TERM, 0); }
		public ConceptReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterConceptReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitConceptReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitConceptReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptReferenceContext conceptReference() throws RecognitionException {
		ConceptReferenceContext _localctx = new ConceptReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conceptReference);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(SCTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(SCTID);
				setState(72);
				match(TERM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintOperatorContext extends ParserRuleContext {
		public TerminalNode DESCENDANTOF() { return getToken(ECLExpressionParser.DESCENDANTOF, 0); }
		public TerminalNode DESCENDANTORSELFOF() { return getToken(ECLExpressionParser.DESCENDANTORSELFOF, 0); }
		public TerminalNode CHILDOF() { return getToken(ECLExpressionParser.CHILDOF, 0); }
		public TerminalNode ANCESTOF() { return getToken(ECLExpressionParser.ANCESTOF, 0); }
		public TerminalNode ANCESTORSELFOF() { return getToken(ECLExpressionParser.ANCESTORSELFOF, 0); }
		public TerminalNode PARENTOF() { return getToken(ECLExpressionParser.PARENTOF, 0); }
		public ConstraintOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterConstraintOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitConstraintOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitConstraintOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintOperatorContext constraintOperator() throws RecognitionException {
		ConstraintOperatorContext _localctx = new ConstraintOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constraintOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCENDANTOF) | (1L << DESCENDANTORSELFOF) | (1L << CHILDOF) | (1L << ANCESTOF) | (1L << ANCESTORSELFOF) | (1L << PARENTOF))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefinementOnlyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(ECLExpressionParser.ANY, 0); }
		public TerminalNode COLON() { return getToken(ECLExpressionParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public RefinementOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinementOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterRefinementOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitRefinementOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitRefinementOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementOnlyContext refinementOnly() throws RecognitionException {
		RefinementOnlyContext _localctx = new RefinementOnlyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_refinementOnly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ANY);
			setState(80);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(78);
				match(COLON);
				setState(79);
				refinement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefinementContext extends ParserRuleContext {
		public AttributeNonGroupContext attributeNonGroup() {
			return getRuleContext(AttributeNonGroupContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ECLExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ECLExpressionParser.COMMA, i);
		}
		public List<AttributeGroupContext> attributeGroup() {
			return getRuleContexts(AttributeGroupContext.class);
		}
		public AttributeGroupContext attributeGroup(int i) {
			return getRuleContext(AttributeGroupContext.class,i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitRefinement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refinement);
		int _la;
		try {
			setState(98);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				attributeNonGroup();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					match(COMMA);
					setState(84);
					attributeGroup();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LCBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				attributeGroup();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					setState(92);
					attributeGroup();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeOperatorContext extends ParserRuleContext {
		public TerminalNode DESCENDANTOF() { return getToken(ECLExpressionParser.DESCENDANTOF, 0); }
		public TerminalNode DESCENDANTORSELFOF() { return getToken(ECLExpressionParser.DESCENDANTORSELFOF, 0); }
		public AttributeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttributeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttributeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttributeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOperatorContext attributeOperator() throws RecognitionException {
		AttributeOperatorContext _localctx = new AttributeOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==DESCENDANTOF || _la==DESCENDANTORSELFOF) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode LCBRACKET() { return getToken(ECLExpressionParser.LCBRACKET, 0); }
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(ECLExpressionParser.RCBRACKET, 0); }
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttributeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttributeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LCBRACKET);
			setState(103);
			attributeSet();
			setState(104);
			match(RCBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNonGroupContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ECLExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ECLExpressionParser.COMMA, i);
		}
		public AttributeNonGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNonGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttributeNonGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttributeNonGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttributeNonGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNonGroupContext attributeNonGroup() throws RecognitionException {
		AttributeNonGroupContext _localctx = new AttributeNonGroupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeNonGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			attribute();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(COMMA);
					setState(108);
					attribute();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeSetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ECLExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ECLExpressionParser.COMMA, i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttributeSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			attribute();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				attribute();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public ConceptReferenceContext attributeType;
		public TerminalNode EQUAL() { return getToken(ECLExpressionParser.EQUAL, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((AttributeContext)_localctx).attributeType = conceptReference();
			setState(123);
			match(EQUAL);
			setState(124);
			attributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeValueContext extends ParserRuleContext {
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public NestedExpressionContext nestedExpression() {
			return getRuleContext(NestedExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ECLExpressionParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ECLExpressionParser.NUMBER, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECLExpressionListener ) ((ECLExpressionListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECLExpressionVisitor ) return ((ECLExpressionVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeValue);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				conceptReference();
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				nestedExpression();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\7\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7D\n"+
		"\7\f\7\16\7G\13\7\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\3\n\5\nS\n\n\3"+
		"\13\3\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\13\3\13\3\13\7\13`\n\13\f"+
		"\13\16\13c\13\13\5\13e\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"p\n\16\f\16\16\16s\13\16\3\17\3\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u0085\n\21\3\21\2\2\22\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\3\b\3\2\3\4\u0084\2\"\3\2"+
		"\2\2\4)\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n<\3\2\2\2\f@\3\2\2\2\16K\3"+
		"\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24d\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2\32"+
		"l\3\2\2\2\34t\3\2\2\2\36|\3\2\2\2 \u0084\3\2\2\2\"&\5\4\3\2#%\5\4\3\2"+
		"$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7\r"+
		"\2\2*+\5\b\5\2+,\7\16\2\2,-\5\20\t\2-.\7\r\2\2./\5\b\5\2/\60\7\16\2\2"+
		"\60\5\3\2\2\2\61\62\5\20\t\2\62\63\5\b\5\2\63\66\3\2\2\2\64\66\5\b\5\2"+
		"\65\61\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67:\5\f\7\289\7\n\2\29;\5\24"+
		"\13\2:8\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<=\7\r\2\2=>\5\b\5\2>?\7\16\2\2?\13"+
		"\3\2\2\2@E\5\16\b\2AB\7\13\2\2BD\5\16\b\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2F\r\3\2\2\2GE\3\2\2\2HL\7\27\2\2IJ\7\27\2\2JL\7\26\2\2KH\3"+
		"\2\2\2KI\3\2\2\2L\17\3\2\2\2MN\t\2\2\2N\21\3\2\2\2OR\7\25\2\2PQ\7\n\2"+
		"\2QS\5\24\13\2RP\3\2\2\2RS\3\2\2\2S\23\3\2\2\2TY\5\32\16\2UV\7\f\2\2V"+
		"X\5\30\r\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Ze\3\2\2\2[Y\3\2\2\2"+
		"\\a\5\30\r\2]^\7\f\2\2^`\5\30\r\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2be\3\2\2\2ca\3\2\2\2dT\3\2\2\2d\\\3\2\2\2e\25\3\2\2\2fg\t\3\2\2g\27"+
		"\3\2\2\2hi\7\17\2\2ij\5\34\17\2jk\7\20\2\2k\31\3\2\2\2lq\5\36\20\2mn\7"+
		"\f\2\2np\5\36\20\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\33\3\2\2\2"+
		"sq\3\2\2\2ty\5\36\20\2uv\7\f\2\2vx\5\36\20\2wu\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\35\3\2\2\2{y\3\2\2\2|}\5\16\b\2}~\7\24\2\2~\177\5 \21"+
		"\2\177\37\3\2\2\2\u0080\u0085\5\16\b\2\u0081\u0085\5\n\6\2\u0082\u0085"+
		"\7\31\2\2\u0083\u0085\7\30\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085!\3\2\2\2\16&\65:EKRYad"+
		"qy\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}