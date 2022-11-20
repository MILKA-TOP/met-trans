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
		EQUAL=1, LINE_END=2, PLUS=3, MINUS=4, MULT=5, DIV=6, POW=7, LB=8, RB=9, 
		INT=10, ALPS=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_expr = 2, RULE_exprPoint = 3, RULE_multDivOp = 4, 
		RULE_multDivOpPoint = 5, RULE_powOp = 6, RULE_unar = 7, RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "expr", "exprPoint", "multDivOp", "multDivOpPoint", "powOp", 
			"unar", "term"
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPS) {
				{
				{
				setState(18);
				((ProgContext)_localctx).line = line();
				((ProgContext)_localctx).resl.add(((ProgContext)_localctx).line);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
			setState(27);
			((LineContext)_localctx).ALPS = match(ALPS);
			setState(28);
			match(EQUAL);
			setState(29);
			((LineContext)_localctx).res1 = expr();
			setState(30);
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
		public ExprPointContext res2;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((ExprContext)_localctx).res1 = multDivOp();
			setState(34);
			((ExprContext)_localctx).res2 = exprPoint(((ExprContext)_localctx).res1.res);
			((ExprContext)_localctx).res =  ((ExprContext)_localctx).res2.res;
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
		public Integer prev;
		public Integer res;
		public MultDivOpContext res1;
		public ExprPointContext res2;
		public TerminalNode PLUS() { return getToken(TerminalExpressionParser.PLUS, 0); }
		public MultDivOpContext multDivOp() {
			return getRuleContext(MultDivOpContext.class,0);
		}
		public ExprPointContext exprPoint() {
			return getRuleContext(ExprPointContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TerminalExpressionParser.MINUS, 0); }
		public ExprPointContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprPointContext(ParserRuleContext parent, int invokingState, Integer prev) {
			super(parent, invokingState);
			this.prev = prev;
		}
		@Override public int getRuleIndex() { return RULE_exprPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterExprPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitExprPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitExprPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprPointContext exprPoint(Integer prev) throws RecognitionException {
		ExprPointContext _localctx = new ExprPointContext(_ctx, getState(), prev);
		enterRule(_localctx, 6, RULE_exprPoint);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
			case RB:
				enterOuterAlt(_localctx, 1);
				{
				((ExprPointContext)_localctx).res =  _localctx.prev;
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(PLUS);
				setState(39);
				((ExprPointContext)_localctx).res1 = multDivOp();
				setState(40);
				((ExprPointContext)_localctx).res2 = exprPoint(_localctx.prev + ((ExprPointContext)_localctx).res1.res);
				((ExprPointContext)_localctx).res =  ((ExprPointContext)_localctx).res2.res;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(MINUS);
				setState(44);
				((ExprPointContext)_localctx).res1 = multDivOp();
				setState(45);
				((ExprPointContext)_localctx).res2 = exprPoint(_localctx.prev - ((ExprPointContext)_localctx).res1.res);
				((ExprPointContext)_localctx).res =  ((ExprPointContext)_localctx).res2.res;
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
		public Integer res;
		public PowOpContext res1;
		public MultDivOpPointContext res2;
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
		enterRule(_localctx, 8, RULE_multDivOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((MultDivOpContext)_localctx).res1 = powOp();
			setState(51);
			((MultDivOpContext)_localctx).res2 = multDivOpPoint(((MultDivOpContext)_localctx).res1.res);
			((MultDivOpContext)_localctx).res =  ((MultDivOpContext)_localctx).res2.res;
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
		public Integer prev;
		public Integer res;
		public PowOpContext res1;
		public MultDivOpPointContext res2;
		public TerminalNode MULT() { return getToken(TerminalExpressionParser.MULT, 0); }
		public PowOpContext powOp() {
			return getRuleContext(PowOpContext.class,0);
		}
		public MultDivOpPointContext multDivOpPoint() {
			return getRuleContext(MultDivOpPointContext.class,0);
		}
		public TerminalNode DIV() { return getToken(TerminalExpressionParser.DIV, 0); }
		public MultDivOpPointContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultDivOpPointContext(ParserRuleContext parent, int invokingState, Integer prev) {
			super(parent, invokingState);
			this.prev = prev;
		}
		@Override public int getRuleIndex() { return RULE_multDivOpPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterMultDivOpPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitMultDivOpPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitMultDivOpPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivOpPointContext multDivOpPoint(Integer prev) throws RecognitionException {
		MultDivOpPointContext _localctx = new MultDivOpPointContext(_ctx, getState(), prev);
		enterRule(_localctx, 10, RULE_multDivOpPoint);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE_END:
			case PLUS:
			case MINUS:
			case RB:
				enterOuterAlt(_localctx, 1);
				{
				((MultDivOpPointContext)_localctx).res =  _localctx.prev;
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(MULT);
				setState(56);
				((MultDivOpPointContext)_localctx).res1 = powOp();
				setState(57);
				((MultDivOpPointContext)_localctx).res2 = multDivOpPoint(_localctx.prev * ((MultDivOpPointContext)_localctx).res1.res);
				((MultDivOpPointContext)_localctx).res =  ((MultDivOpPointContext)_localctx).res2.res;
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(DIV);
				setState(61);
				((MultDivOpPointContext)_localctx).res1 = powOp();

				          Integer r1 = ((MultDivOpPointContext)_localctx).res1.res;
				           if (r1 == 0) {
				              System.out.println("Devision by zero: [" + String.valueOf(_localctx.prev) + " / 0]");
				              r1 = 1;
				           }
				    
				setState(63);
				((MultDivOpPointContext)_localctx).res2 = multDivOpPoint(_localctx.prev / r1);
				((MultDivOpPointContext)_localctx).res =  ((MultDivOpPointContext)_localctx).res2.res;
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
		public Integer res;
		public UnarContext res1;
		public PowOpContext res2;
		public TerminalNode POW() { return getToken(TerminalExpressionParser.POW, 0); }
		public UnarContext unar() {
			return getRuleContext(UnarContext.class,0);
		}
		public PowOpContext powOp() {
			return getRuleContext(PowOpContext.class,0);
		}
		public PowOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterPowOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitPowOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitPowOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowOpContext powOp() throws RecognitionException {
		PowOpContext _localctx = new PowOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_powOp);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((PowOpContext)_localctx).res1 = unar();
				setState(69);
				match(POW);
				setState(70);
				((PowOpContext)_localctx).res2 = powOp();

				        Integer r1 = ((PowOpContext)_localctx).res1.res;
				        Integer r2 = ((PowOpContext)_localctx).res2.res;
				        Integer powResult = (int) Math.pow(r1, r2);
				        if (powResult == Integer.MAX_VALUE) {
				            System.out.println("Integer overflow after operation: " + String.valueOf(r1) + "**" + String.valueOf(r2) + "; returns Integer.MAX_VALUE");
				        }
				        ((PowOpContext)_localctx).res =  (int) Math.pow(((PowOpContext)_localctx).res1.res, ((PowOpContext)_localctx).res2.res);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((PowOpContext)_localctx).res1 = unar();
				((PowOpContext)_localctx).res =  ((PowOpContext)_localctx).res1.res;
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

	public static class UnarContext extends ParserRuleContext {
		public Integer res;
		public TermContext res1;
		public TermContext res2;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TerminalExpressionParser.MINUS, 0); }
		public UnarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).enterUnar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TerminalExpressionListener ) ((TerminalExpressionListener)listener).exitUnar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TerminalExpressionVisitor ) return ((TerminalExpressionVisitor<? extends T>)visitor).visitUnar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnarContext unar() throws RecognitionException {
		UnarContext _localctx = new UnarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unar);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
			case INT:
			case ALPS:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((UnarContext)_localctx).res1 = term();
				((UnarContext)_localctx).res =  ((UnarContext)_localctx).res1.res;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(MINUS);
				setState(82);
				((UnarContext)_localctx).res2 = term();
				((UnarContext)_localctx).res =  -((UnarContext)_localctx).res2.res;
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
		public Integer res;
		public ExprContext res1;
		public Token INT;
		public Token ALPS;
		public TerminalNode LB() { return getToken(TerminalExpressionParser.LB, 0); }
		public TerminalNode RB() { return getToken(TerminalExpressionParser.RB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(LB);
				setState(88);
				((TermContext)_localctx).res1 = expr();
				setState(89);
				match(RB);
				((TermContext)_localctx).res =  ((TermContext)_localctx).res1.res;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((TermContext)_localctx).INT = match(INT);
				((TermContext)_localctx).res =  Integer.parseInt((((TermContext)_localctx).INT!=null?((TermContext)_localctx).INT.getText():null));
				}
				break;
			case ALPS:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((TermContext)_localctx).ALPS = match(ALPS);

				        if (!expressionValues.containsKey((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null))) {
				            System.out.println((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null) + " set as default value '0'");
				            expressionValues.put((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null), 0);
				        }
				        ((TermContext)_localctx).res =  expressionValues.get((((TermContext)_localctx).ALPS!=null?((TermContext)_localctx).ALPS.getText():null));
				    
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
		"\u0004\u0001\fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00031\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005C\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006M\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007V\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\ba\b\b\u0001\b\u0000"+
		"\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000b\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004"+
		"!\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b2\u0001\u0000"+
		"\u0000\u0000\nB\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000e"+
		"U\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u001a\u0006"+
		"\u0000\uffff\uffff\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0005\u000b\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001e"+
		"\u0003\u0004\u0002\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0006"+
		"\u0001\uffff\uffff\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0003\b\u0004"+
		"\u0000\"#\u0003\u0006\u0003\u0000#$\u0006\u0002\uffff\uffff\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%1\u0006\u0003\uffff\uffff\u0000&\'\u0005\u0003"+
		"\u0000\u0000\'(\u0003\b\u0004\u0000()\u0003\u0006\u0003\u0000)*\u0006"+
		"\u0003\uffff\uffff\u0000*1\u0001\u0000\u0000\u0000+,\u0005\u0004\u0000"+
		"\u0000,-\u0003\b\u0004\u0000-.\u0003\u0006\u0003\u0000./\u0006\u0003\uffff"+
		"\uffff\u0000/1\u0001\u0000\u0000\u00000%\u0001\u0000\u0000\u00000&\u0001"+
		"\u0000\u0000\u00000+\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000"+
		"\u000023\u0003\f\u0006\u000034\u0003\n\u0005\u000045\u0006\u0004\uffff"+
		"\uffff\u00005\t\u0001\u0000\u0000\u00006C\u0006\u0005\uffff\uffff\u0000"+
		"78\u0005\u0005\u0000\u000089\u0003\f\u0006\u00009:\u0003\n\u0005\u0000"+
		":;\u0006\u0005\uffff\uffff\u0000;C\u0001\u0000\u0000\u0000<=\u0005\u0006"+
		"\u0000\u0000=>\u0003\f\u0006\u0000>?\u0006\u0005\uffff\uffff\u0000?@\u0003"+
		"\n\u0005\u0000@A\u0006\u0005\uffff\uffff\u0000AC\u0001\u0000\u0000\u0000"+
		"B6\u0001\u0000\u0000\u0000B7\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005"+
		"\u0007\u0000\u0000FG\u0003\f\u0006\u0000GH\u0006\u0006\uffff\uffff\u0000"+
		"HM\u0001\u0000\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0006\u0006\uffff"+
		"\uffff\u0000KM\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000M\r\u0001\u0000\u0000\u0000NO\u0003\u0010\b\u0000OP"+
		"\u0006\u0007\uffff\uffff\u0000PV\u0001\u0000\u0000\u0000QR\u0005\u0004"+
		"\u0000\u0000RS\u0003\u0010\b\u0000ST\u0006\u0007\uffff\uffff\u0000TV\u0001"+
		"\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000"+
		"V\u000f\u0001\u0000\u0000\u0000WX\u0005\b\u0000\u0000XY\u0003\u0004\u0002"+
		"\u0000YZ\u0005\t\u0000\u0000Z[\u0006\b\uffff\uffff\u0000[a\u0001\u0000"+
		"\u0000\u0000\\]\u0005\n\u0000\u0000]a\u0006\b\uffff\uffff\u0000^_\u0005"+
		"\u000b\u0000\u0000_a\u0006\b\uffff\uffff\u0000`W\u0001\u0000\u0000\u0000"+
		"`\\\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000a\u0011\u0001\u0000"+
		"\u0000\u0000\u0006\u00150BLU`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}