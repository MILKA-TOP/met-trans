// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab3/src/main/kotlin\TerminalExpression.g4 by ANTLR 4.10.1

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TerminalExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TerminalExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TerminalExpressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(TerminalExpressionParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TerminalExpressionParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#exprPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPoint(TerminalExpressionParser.ExprPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#multDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivOp(TerminalExpressionParser.MultDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#multDivOpPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivOpPoint(TerminalExpressionParser.MultDivOpPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#powOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowOp(TerminalExpressionParser.PowOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#unar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnar(TerminalExpressionParser.UnarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TerminalExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(TerminalExpressionParser.TermContext ctx);
}