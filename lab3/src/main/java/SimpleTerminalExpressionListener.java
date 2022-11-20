// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab3/src/main/kotlin\SimpleTerminalExpression.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleTerminalExpressionParser}.
 */
public interface SimpleTerminalExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleTerminalExpressionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleTerminalExpressionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SimpleTerminalExpressionParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SimpleTerminalExpressionParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleTerminalExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleTerminalExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 */
	void enterExprPoint(SimpleTerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 */
	void exitExprPoint(SimpleTerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOp(SimpleTerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOp(SimpleTerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 */
	void enterMultDivOpPoint(SimpleTerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 */
	void exitMultDivOpPoint(SimpleTerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 */
	void enterPowOp(SimpleTerminalExpressionParser.PowOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 */
	void exitPowOp(SimpleTerminalExpressionParser.PowOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#powOpPoint}.
	 * @param ctx the parse tree
	 */
	void enterPowOpPoint(SimpleTerminalExpressionParser.PowOpPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#powOpPoint}.
	 * @param ctx the parse tree
	 */
	void exitPowOpPoint(SimpleTerminalExpressionParser.PowOpPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleTerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SimpleTerminalExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleTerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SimpleTerminalExpressionParser.TermContext ctx);
}