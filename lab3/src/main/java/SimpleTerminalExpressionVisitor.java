// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab3/src/main/kotlin\SimpleTerminalExpression.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleTerminalExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleTerminalExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimpleTerminalExpressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SimpleTerminalExpressionParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SimpleTerminalExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPoint(SimpleTerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivOp(SimpleTerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivOpPoint(SimpleTerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOp(SimpleTerminalExpressionParser.PowOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#powOpPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOpPoint(SimpleTerminalExpressionParser.PowOpPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleTerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpleTerminalExpressionParser.TermContext ctx);
}