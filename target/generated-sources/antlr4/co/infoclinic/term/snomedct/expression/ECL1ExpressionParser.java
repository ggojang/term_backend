// Generated from co/infoclinic/term/snomedct/expression/ECL1Expression.g4 by ANTLR 4.5
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
public class ECL1ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESCENDANTOF=1, DESCENDANTORSELFOF=2, CHILDOF=3, ANCESTOF=4, ANCESTORSELFOF=5, 
		PARENTOF=6, MEMBEROF=7, COLON=8, PLUS=9, COMMA=10, LPARAN=11, RPARAN=12, 
		LCBRACKET=13, RCBRACKET=14, CONJUNCTION=15, DISJUNCTION=16, EXCLUSION=17, 
		EQUAL=18, NOTEQUAL=19, LESSOREQUAL=20, GREATEROREQUAL=21, ANY=22, TERM=23, 
		SCTID=24, NUMBER=25, STRING=26, WS=27;
	public static final int
		RULE_expression = 0, RULE_refinementExpression = 1, RULE_conjunctionExpression = 2, 
		RULE_disjunctionExpression = 3, RULE_exclusionExpression = 4, RULE_simpleExpression = 5, 
		RULE_focusConcept = 6, RULE_constraintOperator = 7, RULE_conceptReference = 8, 
		RULE_refinement = 9, RULE_attributeGroup = 10, RULE_attributeSet = 11, 
		RULE_attributeOperator = 12, RULE_attribute = 13, RULE_attributeName = 14, 
		RULE_attributeValue = 15, RULE_compoundAttributevalue = 16, RULE_exclusionAttributevalue = 17, 
		RULE_stringOperator = 18, RULE_numberOperator = 19, RULE_expressionOperator = 20;
	public static final String[] ruleNames = {
		"expression", "refinementExpression", "conjunctionExpression", "disjunctionExpression", 
		"exclusionExpression", "simpleExpression", "focusConcept", "constraintOperator", 
		"conceptReference", "refinement", "attributeGroup", "attributeSet", "attributeOperator", 
		"attribute", "attributeName", "attributeValue", "compoundAttributevalue", 
		"exclusionAttributevalue", "stringOperator", "numberOperator", "expressionOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'<<'", "'<!'", "'>'", "'>>'", "'>!'", "'^'", "':'", "'+'", 
		"','", "'('", "')'", "'{'", "'}'", "'AND'", "'OR'", "'MINUS'", "'='", 
		"'!='", "'<='", "'>='", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DESCENDANTOF", "DESCENDANTORSELFOF", "CHILDOF", "ANCESTOF", "ANCESTORSELFOF", 
		"PARENTOF", "MEMBEROF", "COLON", "PLUS", "COMMA", "LPARAN", "RPARAN", 
		"LCBRACKET", "RCBRACKET", "CONJUNCTION", "DISJUNCTION", "EXCLUSION", "EQUAL", 
		"NOTEQUAL", "LESSOREQUAL", "GREATEROREQUAL", "ANY", "TERM", "SCTID", "NUMBER", 
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

	@Override
	public String getGrammarFileName() { return "ECL1Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ECL1ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public ConjunctionExpressionContext conjunctionExpression() {
			return getRuleContext(ConjunctionExpressionContext.class,0);
		}
		public DisjunctionExpressionContext disjunctionExpression() {
			return getRuleContext(DisjunctionExpressionContext.class,0);
		}
		public ExclusionExpressionContext exclusionExpression() {
			return getRuleContext(ExclusionExpressionContext.class,0);
		}
		public RefinementExpressionContext refinementExpression() {
			return getRuleContext(RefinementExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				simpleExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				conjunctionExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				disjunctionExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				exclusionExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				refinementExpression();
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

	public static class RefinementExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ECL1ExpressionParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public RefinementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterRefinementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitRefinementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitRefinementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementExpressionContext refinementExpression() throws RecognitionException {
		RefinementExpressionContext _localctx = new RefinementExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_refinementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			simpleExpression();
			setState(50);
			match(COLON);
			setState(51);
			refinement();
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

	public static class ConjunctionExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(ECL1ExpressionParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(ECL1ExpressionParser.CONJUNCTION, i);
		}
		public ConjunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitConjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionExpressionContext conjunctionExpression() throws RecognitionException {
		ConjunctionExpressionContext _localctx = new ConjunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conjunctionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			simpleExpression();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONJUNCTION) {
				{
				{
				setState(54);
				match(CONJUNCTION);
				setState(55);
				simpleExpression();
				}
				}
				setState(60);
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

	public static class DisjunctionExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> DISJUNCTION() { return getTokens(ECL1ExpressionParser.DISJUNCTION); }
		public TerminalNode DISJUNCTION(int i) {
			return getToken(ECL1ExpressionParser.DISJUNCTION, i);
		}
		public DisjunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterDisjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitDisjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitDisjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionExpressionContext disjunctionExpression() throws RecognitionException {
		DisjunctionExpressionContext _localctx = new DisjunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_disjunctionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			simpleExpression();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISJUNCTION) {
				{
				{
				setState(62);
				match(DISJUNCTION);
				setState(63);
				simpleExpression();
				}
				}
				setState(68);
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

	public static class ExclusionExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EXCLUSION() { return getTokens(ECL1ExpressionParser.EXCLUSION); }
		public TerminalNode EXCLUSION(int i) {
			return getToken(ECL1ExpressionParser.EXCLUSION, i);
		}
		public ExclusionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterExclusionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitExclusionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitExclusionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusionExpressionContext exclusionExpression() throws RecognitionException {
		ExclusionExpressionContext _localctx = new ExclusionExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exclusionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			simpleExpression();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLUSION) {
				{
				{
				setState(70);
				match(EXCLUSION);
				setState(71);
				simpleExpression();
				}
				}
				setState(76);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public FocusConceptContext focusConcept() {
			return getRuleContext(FocusConceptContext.class,0);
		}
		public ConstraintOperatorContext constraintOperator() {
			return getRuleContext(ConstraintOperatorContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleExpression);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case MEMBEROF:
			case ANY:
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				focusConcept();
				}
				break;
			case DESCENDANTOF:
			case DESCENDANTORSELFOF:
			case CHILDOF:
			case ANCESTOF:
			case ANCESTORSELFOF:
			case PARENTOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				constraintOperator();
				setState(79);
				focusConcept();
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

	public static class FocusConceptContext extends ParserRuleContext {
		public TerminalNode MEMBEROF() { return getToken(ECL1ExpressionParser.MEMBEROF, 0); }
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public TerminalNode ANY() { return getToken(ECL1ExpressionParser.ANY, 0); }
		public FocusConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusConcept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterFocusConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitFocusConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitFocusConcept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FocusConceptContext focusConcept() throws RecognitionException {
		FocusConceptContext _localctx = new FocusConceptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_focusConcept);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case MEMBEROF:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(MEMBEROF);
				setState(84);
				conceptReference();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				conceptReference();
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(ANY);
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

	public static class ConstraintOperatorContext extends ParserRuleContext {
		public TerminalNode DESCENDANTOF() { return getToken(ECL1ExpressionParser.DESCENDANTOF, 0); }
		public TerminalNode DESCENDANTORSELFOF() { return getToken(ECL1ExpressionParser.DESCENDANTORSELFOF, 0); }
		public TerminalNode CHILDOF() { return getToken(ECL1ExpressionParser.CHILDOF, 0); }
		public TerminalNode ANCESTOF() { return getToken(ECL1ExpressionParser.ANCESTOF, 0); }
		public TerminalNode ANCESTORSELFOF() { return getToken(ECL1ExpressionParser.ANCESTORSELFOF, 0); }
		public TerminalNode PARENTOF() { return getToken(ECL1ExpressionParser.PARENTOF, 0); }
		public ConstraintOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterConstraintOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitConstraintOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitConstraintOperator(this);
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
			setState(89);
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

	public static class ConceptReferenceContext extends ParserRuleContext {
		public TerminalNode SCTID() { return getToken(ECL1ExpressionParser.SCTID, 0); }
		public TerminalNode TERM() { return getToken(ECL1ExpressionParser.TERM, 0); }
		public ConceptReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterConceptReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitConceptReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitConceptReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptReferenceContext conceptReference() throws RecognitionException {
		ConceptReferenceContext _localctx = new ConceptReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conceptReference);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(SCTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(SCTID);
				setState(93);
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

	public static class RefinementContext extends ParserRuleContext {
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ECL1ExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ECL1ExpressionParser.COMMA, i);
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
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitRefinement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refinement);
		int _la;
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				attributeSet();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				attributeSet();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					attributeGroup();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				attributeGroup();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(106);
					match(COMMA);
					setState(107);
					attributeGroup();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode LCBRACKET() { return getToken(ECL1ExpressionParser.LCBRACKET, 0); }
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(ECL1ExpressionParser.RCBRACKET, 0); }
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttributeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttributeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LCBRACKET);
			setState(116);
			attributeSet();
			setState(117);
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

	public static class AttributeSetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ECL1ExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ECL1ExpressionParser.COMMA, i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttributeSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeSet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			attribute();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					attribute();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AttributeOperatorContext extends ParserRuleContext {
		public TerminalNode DESCENDANTOF() { return getToken(ECL1ExpressionParser.DESCENDANTOF, 0); }
		public TerminalNode DESCENDANTORSELFOF() { return getToken(ECL1ExpressionParser.DESCENDANTORSELFOF, 0); }
		public AttributeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttributeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttributeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttributeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOperatorContext attributeOperator() throws RecognitionException {
		AttributeOperatorContext _localctx = new AttributeOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeType;
		public TerminalNode EQUAL() { return getToken(ECL1ExpressionParser.EQUAL, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeOperatorContext attributeOperator() {
			return getRuleContext(AttributeOperatorContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case ANY:
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((AttributeContext)_localctx).attributeType = attributeName();
				setState(130);
				match(EQUAL);
				setState(131);
				attributeValue();
				}
				break;
			case DESCENDANTOF:
			case DESCENDANTORSELFOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				attributeOperator();
				setState(134);
				attributeName();
				setState(135);
				match(EQUAL);
				setState(136);
				attributeValue();
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

	public static class AttributeNameContext extends ParserRuleContext {
		public ConceptReferenceContext conceptReference() {
			return getRuleContext(ConceptReferenceContext.class,0);
		}
		public TerminalNode ANY() { return getToken(ECL1ExpressionParser.ANY, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeName);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				conceptReference();
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ANY);
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

	public static class AttributeValueContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public CompoundAttributevalueContext compoundAttributevalue() {
			return getRuleContext(CompoundAttributevalueContext.class,0);
		}
		public ExclusionAttributevalueContext exclusionAttributevalue() {
			return getRuleContext(ExclusionAttributevalueContext.class,0);
		}
		public StringOperatorContext stringOperator() {
			return getRuleContext(StringOperatorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ECL1ExpressionParser.STRING, 0); }
		public NumberOperatorContext numberOperator() {
			return getRuleContext(NumberOperatorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ECL1ExpressionParser.NUMBER, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeValue);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				simpleExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				compoundAttributevalue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				exclusionAttributevalue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(147);
				stringOperator();
				setState(148);
				match(STRING);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(150);
				numberOperator();
				setState(151);
				match(NUMBER);
				}
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

	public static class CompoundAttributevalueContext extends ParserRuleContext {
		public TerminalNode LPARAN() { return getToken(ECL1ExpressionParser.LPARAN, 0); }
		public TerminalNode RPARAN() { return getToken(ECL1ExpressionParser.RPARAN, 0); }
		public ConjunctionExpressionContext conjunctionExpression() {
			return getRuleContext(ConjunctionExpressionContext.class,0);
		}
		public DisjunctionExpressionContext disjunctionExpression() {
			return getRuleContext(DisjunctionExpressionContext.class,0);
		}
		public CompoundAttributevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAttributevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterCompoundAttributevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitCompoundAttributevalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitCompoundAttributevalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAttributevalueContext compoundAttributevalue() throws RecognitionException {
		CompoundAttributevalueContext _localctx = new CompoundAttributevalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compoundAttributevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LPARAN);
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(156);
				conjunctionExpression();
				}
				break;
			case 2:
				{
				setState(157);
				disjunctionExpression();
				}
				break;
			}
			setState(160);
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

	public static class ExclusionAttributevalueContext extends ParserRuleContext {
		public TerminalNode LPARAN() { return getToken(ECL1ExpressionParser.LPARAN, 0); }
		public CompoundAttributevalueContext compoundAttributevalue() {
			return getRuleContext(CompoundAttributevalueContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(ECL1ExpressionParser.RPARAN, 0); }
		public List<TerminalNode> EXCLUSION() { return getTokens(ECL1ExpressionParser.EXCLUSION); }
		public TerminalNode EXCLUSION(int i) {
			return getToken(ECL1ExpressionParser.EXCLUSION, i);
		}
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public ExclusionAttributevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusionAttributevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterExclusionAttributevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitExclusionAttributevalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitExclusionAttributevalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusionAttributevalueContext exclusionAttributevalue() throws RecognitionException {
		ExclusionAttributevalueContext _localctx = new ExclusionAttributevalueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exclusionAttributevalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LPARAN);
			setState(163);
			compoundAttributevalue();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXCLUSION) {
				{
				{
				setState(164);
				match(EXCLUSION);
				setState(165);
				simpleExpression();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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

	public static class StringOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ECL1ExpressionParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ECL1ExpressionParser.NOTEQUAL, 0); }
		public StringOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterStringOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitStringOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitStringOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringOperatorContext stringOperator() throws RecognitionException {
		StringOperatorContext _localctx = new StringOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static class NumberOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ECL1ExpressionParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ECL1ExpressionParser.NOTEQUAL, 0); }
		public TerminalNode LESSOREQUAL() { return getToken(ECL1ExpressionParser.LESSOREQUAL, 0); }
		public TerminalNode GREATEROREQUAL() { return getToken(ECL1ExpressionParser.GREATEROREQUAL, 0); }
		public TerminalNode DESCENDANTOF() { return getToken(ECL1ExpressionParser.DESCENDANTOF, 0); }
		public TerminalNode ANCESTOF() { return getToken(ECL1ExpressionParser.ANCESTOF, 0); }
		public NumberOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterNumberOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitNumberOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitNumberOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberOperatorContext numberOperator() throws RecognitionException {
		NumberOperatorContext _localctx = new NumberOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_numberOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DESCENDANTOF) | (1L << ANCESTOF) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSOREQUAL) | (1L << GREATEROREQUAL))) != 0)) ) {
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

	public static class ExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ECL1ExpressionParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ECL1ExpressionParser.NOTEQUAL, 0); }
		public ExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).enterExpressionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ECL1ExpressionListener ) ((ECL1ExpressionListener)listener).exitExpressionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ECL1ExpressionVisitor ) return ((ECL1ExpressionVisitor<? extends T>)visitor).visitExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionOperatorContext expressionOperator() throws RecognitionException {
		ExpressionOperatorContext _localctx = new ExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\5\2\62\n"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\5\7\5"+
		"C\n\5\f\5\16\5F\13\5\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3"+
		"\7\5\7T\n\7\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\n\3\n\3\n\5\na\n\n\3\13"+
		"\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\13\7\13o\n\13"+
		"\f\13\16\13r\13\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r}\n\r\f\r"+
		"\16\r\u0080\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u008d\n\17\3\20\3\20\5\20\u0091\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u009c\n\21\3\22\3\22\3\22\5\22\u00a1\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\7\23\u00a9\n\23\f\23\16\23\u00ac\13\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\6\3\2\3\b\3\2\3\4\3\2\24\25\5\2\3\3\6\6\24\27"+
		"\u00b8\2\61\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b?\3\2\2\2\nG\3\2\2\2\f"+
		"S\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22`\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2"+
		"\30y\3\2\2\2\32\u0081\3\2\2\2\34\u008c\3\2\2\2\36\u0090\3\2\2\2 \u009b"+
		"\3\2\2\2\"\u009d\3\2\2\2$\u00a4\3\2\2\2&\u00af\3\2\2\2(\u00b1\3\2\2\2"+
		"*\u00b3\3\2\2\2,\62\5\f\7\2-\62\5\6\4\2.\62\5\b\5\2/\62\5\n\6\2\60\62"+
		"\5\4\3\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2"+
		"\62\3\3\2\2\2\63\64\5\f\7\2\64\65\7\n\2\2\65\66\5\24\13\2\66\5\3\2\2\2"+
		"\67<\5\f\7\289\7\21\2\29;\5\f\7\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=\7\3\2\2\2><\3\2\2\2?D\5\f\7\2@A\7\22\2\2AC\5\f\7\2B@\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\t\3\2\2\2FD\3\2\2\2GL\5\f\7\2HI\7\23\2\2I"+
		"K\5\f\7\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NL\3\2\2"+
		"\2OT\5\16\b\2PQ\5\20\t\2QR\5\16\b\2RT\3\2\2\2SO\3\2\2\2SP\3\2\2\2T\r\3"+
		"\2\2\2UV\7\t\2\2VZ\5\22\n\2WZ\5\22\n\2XZ\7\30\2\2YU\3\2\2\2YW\3\2\2\2"+
		"YX\3\2\2\2Z\17\3\2\2\2[\\\t\2\2\2\\\21\3\2\2\2]a\7\32\2\2^_\7\32\2\2_"+
		"a\7\31\2\2`]\3\2\2\2`^\3\2\2\2a\23\3\2\2\2bt\5\30\r\2ch\5\30\r\2de\7\f"+
		"\2\2eg\5\26\f\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2it\3\2\2\2jh\3"+
		"\2\2\2kp\5\26\f\2lm\7\f\2\2mo\5\26\f\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2p"+
		"q\3\2\2\2qt\3\2\2\2rp\3\2\2\2sb\3\2\2\2sc\3\2\2\2sk\3\2\2\2t\25\3\2\2"+
		"\2uv\7\17\2\2vw\5\30\r\2wx\7\20\2\2x\27\3\2\2\2y~\5\34\17\2z{\7\f\2\2"+
		"{}\5\34\17\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\3\2\2\u0082\33\3\2\2\2\u0083\u0084"+
		"\5\36\20\2\u0084\u0085\7\24\2\2\u0085\u0086\5 \21\2\u0086\u008d\3\2\2"+
		"\2\u0087\u0088\5\32\16\2\u0088\u0089\5\36\20\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008b\5 \21\2\u008b\u008d\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0087\3\2"+
		"\2\2\u008d\35\3\2\2\2\u008e\u0091\5\22\n\2\u008f\u0091\7\30\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\37\3\2\2\2\u0092\u009c\5\f\7"+
		"\2\u0093\u009c\5\"\22\2\u0094\u009c\5$\23\2\u0095\u0096\5&\24\2\u0096"+
		"\u0097\7\34\2\2\u0097\u009c\3\2\2\2\u0098\u0099\5(\25\2\u0099\u009a\7"+
		"\33\2\2\u009a\u009c\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b"+
		"\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c!\3\2\2\2"+
		"\u009d\u00a0\7\r\2\2\u009e\u00a1\5\6\4\2\u009f\u00a1\5\b\5\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\16\2\2"+
		"\u00a3#\3\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00aa\5\"\22\2\u00a6\u00a7\7"+
		"\23\2\2\u00a7\u00a9\5\f\7\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\16\2\2\u00ae%\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0\'\3"+
		"\2\2\2\u00b1\u00b2\t\5\2\2\u00b2)\3\2\2\2\u00b3\u00b4\t\4\2\2\u00b4+\3"+
		"\2\2\2\22\61<DLSY`hps~\u008c\u0090\u009b\u00a0\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}