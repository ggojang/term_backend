// Generated from co/infoclinic/term/snomedct/expression/CGExpression.g4 by ANTLR 4.5
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
public class CGExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUIVALENT_TO=1, SUBTYPE_OF=2, LPARAN=3, RPARAN=4, COLON=5, PLUS=6, COMMA=7, 
		EQUAL=8, LCBRACKET=9, RCBRACKET=10, TERM=11, SCTID=12, NUMBER=13, STRING=14, 
		WS=15;
	public static final int
		RULE_statements = 0, RULE_statement = 1, RULE_expression = 2, RULE_definitionStatus = 3, 
		RULE_subExpression = 4, RULE_focusConcept = 5, RULE_conceptReference = 6, 
		RULE_refinement = 7, RULE_attributeGroup = 8, RULE_nonGroupedAttributeSet = 9, 
		RULE_attributeSet = 10, RULE_attribute = 11, RULE_attributeValue = 12, 
		RULE_nestedExpression = 13;
	public static final String[] ruleNames = {
		"statements", "statement", "expression", "definitionStatus", "subExpression", 
		"focusConcept", "conceptReference", "refinement", "attributeGroup", "nonGroupedAttributeSet", 
		"attributeSet", "attribute", "attributeValue", "nestedExpression"
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

	@Override
	public String getGrammarFileName() { return "CGExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CGExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			statement();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPARAN) {
				{
				{
				setState(29);
				statement();
				}
				}
				setState(34);
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
		public List<TerminalNode> LPARAN() { return getTokens(CGExpressionParser.LPARAN); }
		public TerminalNode LPARAN(int i) {
			return getToken(CGExpressionParser.LPARAN, i);
		}
		public List<SubExpressionContext> subExpression() {
			return getRuleContexts(SubExpressionContext.class);
		}
		public SubExpressionContext subExpression(int i) {
			return getRuleContext(SubExpressionContext.class,i);
		}
		public List<TerminalNode> RPARAN() { return getTokens(CGExpressionParser.RPARAN); }
		public TerminalNode RPARAN(int i) {
			return getToken(CGExpressionParser.RPARAN, i);
		}
		public DefinitionStatusContext definitionStatus() {
			return getRuleContext(DefinitionStatusContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LPARAN);
			setState(36);
			subExpression();
			setState(37);
			match(RPARAN);
			setState(38);
			definitionStatus();
			setState(39);
			match(LPARAN);
			setState(40);
			subExpression();
			setState(41);
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
		public DefinitionStatusContext definitionStatus() {
			return getRuleContext(DefinitionStatusContext.class,0);
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
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case EQUIVALENT_TO:
			case SUBTYPE_OF:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				definitionStatus();
				setState(44);
				subExpression();
				}
				break;
			case SCTID:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
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

	public static class DefinitionStatusContext extends ParserRuleContext {
		public TerminalNode EQUIVALENT_TO() { return getToken(CGExpressionParser.EQUIVALENT_TO, 0); }
		public TerminalNode SUBTYPE_OF() { return getToken(CGExpressionParser.SUBTYPE_OF, 0); }
		public DefinitionStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionStatus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterDefinitionStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitDefinitionStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitDefinitionStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionStatusContext definitionStatus() throws RecognitionException {
		DefinitionStatusContext _localctx = new DefinitionStatusContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definitionStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==EQUIVALENT_TO || _la==SUBTYPE_OF) ) {
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

	public static class SubExpressionContext extends ParserRuleContext {
		public FocusConceptContext focusConcept() {
			return getRuleContext(FocusConceptContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CGExpressionParser.COLON, 0); }
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			focusConcept();
			setState(54);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(52);
				match(COLON);
				setState(53);
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

	public static class FocusConceptContext extends ParserRuleContext {
		public List<ConceptReferenceContext> conceptReference() {
			return getRuleContexts(ConceptReferenceContext.class);
		}
		public ConceptReferenceContext conceptReference(int i) {
			return getRuleContext(ConceptReferenceContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CGExpressionParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CGExpressionParser.PLUS, i);
		}
		public FocusConceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusConcept; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterFocusConcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitFocusConcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitFocusConcept(this);
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
			setState(56);
			conceptReference();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(57);
				match(PLUS);
				setState(58);
				conceptReference();
				}
				}
				setState(63);
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
		public TerminalNode SCTID() { return getToken(CGExpressionParser.SCTID, 0); }
		public TerminalNode TERM() { return getToken(CGExpressionParser.TERM, 0); }
		public ConceptReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterConceptReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitConceptReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitConceptReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConceptReferenceContext conceptReference() throws RecognitionException {
		ConceptReferenceContext _localctx = new ConceptReferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conceptReference);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(SCTID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(SCTID);
				setState(66);
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
		public NonGroupedAttributeSetContext nonGroupedAttributeSet() {
			return getRuleContext(NonGroupedAttributeSetContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CGExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CGExpressionParser.COMMA, i);
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
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitRefinement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitRefinement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_refinement);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				nonGroupedAttributeSet();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(70);
					match(COMMA);
					setState(71);
					attributeGroup();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LCBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				attributeGroup();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					attributeGroup();
					}
					}
					setState(84);
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

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode LCBRACKET() { return getToken(CGExpressionParser.LCBRACKET, 0); }
		public AttributeSetContext attributeSet() {
			return getRuleContext(AttributeSetContext.class,0);
		}
		public TerminalNode RCBRACKET() { return getToken(CGExpressionParser.RCBRACKET, 0); }
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterAttributeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitAttributeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LCBRACKET);
			setState(88);
			attributeSet();
			setState(89);
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

	public static class NonGroupedAttributeSetContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CGExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CGExpressionParser.COMMA, i);
		}
		public NonGroupedAttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonGroupedAttributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterNonGroupedAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitNonGroupedAttributeSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitNonGroupedAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonGroupedAttributeSetContext nonGroupedAttributeSet() throws RecognitionException {
		NonGroupedAttributeSetContext _localctx = new NonGroupedAttributeSetContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonGroupedAttributeSet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			attribute();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(COMMA);
					setState(93);
					attribute();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(CGExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CGExpressionParser.COMMA, i);
		}
		public AttributeSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterAttributeSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitAttributeSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitAttributeSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSetContext attributeSet() throws RecognitionException {
		AttributeSetContext _localctx = new AttributeSetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			attribute();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				attribute();
				}
				}
				setState(106);
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
		public TerminalNode EQUAL() { return getToken(CGExpressionParser.EQUAL, 0); }
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
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((AttributeContext)_localctx).attributeType = conceptReference();
			setState(108);
			match(EQUAL);
			setState(109);
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
		public TerminalNode NUMBER() { return getToken(CGExpressionParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(CGExpressionParser.STRING, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributeValue);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case SCTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				conceptReference();
				}
				break;
			case LPARAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				nestedExpression();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(STRING);
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

	public static class NestedExpressionContext extends ParserRuleContext {
		public TerminalNode LPARAN() { return getToken(CGExpressionParser.LPARAN, 0); }
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(CGExpressionParser.RPARAN, 0); }
		public NestedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).enterNestedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CGExpressionListener ) ((CGExpressionListener)listener).exitNestedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGExpressionVisitor ) return ((CGExpressionVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedExpressionContext nestedExpression() throws RecognitionException {
		NestedExpressionContext _localctx = new NestedExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nestedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LPARAN);
			setState(118);
			subExpression();
			setState(119);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\5\69\n\6\3\7\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3\b\5\bF\n"+
		"\b\3\t\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\3\t\3\t\7\tS\n\t\f\t\16\tV"+
		"\13\t\5\tX\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13a\n\13\f\13\16\13d\13"+
		"\13\3\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16v\n\16\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\3\3\2\3\4z\2\36\3\2\2\2\4%\3\2\2\2\6\61\3\2\2\2\b\63"+
		"\3\2\2\2\n\65\3\2\2\2\f:\3\2\2\2\16E\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24"+
		"]\3\2\2\2\26e\3\2\2\2\30m\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36\"\5\4\3\2"+
		"\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\""+
		"\3\2\2\2%&\7\5\2\2&\'\5\n\6\2\'(\7\6\2\2()\5\b\5\2)*\7\5\2\2*+\5\n\6\2"+
		"+,\7\6\2\2,\5\3\2\2\2-.\5\b\5\2./\5\n\6\2/\62\3\2\2\2\60\62\5\n\6\2\61"+
		"-\3\2\2\2\61\60\3\2\2\2\62\7\3\2\2\2\63\64\t\2\2\2\64\t\3\2\2\2\658\5"+
		"\f\7\2\66\67\7\7\2\2\679\5\20\t\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:?"+
		"\5\16\b\2;<\7\b\2\2<>\5\16\b\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\r\3\2\2\2A?\3\2\2\2BF\7\16\2\2CD\7\16\2\2DF\7\r\2\2EB\3\2\2\2EC\3\2"+
		"\2\2F\17\3\2\2\2GL\5\24\13\2HI\7\t\2\2IK\5\22\n\2JH\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MX\3\2\2\2NL\3\2\2\2OT\5\22\n\2PQ\7\t\2\2QS\5\22\n"+
		"\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WG\3\2\2"+
		"\2WO\3\2\2\2X\21\3\2\2\2YZ\7\13\2\2Z[\5\26\f\2[\\\7\f\2\2\\\23\3\2\2\2"+
		"]b\5\30\r\2^_\7\t\2\2_a\5\30\r\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2c\25\3\2\2\2db\3\2\2\2ej\5\30\r\2fg\7\t\2\2gi\5\30\r\2hf\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2k\27\3\2\2\2lj\3\2\2\2mn\5\16\b\2no\7\n\2\2"+
		"op\5\32\16\2p\31\3\2\2\2qv\5\16\b\2rv\5\34\17\2sv\7\17\2\2tv\7\20\2\2"+
		"uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\7\5\2\2xy\5\n\6"+
		"\2yz\7\6\2\2z\35\3\2\2\2\r\"\618?ELTWbju";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}