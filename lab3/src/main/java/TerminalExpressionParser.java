// Generated from C:/Users/SKAT/Desktop/HW/met-trans/lab3/src/main/kotlin\TerminalExpression.g4 by ANTLR 4.10.1

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
		EQUAL=1, LINE_END=2, PLUS=3, MINUS=4, MULT=5, DIV=6, POW=7, LB=8, RB=9, 
		INT=10, ALPS=11, WS=12;
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
	public String getGrammarFileName() { return "TerminalExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String, Integer> expressionValues = new HashMap<>();
	String currentVar = "";

	public TerminalExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public String out;
		public LineContext line;
		public List<LineContext> resl = new ArrayList<LineContext>();
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

		    ((ProgContext)_localctx).out =  "";

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
				((ProgContext)_localctx).line = line();
				((ProgContext)_localctx).resl.add(((ProgContext)_localctx).line);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);

			    for (int i = 0; i < ((ProgContext)_localctx).resl.size(); i++) {
			        _localctx.out += ((ProgContext)_localctx).resl.get(i).res;
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

	public static class LineContext extends ParserRuleContext {
		public String res;
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

		     ((LineContext)_localctx).res =  "";

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((LineContext)_localctx).ALPS = match(ALPS);
			setState(20);
			match(EQUAL);
			setState(21);
			((LineContext)_localctx).res1 = expr();
			setState(22);
			match(LINE_END);

			     String output = "";
			     String name = (((LineContext)_localctx).ALPS!=null?((LineContext)_localctx).ALPS.getText():null);
			     currentVar = name;
			     try {
			        Integer result = ((LineContext)_localctx).res1.res;
			        output = name + " = " + String.valueOf(result);
			        expressionValues.put(name, result);
			     } catch (Exception e) {
			         output = "Error with this variable: " + name;
			     }
			     System.out.println(output);
			     ((LineContext)_localctx).res =  output + "\n";
			     
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((ExprContext)_localctx).res1 = multDivOp();
				setState(26);
				match(PLUS);
				setState(27);
				((ExprContext)_localctx).res2 = expr();
				((ExprContext)_localctx).res =  ((ExprContext)_localctx).res1.res + ((ExprContext)_localctx).res2.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((ExprContext)_localctx).res1 = multDivOp();
				((ExprContext)_localctx).res =  ((ExprContext)_localctx).res1.res;
				setState(32);
				match(MINUS);
				setState(33);
				((ExprContext)_localctx).res2 = expr();
				_localctx.res -= ((ExprContext)_localctx).res2.res;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
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
		public TerminalNode POW() { return getToken(TerminalExpressionParser.POW, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public TerminalNode MULT() { return getToken(TerminalExpressionParser.MULT, 0); }
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((MultDivOpContext)_localctx).res1 = term();
				setState(42);
				match(POW);
				setState(43);
				((MultDivOpContext)_localctx).res2 = multDivOp();

				      Integer r1 = ((MultDivOpContext)_localctx).res1.res;
				      Integer r2 = ((MultDivOpContext)_localctx).res2.res;
				      Integer powResult = (int) Math.pow(r1, r2);
				      if (powResult == Integer.MAX_VALUE) {
				          System.out.println("Integer overflow after operation: " + String.valueOf(r1) + "**" + String.valueOf(r2) + "; returns Integer.MAX_VALUE");
				      }
				      ((MultDivOpContext)_localctx).res =  (int) Math.pow(((MultDivOpContext)_localctx).res1.res, ((MultDivOpContext)_localctx).res2.res);
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((MultDivOpContext)_localctx).res1 = term();
				setState(47);
				match(MULT);
				setState(48);
				((MultDivOpContext)_localctx).res2 = multDivOp();
				((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res1.res * ((MultDivOpContext)_localctx).res2.res;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				((MultDivOpContext)_localctx).res1 = term();
				setState(52);
				match(DIV);
				setState(53);
				((MultDivOpContext)_localctx).res2 = multDivOp();

				    Integer resultA = ((MultDivOpContext)_localctx).res1.res;
				    if (((MultDivOpContext)_localctx).res2.res == 0) {
				        System.out.println("Devision by zero: [" + String.valueOf(resultA) + " / 0]");
				        ((MultDivOpContext)_localctx).res =  0;
				    } else {
				        ((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res1.res / ((MultDivOpContext)_localctx).res2.res;
				    }

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
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
		public Token INT;
		public Token ALPS;
		public TerminalNode LB() { return getToken(TerminalExpressionParser.LB, 0); }
		public TerminalNode RB() { return getToken(TerminalExpressionParser.RB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TerminalExpressionParser.MINUS, 0); }
		public TerminalNode INT() { return getToken(TerminalExpressionParser.INT, 0); }
		public TerminalNode ALPS() { return getToken(TerminalExpressionParser.ALPS, 0); }
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(LB);
				setState(62);
				((TermContext)_localctx).res1 = expr();
				setState(63);
				match(RB);
				((TermContext)_localctx).res =  ((TermContext)_localctx).res1.res;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(LB);
				setState(67);
				match(MINUS);
				setState(68);
				((TermContext)_localctx).res1 = expr();
				setState(69);
				match(RB);

				        Integer r1 = ((TermContext)_localctx).res1.res;
				        if (r1 == -r1) {
				            System.out.println("Integer overflow after operation: -" + String.valueOf(r1) + "; returns Integer.MAXVALUE");
				            ((TermContext)_localctx).res =  Integer.MAX_VALUE;
				        } else {
				            ((TermContext)_localctx).res =  -r1;
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				((TermContext)_localctx).INT = match(INT);
				((TermContext)_localctx).res =  Integer.parseInt((((TermContext)_localctx).INT!=null?((TermContext)_localctx).INT.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				((TermContext)_localctx).ALPS = match(ALPS);

				        if (!expressionValues.containsKey((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null))) {
				            System.out.println((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null) + " set as default value '0'");
				            expressionValues.put((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null), 0);
				        }
				        ((TermContext)_localctx).res =  expressionValues.get((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null));
				    
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

	public static final String _serializedATN =
		"\u0004\u0001\fO\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003<\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"M\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000R\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000"+
		"\bL\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001"+
		"\u0011\u0012\u0006\u0000\uffff\uffff\u0000\u0012\u0001\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u000b\u0000\u0000\u0014\u0015\u0005\u0001\u0000"+
		"\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\u0002\u0000"+
		"\u0000\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018\u0003\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0003\u0006\u0003\u0000\u001a\u001b\u0005\u0003"+
		"\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0006\u0002"+
		"\uffff\uffff\u0000\u001d(\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0006"+
		"\u0003\u0000\u001f \u0006\u0002\uffff\uffff\u0000 !\u0005\u0004\u0000"+
		"\u0000!\"\u0003\u0004\u0002\u0000\"#\u0006\u0002\uffff\uffff\u0000#(\u0001"+
		"\u0000\u0000\u0000$%\u0003\u0006\u0003\u0000%&\u0006\u0002\uffff\uffff"+
		"\u0000&(\u0001\u0000\u0000\u0000\'\u0019\u0001\u0000\u0000\u0000\'\u001e"+
		"\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000(\u0005\u0001\u0000"+
		"\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005\u0007\u0000\u0000+,\u0003\u0006"+
		"\u0003\u0000,-\u0006\u0003\uffff\uffff\u0000-<\u0001\u0000\u0000\u0000"+
		"./\u0003\b\u0004\u0000/0\u0005\u0005\u0000\u000001\u0003\u0006\u0003\u0000"+
		"12\u0006\u0003\uffff\uffff\u00002<\u0001\u0000\u0000\u000034\u0003\b\u0004"+
		"\u000045\u0005\u0006\u0000\u000056\u0003\u0006\u0003\u000067\u0006\u0003"+
		"\uffff\uffff\u00007<\u0001\u0000\u0000\u000089\u0003\b\u0004\u00009:\u0006"+
		"\u0003\uffff\uffff\u0000:<\u0001\u0000\u0000\u0000;)\u0001\u0000\u0000"+
		"\u0000;.\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000;8\u0001\u0000"+
		"\u0000\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0005\b\u0000\u0000>?\u0003"+
		"\u0004\u0002\u0000?@\u0005\t\u0000\u0000@A\u0006\u0004\uffff\uffff\u0000"+
		"AM\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0005\u0004\u0000\u0000"+
		"DE\u0003\u0004\u0002\u0000EF\u0005\t\u0000\u0000FG\u0006\u0004\uffff\uffff"+
		"\u0000GM\u0001\u0000\u0000\u0000HI\u0005\n\u0000\u0000IM\u0006\u0004\uffff"+
		"\uffff\u0000JK\u0005\u000b\u0000\u0000KM\u0006\u0004\uffff\uffff\u0000"+
		"L=\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000\u0004\r\'"+
		";L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}