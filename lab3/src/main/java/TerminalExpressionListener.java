// Generated from C:/Users/SKAT/Desktop/HW/met-trans/lab3/src/main/kotlin\TerminalExpression.g4 by ANTLR 4.10.1

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TerminalExpressionParser}.
 */
public interface TerminalExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TerminalExpressionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TerminalExpressionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(TerminalExpressionParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(TerminalExpressionParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TerminalExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TerminalExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 */
	void enterExprPoint(TerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 */
	void exitExprPoint(TerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOp(TerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOp(TerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOpPoint(TerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOpPoint(TerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 */
	void enterPowOp(TerminalExpressionParser.PowOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 */
	void exitPowOp(TerminalExpressionParser.PowOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#unar}.
	 * @param ctx the parse tree
	 */
	void enterUnar(TerminalExpressionParser.UnarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#unar}.
	 * @param ctx the parse tree
	 */
	void exitUnar(TerminalExpressionParser.UnarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TerminalExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TerminalExpressionParser.TermContext ctx);
}