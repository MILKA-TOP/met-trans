// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab4/src/main/kotlin\CustomGrammarExpression.g4 by ANTLR 4.10.1
package custom;

import models.GrammarData;
import models.TerminalState;
import models.NonTerminalState;
import models.RuleTarget;
import models.NonTerminalTarget;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CustomGrammarExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INPUT=2, ALPS=3, WS=4, EQUAL=5, LINE_END=6, DOUBLE_POINT=7, VERT=8, 
		ARROW=9, PARAM_LEFT=10, PARAM_RIGHT=11, FUNCTION_LEFT=12, FUNCTION_RIGHT=13, 
		SPEC_LEFT=14, SPEC_RIGHT=15, VAR=16, HEADER=17, TERMINAL_NAME=18, NON_TERMINAL_NAME=19, 
		GRAMMAR_NAME=20, FUNCTION_PARAMETER=21, FUNCTION_CODE=22;
	public static final int
		RULE_read = 0, RULE_grammarName = 1, RULE_grammarNodeValue = 2, RULE_grammarHeader = 3, 
		RULE_grammarTokens = 4, RULE_grammarNonTerminal = 5, RULE_allTargets = 6, 
		RULE_targets = 7, RULE_targetsPoint = 8, RULE_element = 9, RULE_targetCode = 10, 
		RULE_terminalVariable = 11, RULE_grammarTerminal = 12, RULE_terminalParameter = 13, 
		RULE_functionCode = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"read", "grammarName", "grammarNodeValue", "grammarHeader", "grammarTokens", 
			"grammarNonTerminal", "allTargets", "targets", "targetsPoint", "element", 
			"targetCode", "terminalVariable", "grammarTerminal", "terminalParameter", 
			"functionCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar '", null, null, null, "'='", "';'", "':'", "'|'", "'->'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'", "'var'", "'@header'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INPUT", "ALPS", "WS", "EQUAL", "LINE_END", "DOUBLE_POINT", 
			"VERT", "ARROW", "PARAM_LEFT", "PARAM_RIGHT", "FUNCTION_LEFT", "FUNCTION_RIGHT", 
			"SPEC_LEFT", "SPEC_RIGHT", "VAR", "HEADER", "TERMINAL_NAME", "NON_TERMINAL_NAME", 
			"GRAMMAR_NAME", "FUNCTION_PARAMETER", "FUNCTION_CODE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CustomGrammarExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	GrammarData grammarMember = new GrammarData();

	public CustomGrammarExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReadContext extends ParserRuleContext {
		public GrammarData data;
		public GrammarNameContext resName;
		public GrammarHeaderContext resHeader;
		public GrammarNodeValueContext grammarNodeValue() {
			return getRuleContext(GrammarNodeValueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CustomGrammarExpressionParser.EOF, 0); }
		public GrammarNameContext grammarName() {
			return getRuleContext(GrammarNameContext.class,0);
		}
		public List<GrammarTokensContext> grammarTokens() {
			return getRuleContexts(GrammarTokensContext.class);
		}
		public GrammarTokensContext grammarTokens(int i) {
			return getRuleContext(GrammarTokensContext.class,i);
		}
		public GrammarHeaderContext grammarHeader() {
			return getRuleContext(GrammarHeaderContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_read);

		    ((ReadContext)_localctx).data =  new GrammarData();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ReadContext)_localctx).resName = grammarName();
			_localctx.data.setName(((ReadContext)_localctx).resName.resName);
			setState(32);
			grammarNodeValue(_localctx.data);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(33);
				((ReadContext)_localctx).resHeader = grammarHeader(_localctx.data);
				}
			}

			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINAL_NAME || _la==NON_TERMINAL_NAME) {
				{
				{
				setState(36);
				grammarTokens(_localctx.data);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			_localctx.data.getTerminalList().add(new TerminalState("EPS", "_EPS_"));
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

	public static class GrammarNameContext extends ParserRuleContext {
		public String resName;
		public Token GRAMMAR_NAME;
		public TerminalNode GRAMMAR_NAME() { return getToken(CustomGrammarExpressionParser.GRAMMAR_NAME, 0); }
		public TerminalNode LINE_END() { return getToken(CustomGrammarExpressionParser.LINE_END, 0); }
		public GrammarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNameContext grammarName() throws RecognitionException {
		GrammarNameContext _localctx = new GrammarNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			((GrammarNameContext)_localctx).GRAMMAR_NAME = match(GRAMMAR_NAME);
			setState(47);
			match(LINE_END);
			((GrammarNameContext)_localctx).resName =  (((GrammarNameContext)_localctx).GRAMMAR_NAME!=null?((GrammarNameContext)_localctx).GRAMMAR_NAME.getText():null);
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

	public static class GrammarNodeValueContext extends ParserRuleContext {
		public GrammarData data;
		public Token typeVal;
		public Token defVal;
		public TerminalNode SPEC_LEFT() { return getToken(CustomGrammarExpressionParser.SPEC_LEFT, 0); }
		public TerminalNode VERT() { return getToken(CustomGrammarExpressionParser.VERT, 0); }
		public TerminalNode SPEC_RIGHT() { return getToken(CustomGrammarExpressionParser.SPEC_RIGHT, 0); }
		public List<TerminalNode> INPUT() { return getTokens(CustomGrammarExpressionParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(CustomGrammarExpressionParser.INPUT, i);
		}
		public GrammarNodeValueContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarNodeValueContext(ParserRuleContext parent, int invokingState, GrammarData data) {
			super(parent, invokingState);
			this.data = data;
		}
		@Override public int getRuleIndex() { return RULE_grammarNodeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarNodeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarNodeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarNodeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNodeValueContext grammarNodeValue(GrammarData data) throws RecognitionException {
		GrammarNodeValueContext _localctx = new GrammarNodeValueContext(_ctx, getState(), data);
		enterRule(_localctx, 4, RULE_grammarNodeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(SPEC_LEFT);
			setState(51);
			((GrammarNodeValueContext)_localctx).typeVal = match(INPUT);
			setState(52);
			match(VERT);
			setState(53);
			((GrammarNodeValueContext)_localctx).defVal = match(INPUT);
			setState(54);
			match(SPEC_RIGHT);

			    String typeValeText = (((GrammarNodeValueContext)_localctx).typeVal!=null?((GrammarNodeValueContext)_localctx).typeVal.getText():null);
			    String defValText = (((GrammarNodeValueContext)_localctx).defVal!=null?((GrammarNodeValueContext)_localctx).defVal.getText():null);
			    _localctx.data.setDefaultType(typeValeText.substring(1, typeValeText.length() - 1));
			    _localctx.data.setDefaultArg(defValText.substring(1, defValText.length() - 1));

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

	public static class GrammarHeaderContext extends ParserRuleContext {
		public GrammarData data;
		public FunctionCodeContext codeData;
		public TerminalNode HEADER() { return getToken(CustomGrammarExpressionParser.HEADER, 0); }
		public FunctionCodeContext functionCode() {
			return getRuleContext(FunctionCodeContext.class,0);
		}
		public GrammarHeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarHeaderContext(ParserRuleContext parent, int invokingState, GrammarData data) {
			super(parent, invokingState);
			this.data = data;
		}
		@Override public int getRuleIndex() { return RULE_grammarHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarHeaderContext grammarHeader(GrammarData data) throws RecognitionException {
		GrammarHeaderContext _localctx = new GrammarHeaderContext(_ctx, getState(), data);
		enterRule(_localctx, 6, RULE_grammarHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(HEADER);
			setState(58);
			((GrammarHeaderContext)_localctx).codeData = functionCode();
			_localctx.data.setHeader(((GrammarHeaderContext)_localctx).codeData.codeData);
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

	public static class GrammarTokensContext extends ParserRuleContext {
		public GrammarData data;
		public GrammarTerminalContext term;
		public GrammarNonTerminalContext nonTerm;
		public TerminalNode LINE_END() { return getToken(CustomGrammarExpressionParser.LINE_END, 0); }
		public GrammarTerminalContext grammarTerminal() {
			return getRuleContext(GrammarTerminalContext.class,0);
		}
		public GrammarNonTerminalContext grammarNonTerminal() {
			return getRuleContext(GrammarNonTerminalContext.class,0);
		}
		public GrammarTokensContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarTokensContext(ParserRuleContext parent, int invokingState, GrammarData data) {
			super(parent, invokingState);
			this.data = data;
		}
		@Override public int getRuleIndex() { return RULE_grammarTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTokensContext grammarTokens(GrammarData data) throws RecognitionException {
		GrammarTokensContext _localctx = new GrammarTokensContext(_ctx, getState(), data);
		enterRule(_localctx, 8, RULE_grammarTokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINAL_NAME:
				{
				setState(61);
				((GrammarTokensContext)_localctx).term = grammarTerminal();
				_localctx.data.getTerminalList().add(((GrammarTokensContext)_localctx).term.state);
				}
				break;
			case NON_TERMINAL_NAME:
				{
				setState(64);
				((GrammarTokensContext)_localctx).nonTerm = grammarNonTerminal();
				_localctx.data.getNonTerminalList().add(((GrammarTokensContext)_localctx).nonTerm.state);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
			match(LINE_END);
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

	public static class GrammarNonTerminalContext extends ParserRuleContext {
		public NonTerminalState state;
		public Token NON_TERMINAL_NAME;
		public TerminalNode NON_TERMINAL_NAME() { return getToken(CustomGrammarExpressionParser.NON_TERMINAL_NAME, 0); }
		public TerminalNode DOUBLE_POINT() { return getToken(CustomGrammarExpressionParser.DOUBLE_POINT, 0); }
		public AllTargetsContext allTargets() {
			return getRuleContext(AllTargetsContext.class,0);
		}
		public TerminalVariableContext terminalVariable() {
			return getRuleContext(TerminalVariableContext.class,0);
		}
		public GrammarNonTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarNonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarNonTerminalContext grammarNonTerminal() throws RecognitionException {
		GrammarNonTerminalContext _localctx = new GrammarNonTerminalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grammarNonTerminal);

		    ((GrammarNonTerminalContext)_localctx).state =  new NonTerminalState();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((GrammarNonTerminalContext)_localctx).NON_TERMINAL_NAME = match(NON_TERMINAL_NAME);
			_localctx.state.setName((((GrammarNonTerminalContext)_localctx).NON_TERMINAL_NAME!=null?((GrammarNonTerminalContext)_localctx).NON_TERMINAL_NAME.getText():null));
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPEC_LEFT) {
				{
				setState(73);
				terminalVariable(_localctx.state);
				}
			}

			setState(76);
			match(DOUBLE_POINT);
			setState(77);
			allTargets(_localctx.state);
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

	public static class AllTargetsContext extends ParserRuleContext {
		public NonTerminalState state;
		public TargetsContext targets() {
			return getRuleContext(TargetsContext.class,0);
		}
		public AllTargetsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AllTargetsContext(ParserRuleContext parent, int invokingState, NonTerminalState state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_allTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterAllTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitAllTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitAllTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTargetsContext allTargets(NonTerminalState state) throws RecognitionException {
		AllTargetsContext _localctx = new AllTargetsContext(_ctx, getState(), state);
		enterRule(_localctx, 12, RULE_allTargets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			targets(_localctx.state);
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

	public static class TargetsContext extends ParserRuleContext {
		public NonTerminalState state;
		public TargetsPointContext targetsPoint() {
			return getRuleContext(TargetsPointContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TargetsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TargetsContext(ParserRuleContext parent, int invokingState, NonTerminalState state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetsContext targets(NonTerminalState state) throws RecognitionException {
		TargetsContext _localctx = new TargetsContext(_ctx, getState(), state);
		enterRule(_localctx, 14, RULE_targets);

		    RuleTarget target = new RuleTarget();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				element(target);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERMINAL_NAME || _la==NON_TERMINAL_NAME );
			_localctx.state.getTargets().add(target);
			setState(87);
			targetsPoint(_localctx.state);
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

	public static class TargetsPointContext extends ParserRuleContext {
		public NonTerminalState state;
		public TerminalNode VERT() { return getToken(CustomGrammarExpressionParser.VERT, 0); }
		public TargetsPointContext targetsPoint() {
			return getRuleContext(TargetsPointContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TargetsPointContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TargetsPointContext(ParserRuleContext parent, int invokingState, NonTerminalState state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_targetsPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterTargetsPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitTargetsPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitTargetsPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetsPointContext targetsPoint(NonTerminalState state) throws RecognitionException {
		TargetsPointContext _localctx = new TargetsPointContext(_ctx, getState(), state);
		enterRule(_localctx, 16, RULE_targetsPoint);

		    RuleTarget target = new RuleTarget();

		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case VERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(VERT);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					element(target);
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINAL_NAME || _la==NON_TERMINAL_NAME );
				_localctx.state.getTargets().add(target);
				setState(97);
				targetsPoint(_localctx.state);
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

	public static class ElementContext extends ParserRuleContext {
		public RuleTarget target;
		public Token TERMINAL_NAME;
		public Token NON_TERMINAL_NAME;
		public TerminalNode TERMINAL_NAME() { return getToken(CustomGrammarExpressionParser.TERMINAL_NAME, 0); }
		public TerminalNode NON_TERMINAL_NAME() { return getToken(CustomGrammarExpressionParser.NON_TERMINAL_NAME, 0); }
		public TargetCodeContext targetCode() {
			return getRuleContext(TargetCodeContext.class,0);
		}
		public TerminalParameterContext terminalParameter() {
			return getRuleContext(TerminalParameterContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementContext(ParserRuleContext parent, int invokingState, RuleTarget target) {
			super(parent, invokingState);
			this.target = target;
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element(RuleTarget target) throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState(), target);
		enterRule(_localctx, 18, RULE_element);

		    NonTerminalTarget nonTermtarget = new NonTerminalTarget();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINAL_NAME:
				{
				setState(101);
				((ElementContext)_localctx).TERMINAL_NAME = match(TERMINAL_NAME);
				nonTermtarget.setName((((ElementContext)_localctx).TERMINAL_NAME!=null?((ElementContext)_localctx).TERMINAL_NAME.getText():null));
				}
				break;
			case NON_TERMINAL_NAME:
				{
				setState(103);
				((ElementContext)_localctx).NON_TERMINAL_NAME = match(NON_TERMINAL_NAME);
				nonTermtarget.setName((((ElementContext)_localctx).NON_TERMINAL_NAME!=null?((ElementContext)_localctx).NON_TERMINAL_NAME.getText():null));
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION_PARAMETER) {
					{
					setState(105);
					terminalParameter(nonTermtarget);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION_CODE) {
				{
				setState(110);
				targetCode(nonTermtarget);
				}
			}

			_localctx.target.getStatesList().add(nonTermtarget);
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

	public static class TargetCodeContext extends ParserRuleContext {
		public NonTerminalTarget target;
		public FunctionCodeContext code;
		public FunctionCodeContext functionCode() {
			return getRuleContext(FunctionCodeContext.class,0);
		}
		public TargetCodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TargetCodeContext(ParserRuleContext parent, int invokingState, NonTerminalTarget target) {
			super(parent, invokingState);
			this.target = target;
		}
		@Override public int getRuleIndex() { return RULE_targetCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterTargetCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitTargetCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitTargetCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetCodeContext targetCode(NonTerminalTarget target) throws RecognitionException {
		TargetCodeContext _localctx = new TargetCodeContext(_ctx, getState(), target);
		enterRule(_localctx, 20, RULE_targetCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((TargetCodeContext)_localctx).code = functionCode();
			_localctx.target.setCode(((TargetCodeContext)_localctx).code.codeData);
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

	public static class TerminalVariableContext extends ParserRuleContext {
		public NonTerminalState state;
		public Token varName;
		public Token className;
		public TerminalNode SPEC_LEFT() { return getToken(CustomGrammarExpressionParser.SPEC_LEFT, 0); }
		public TerminalNode VAR() { return getToken(CustomGrammarExpressionParser.VAR, 0); }
		public TerminalNode DOUBLE_POINT() { return getToken(CustomGrammarExpressionParser.DOUBLE_POINT, 0); }
		public TerminalNode SPEC_RIGHT() { return getToken(CustomGrammarExpressionParser.SPEC_RIGHT, 0); }
		public TerminalNode NON_TERMINAL_NAME() { return getToken(CustomGrammarExpressionParser.NON_TERMINAL_NAME, 0); }
		public TerminalNode GRAMMAR_NAME() { return getToken(CustomGrammarExpressionParser.GRAMMAR_NAME, 0); }
		public TerminalVariableContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalVariableContext(ParserRuleContext parent, int invokingState, NonTerminalState state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_terminalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterTerminalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitTerminalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitTerminalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalVariableContext terminalVariable(NonTerminalState state) throws RecognitionException {
		TerminalVariableContext _localctx = new TerminalVariableContext(_ctx, getState(), state);
		enterRule(_localctx, 22, RULE_terminalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SPEC_LEFT);
			setState(119);
			match(VAR);
			setState(120);
			((TerminalVariableContext)_localctx).varName = match(NON_TERMINAL_NAME);
			setState(121);
			match(DOUBLE_POINT);
			setState(122);
			((TerminalVariableContext)_localctx).className = match(GRAMMAR_NAME);
			setState(123);
			match(SPEC_RIGHT);

			        _localctx.state.setArgName((((TerminalVariableContext)_localctx).varName!=null?((TerminalVariableContext)_localctx).varName.getText():null));
			        _localctx.state.setArgClass((((TerminalVariableContext)_localctx).className!=null?((TerminalVariableContext)_localctx).className.getText():null));
			    
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

	public static class GrammarTerminalContext extends ParserRuleContext {
		public TerminalState state;
		public Token TERMINAL_NAME;
		public Token INPUT;
		public TerminalNode TERMINAL_NAME() { return getToken(CustomGrammarExpressionParser.TERMINAL_NAME, 0); }
		public TerminalNode DOUBLE_POINT() { return getToken(CustomGrammarExpressionParser.DOUBLE_POINT, 0); }
		public TerminalNode INPUT() { return getToken(CustomGrammarExpressionParser.INPUT, 0); }
		public GrammarTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterGrammarTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitGrammarTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitGrammarTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarTerminalContext grammarTerminal() throws RecognitionException {
		GrammarTerminalContext _localctx = new GrammarTerminalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grammarTerminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((GrammarTerminalContext)_localctx).TERMINAL_NAME = match(TERMINAL_NAME);
			setState(127);
			match(DOUBLE_POINT);
			setState(128);
			((GrammarTerminalContext)_localctx).INPUT = match(INPUT);

			    String valueText = (((GrammarTerminalContext)_localctx).INPUT!=null?((GrammarTerminalContext)_localctx).INPUT.getText():null);
			    ((GrammarTerminalContext)_localctx).state =  new TerminalState((((GrammarTerminalContext)_localctx).TERMINAL_NAME!=null?((GrammarTerminalContext)_localctx).TERMINAL_NAME.getText():null), valueText.substring(1, valueText.length() - 1));

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

	public static class TerminalParameterContext extends ParserRuleContext {
		public NonTerminalTarget target;
		public Token FUNCTION_PARAMETER;
		public TerminalNode FUNCTION_PARAMETER() { return getToken(CustomGrammarExpressionParser.FUNCTION_PARAMETER, 0); }
		public TerminalParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalParameterContext(ParserRuleContext parent, int invokingState, NonTerminalTarget target) {
			super(parent, invokingState);
			this.target = target;
		}
		@Override public int getRuleIndex() { return RULE_terminalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterTerminalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitTerminalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitTerminalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalParameterContext terminalParameter(NonTerminalTarget target) throws RecognitionException {
		TerminalParameterContext _localctx = new TerminalParameterContext(_ctx, getState(), target);
		enterRule(_localctx, 26, RULE_terminalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((TerminalParameterContext)_localctx).FUNCTION_PARAMETER = match(FUNCTION_PARAMETER);

			    String valueText = (((TerminalParameterContext)_localctx).FUNCTION_PARAMETER!=null?((TerminalParameterContext)_localctx).FUNCTION_PARAMETER.getText():null);
			    _localctx.target.setParameter(valueText.substring(1, valueText.length() - 1));

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

	public static class FunctionCodeContext extends ParserRuleContext {
		public String codeData;
		public Token FUNCTION_CODE;
		public TerminalNode FUNCTION_CODE() { return getToken(CustomGrammarExpressionParser.FUNCTION_CODE, 0); }
		public FunctionCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).enterFunctionCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CustomGrammarExpressionListener ) ((CustomGrammarExpressionListener)listener).exitFunctionCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CustomGrammarExpressionVisitor ) return ((CustomGrammarExpressionVisitor<? extends T>)visitor).visitFunctionCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCodeContext functionCode() throws RecognitionException {
		FunctionCodeContext _localctx = new FunctionCodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((FunctionCodeContext)_localctx).FUNCTION_CODE = match(FUNCTION_CODE);

			        String inpData = (((FunctionCodeContext)_localctx).FUNCTION_CODE!=null?((FunctionCodeContext)_localctx).FUNCTION_CODE.getText():null);
			        if (inpData == null) ((FunctionCodeContext)_localctx).codeData =  "";
			        else ((FunctionCodeContext)_localctx).codeData =  inpData.substring(1, inpData.length() - 1);
			    
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
		"\u0004\u0001\u0016\u008a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0004\u0007S\b\u0007\u000b\u0007\f\u0007T\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b]\b\b\u000b\b"+
		"\f\b^\u0001\b\u0001\b\u0001\b\u0003\bd\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tk\b\t\u0003\tm\b\t\u0001\t\u0003\tp\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u0084\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00042\u0001\u0000"+
		"\u0000\u0000\u00069\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000"+
		"\nG\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eR\u0001\u0000"+
		"\u0000\u0000\u0010c\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000"+
		"\u0014s\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018~"+
		"\u0001\u0000\u0000\u0000\u001a\u0083\u0001\u0000\u0000\u0000\u001c\u0086"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0006"+
		"\u0000\uffff\uffff\u0000 \"\u0003\u0004\u0002\u0000!#\u0003\u0006\u0003"+
		"\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\'\u0001"+
		"\u0000\u0000\u0000$&\u0003\b\u0004\u0000%$\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000"+
		"\u0001+,\u0006\u0000\uffff\uffff\u0000,\u0001\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0001\u0000\u0000./\u0005\u0014\u0000\u0000/0\u0005\u0006\u0000"+
		"\u000001\u0006\u0001\uffff\uffff\u00001\u0003\u0001\u0000\u0000\u0000"+
		"23\u0005\u000e\u0000\u000034\u0005\u0002\u0000\u000045\u0005\b\u0000\u0000"+
		"56\u0005\u0002\u0000\u000067\u0005\u000f\u0000\u000078\u0006\u0002\uffff"+
		"\uffff\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u0011\u0000\u0000"+
		":;\u0003\u001c\u000e\u0000;<\u0006\u0003\uffff\uffff\u0000<\u0007\u0001"+
		"\u0000\u0000\u0000=>\u0003\u0018\f\u0000>?\u0006\u0004\uffff\uffff\u0000"+
		"?D\u0001\u0000\u0000\u0000@A\u0003\n\u0005\u0000AB\u0006\u0004\uffff\uffff"+
		"\u0000BD\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C@\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005\u0006\u0000\u0000F\t\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0013\u0000\u0000HJ\u0006\u0005\uffff\uffff"+
		"\u0000IK\u0003\u0016\u000b\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000\u0000MN\u0003"+
		"\f\u0006\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0003\u000e\u0007\u0000"+
		"P\r\u0001\u0000\u0000\u0000QS\u0003\u0012\t\u0000RQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0007\uffff\uffff\u0000"+
		"WX\u0003\u0010\b\u0000X\u000f\u0001\u0000\u0000\u0000Yd\u0001\u0000\u0000"+
		"\u0000Z\\\u0005\b\u0000\u0000[]\u0003\u0012\t\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0006\b\uffff\uffff\u0000ab\u0003"+
		"\u0010\b\u0000bd\u0001\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000cZ\u0001"+
		"\u0000\u0000\u0000d\u0011\u0001\u0000\u0000\u0000ef\u0005\u0012\u0000"+
		"\u0000fm\u0006\t\uffff\uffff\u0000gh\u0005\u0013\u0000\u0000hj\u0006\t"+
		"\uffff\uffff\u0000ik\u0003\u001a\r\u0000ji\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000km\u0001\u0000\u0000\u0000le\u0001\u0000\u0000\u0000"+
		"lg\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0003\u0014\n\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0006\t\uffff\uffff\u0000r\u0013\u0001\u0000\u0000\u0000st\u0003"+
		"\u001c\u000e\u0000tu\u0006\n\uffff\uffff\u0000u\u0015\u0001\u0000\u0000"+
		"\u0000vw\u0005\u000e\u0000\u0000wx\u0005\u0010\u0000\u0000xy\u0005\u0013"+
		"\u0000\u0000yz\u0005\u0007\u0000\u0000z{\u0005\u0014\u0000\u0000{|\u0005"+
		"\u000f\u0000\u0000|}\u0006\u000b\uffff\uffff\u0000}\u0017\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0080\u0005\u0007\u0000"+
		"\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0006\f\uffff\uffff"+
		"\u0000\u0082\u0019\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0015\u0000"+
		"\u0000\u0084\u0085\u0006\r\uffff\uffff\u0000\u0085\u001b\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0016\u0000\u0000\u0087\u0088\u0006\u000e\uffff"+
		"\uffff\u0000\u0088\u001d\u0001\u0000\u0000\u0000\n\"\'CJT^cjlo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}