// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab4/src/main/kotlin\CustomGrammarExpression.g4 by ANTLR 4.10.1
package custom;

import models.GrammarData;
import models.TerminalState;
import models.NonTerminalState;
import models.RuleTarget;
import models.NonTerminalTarget;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CustomGrammarExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CustomGrammarExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(CustomGrammarExpressionParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(CustomGrammarExpressionParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarNodeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarNodeValue(CustomGrammarExpressionParser.GrammarNodeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarHeader(CustomGrammarExpressionParser.GrammarHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarTokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarTokens(CustomGrammarExpressionParser.GrammarTokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarNonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarNonTerminal(CustomGrammarExpressionParser.GrammarNonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#allTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTargets(CustomGrammarExpressionParser.AllTargetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargets(CustomGrammarExpressionParser.TargetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#targetsPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetsPoint(CustomGrammarExpressionParser.TargetsPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(CustomGrammarExpressionParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#targetCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetCode(CustomGrammarExpressionParser.TargetCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#terminalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalVariable(CustomGrammarExpressionParser.TerminalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#grammarTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarTerminal(CustomGrammarExpressionParser.GrammarTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#terminalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalParameter(CustomGrammarExpressionParser.TerminalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CustomGrammarExpressionParser#functionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCode(CustomGrammarExpressionParser.FunctionCodeContext ctx);
}