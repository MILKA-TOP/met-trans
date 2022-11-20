// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab3/src/main/kotlin\SimpleTerminalExpression.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleTerminalExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, LINE_END=2, PLUS=3, MINUS=4, MULT=5, DIV=6, POW=7, LB=8, RB=9, 
		INT=10, ALPS=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_expr = 2, RULE_exprPoint = 3, RULE_multDivOp = 4, 
		RULE_multDivOpPoint = 5, RULE_powOp = 6, RULE_powOpPoint = 7, RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "expr", "exprPoint", "multDivOp", "multDivOpPoint", "powOp", 
			"powOpPoint", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'**'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "LINE_END", "PLUS", "MINUS", "MULT", "DIV", "POW", "LB", 
			"RB", "INT", "ALPS", "WS"
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
	public String getGrammarFileName() { return "SimpleTerminalExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleTerminalExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleTerminalExpressionParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPS) {
				{
				{
				setState(18);
				line();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public TerminalNode ALPS() { return getToken(SimpleTerminalExpressionParser.ALPS, 0); }
		public TerminalNode EQUAL() { return getToken(SimpleTerminalExpressionParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(SimpleTerminalExpressionParser.LINE_END, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ALPS);
			setState(27);
			match(EQUAL);
			setState(28);
			expr();
			setState(29);
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

	public static class ExprContext extends ParserRuleContext {
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public ExprPointContext exprPoint() {
			return getRuleContext(ExprPointContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			multDivOp();
			setState(32);
			exprPoint();
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

	public static class ExprPointContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimpleTerminalExpressionParser.PLUS, 0); }
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public ExprPointContext exprPoint() {
			return getRuleContext(ExprPointContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SimpleTerminalExpressionParser.MINUS, 0); }
		public ExprPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterExprPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitExprPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitExprPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPointContext exprPoint() throws RecognitionException {
		ExprPointContext _localctx = new ExprPointContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprPoint);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
			case RB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(PLUS);
				setState(36);
				multDivOp();
				setState(37);
				exprPoint();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(MINUS);
				setState(40);
				multDivOp();
				setState(41);
				exprPoint();
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

	public static class MultDivOpContext extends ParserRuleContext {
		public PowOpContext powOp() {
			return getRuleContext(PowOpContext.class,0);
		}
		public MultDivOpPointContext multDivOpPoint() {
			return getRuleContext(MultDivOpPointContext.class,0);
		}
		public MultDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterMultDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitMultDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitMultDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivOpContext multDivOp() throws RecognitionException {
		MultDivOpContext _localctx = new MultDivOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multDivOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			powOp();
			setState(46);
			multDivOpPoint();
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

	public static class MultDivOpPointContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(SimpleTerminalExpressionParser.MULT, 0); }
		public PowOpContext powOp() {
			return getRuleContext(PowOpContext.class,0);
		}
		public MultDivOpPointContext multDivOpPoint() {
			return getRuleContext(MultDivOpPointContext.class,0);
		}
		public TerminalNode DIV() { return getToken(SimpleTerminalExpressionParser.DIV, 0); }
		public MultDivOpPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivOpPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterMultDivOpPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitMultDivOpPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitMultDivOpPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivOpPointContext multDivOpPoint() throws RecognitionException {
		MultDivOpPointContext _localctx = new MultDivOpPointContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multDivOpPoint);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
			case PLUS:
			case MINUS:
			case RB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(MULT);
				setState(50);
				powOp();
				setState(51);
				multDivOpPoint();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(DIV);
				setState(54);
				powOp();
				setState(55);
				multDivOpPoint();
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

	public static class PowOpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PowOpPointContext powOpPoint() {
			return getRuleContext(PowOpPointContext.class,0);
		}
		public PowOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterPowOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitPowOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitPowOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowOpContext powOp() throws RecognitionException {
		PowOpContext _localctx = new PowOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_powOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			term();
			setState(60);
			powOpPoint();
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

	public static class PowOpPointContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(SimpleTerminalExpressionParser.POW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PowOpPointContext powOpPoint() {
			return getRuleContext(PowOpPointContext.class,0);
		}
		public PowOpPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powOpPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterPowOpPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitPowOpPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitPowOpPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowOpPointContext powOpPoint() throws RecognitionException {
		PowOpPointContext _localctx = new PowOpPointContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_powOpPoint);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case RB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(POW);
				setState(64);
				term();
				setState(65);
				powOpPoint();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(SimpleTerminalExpressionParser.LB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RB() { return getToken(SimpleTerminalExpressionParser.RB, 0); }
		public TerminalNode ALPS() { return getToken(SimpleTerminalExpressionParser.ALPS, 0); }
		public TerminalNode INT() { return getToken(SimpleTerminalExpressionParser.INT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleTerminalExpressionListener ) ((SimpleTerminalExpressionListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleTerminalExpressionVisitor ) return ((SimpleTerminalExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(LB);
				setState(70);
				expr();
				setState(71);
				match(RB);
				}
				break;
			case ALPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(ALPS);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(INT);
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
		"\u0004\u0001\fN\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007D\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bL\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0000\u0000L\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n9\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000"+
		"\u0010K\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\u0000\u0000\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\u000b\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c"+
		"\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e"+
		"\u0003\u0001\u0000\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0003\u0006"+
		"\u0003\u0000!\u0005\u0001\u0000\u0000\u0000\",\u0001\u0000\u0000\u0000"+
		"#$\u0005\u0003\u0000\u0000$%\u0003\b\u0004\u0000%&\u0003\u0006\u0003\u0000"+
		"&,\u0001\u0000\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0003\b\u0004"+
		"\u0000)*\u0003\u0006\u0003\u0000*,\u0001\u0000\u0000\u0000+\"\u0001\u0000"+
		"\u0000\u0000+#\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0007"+
		"\u0001\u0000\u0000\u0000-.\u0003\f\u0006\u0000./\u0003\n\u0005\u0000/"+
		"\t\u0001\u0000\u0000\u00000:\u0001\u0000\u0000\u000012\u0005\u0005\u0000"+
		"\u000023\u0003\f\u0006\u000034\u0003\n\u0005\u00004:\u0001\u0000\u0000"+
		"\u000056\u0005\u0006\u0000\u000067\u0003\f\u0006\u000078\u0003\n\u0005"+
		"\u00008:\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u000091\u0001\u0000"+
		"\u0000\u000095\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000\u0000"+
		";<\u0003\u0010\b\u0000<=\u0003\u000e\u0007\u0000=\r\u0001\u0000\u0000"+
		"\u0000>D\u0001\u0000\u0000\u0000?@\u0005\u0007\u0000\u0000@A\u0003\u0010"+
		"\b\u0000AB\u0003\u000e\u0007\u0000BD\u0001\u0000\u0000\u0000C>\u0001\u0000"+
		"\u0000\u0000C?\u0001\u0000\u0000\u0000D\u000f\u0001\u0000\u0000\u0000"+
		"EF\u0005\b\u0000\u0000FG\u0003\u0004\u0002\u0000GH\u0005\t\u0000\u0000"+
		"HL\u0001\u0000\u0000\u0000IL\u0005\u000b\u0000\u0000JL\u0005\n\u0000\u0000"+
		"KE\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000L\u0011\u0001\u0000\u0000\u0000\u0005\u0015+9CK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}