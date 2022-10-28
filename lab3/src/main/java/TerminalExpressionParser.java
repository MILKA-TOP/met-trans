// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab3/src/main/kotlin\TerminalExpression.g4 by ANTLR 4.10.1

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TerminalExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, LINE_END=2, PLUS=3, MINUS=4, MULT=5, DIV=6, LB=7, RB=8, INT=9, 
		ALPS=10, WS=11;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_expr = 2, RULE_multDivOp = 3, RULE_term = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "expr", "multDivOp", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "LINE_END", "PLUS", "MINUS", "MULT", "DIV", "LB", "RB", 
			"INT", "ALPS", "WS"
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
	public String getGrammarFileName() { return "TerminalExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String, Integer> expressionValues = new HashMap<>();

	public TerminalExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TerminalExpressionParser.EOF, 0); }
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
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitProg(this);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPS) {
				{
				{
				setState(10);
				line();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
		public Token ALPS;
		public ExprContext res1;
		public TerminalNode ALPS() { return getToken(TerminalExpressionParser.ALPS, 0); }
		public TerminalNode EQUAL() { return getToken(TerminalExpressionParser.EQUAL, 0); }
		public TerminalNode LINE_END() { return getToken(TerminalExpressionParser.LINE_END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((LineContext)_localctx).ALPS = match(ALPS);
			setState(19);
			match(EQUAL);
			setState(20);
			((LineContext)_localctx).res1 = expr();
			setState(21);
			match(LINE_END);

			     String name = (((LineContext)_localctx).ALPS!=null?((LineContext)_localctx).ALPS.getText():null);
			     Integer result = ((LineContext)_localctx).res1.res;
			     System.out.println(name + " = " + String.valueOf(result));
			     expressionValues.put(name, result);
			     
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
		public Integer res;
		public MultDivOpContext res1;
		public ExprContext res2;
		public TerminalNode PLUS() { return getToken(TerminalExpressionParser.PLUS, 0); }
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TerminalExpressionParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((ExprContext)_localctx).res1 = multDivOp();
				setState(25);
				match(PLUS);
				setState(26);
				((ExprContext)_localctx).res2 = expr();
				((ExprContext)_localctx).res =  ((ExprContext)_localctx).res1.res + ((ExprContext)_localctx).res2.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				((ExprContext)_localctx).res1 = multDivOp();
				setState(30);
				match(MINUS);
				setState(31);
				((ExprContext)_localctx).res2 = expr();
				((ExprContext)_localctx).res =  ((ExprContext)_localctx).res1.res - ((ExprContext)_localctx).res2.res;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				((ExprContext)_localctx).res1 = multDivOp();
				((ExprContext)_localctx).res =  ((ExprContext)_localctx).res1.res;
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

	public static class MultDivOpContext extends ParserRuleContext {
		public Integer res;
		public TermContext res1;
		public MultDivOpContext res2;
		public TerminalNode MULT() { return getToken(TerminalExpressionParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TerminalExpressionParser.DIV, 0); }
		public MultDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterMultDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitMultDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitMultDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivOpContext multDivOp() throws RecognitionException {
		MultDivOpContext _localctx = new MultDivOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multDivOp);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((MultDivOpContext)_localctx).res1 = term();
				setState(40);
				match(MULT);
				setState(41);
				((MultDivOpContext)_localctx).res2 = multDivOp();
				((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res1.res * ((MultDivOpContext)_localctx).res2.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((MultDivOpContext)_localctx).res1 = term();
				setState(45);
				match(DIV);
				setState(46);
				((MultDivOpContext)_localctx).res2 = multDivOp();
				((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res1.res / ((MultDivOpContext)_localctx).res2.res;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((MultDivOpContext)_localctx).res1 = term();
				((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res1.res;
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

	public static class TermContext extends ParserRuleContext {
		public Integer res;
		public ExprContext res1;
		public Token ALPS;
		public Token INT;
		public TerminalNode LB() { return getToken(TerminalExpressionParser.LB, 0); }
		public TerminalNode RB() { return getToken(TerminalExpressionParser.RB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ALPS() { return getToken(TerminalExpressionParser.ALPS, 0); }
		public TerminalNode INT() { return getToken(TerminalExpressionParser.INT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(LB);
				setState(55);
				((TermContext)_localctx).res1 = expr();
				setState(56);
				match(RB);
				((TermContext)_localctx).res =  ((TermContext)_localctx).res1.res;
				}
				break;
			case ALPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((TermContext)_localctx).ALPS = match(ALPS);
				((TermContext)_localctx).res =  expressionValues.get((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null));
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((TermContext)_localctx).INT = match(INT);
				((TermContext)_localctx).res =  Integer.parseInt((((TermContext)_localctx).INT!=null?((TermContext)_localctx).INT.getText():null));
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
		"\u0004\u0001\u000bB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"5\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004@\b\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000C"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b?\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0005\n\u0000\u0000\u0013\u0014\u0005\u0001"+
		"\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0002"+
		"\u0000\u0000\u0016\u0017\u0006\u0001\uffff\uffff\u0000\u0017\u0003\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005"+
		"\u0003\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b\u001c\u0006"+
		"\u0002\uffff\uffff\u0000\u001c&\u0001\u0000\u0000\u0000\u001d\u001e\u0003"+
		"\u0006\u0003\u0000\u001e\u001f\u0005\u0004\u0000\u0000\u001f \u0003\u0004"+
		"\u0002\u0000 !\u0006\u0002\uffff\uffff\u0000!&\u0001\u0000\u0000\u0000"+
		"\"#\u0003\u0006\u0003\u0000#$\u0006\u0002\uffff\uffff\u0000$&\u0001\u0000"+
		"\u0000\u0000%\u0018\u0001\u0000\u0000\u0000%\u001d\u0001\u0000\u0000\u0000"+
		"%\"\u0001\u0000\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0003\b"+
		"\u0004\u0000()\u0005\u0005\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0006"+
		"\u0003\uffff\uffff\u0000+5\u0001\u0000\u0000\u0000,-\u0003\b\u0004\u0000"+
		"-.\u0005\u0006\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0006\u0003\uffff"+
		"\uffff\u000005\u0001\u0000\u0000\u000012\u0003\b\u0004\u000023\u0006\u0003"+
		"\uffff\uffff\u000035\u0001\u0000\u0000\u00004\'\u0001\u0000\u0000\u0000"+
		"4,\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u00005\u0007\u0001\u0000"+
		"\u0000\u000067\u0005\u0007\u0000\u000078\u0003\u0004\u0002\u000089\u0005"+
		"\b\u0000\u00009:\u0006\u0004\uffff\uffff\u0000:@\u0001\u0000\u0000\u0000"+
		";<\u0005\n\u0000\u0000<@\u0006\u0004\uffff\uffff\u0000=>\u0005\t\u0000"+
		"\u0000>@\u0006\u0004\uffff\uffff\u0000?6\u0001\u0000\u0000\u0000?;\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000"+
		"\u0004\r%4?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}