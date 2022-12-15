// Generated from C:/Users/MILKA/Desktop/DESKTOP_ELEMENTS/HW/met_trans/lab4/src/main/kotlin\CustomGrammarExpression.g4 by ANTLR 4.10.1
package custom;

import models.GrammarData;
import models.TerminalState;
import models.NonTerminalState;
import models.RuleTarget;
import models.NonTerminalTarget;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomGrammarExpressionParser}.
 */
public interface CustomGrammarExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(CustomGrammarExpressionParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(CustomGrammarExpressionParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(CustomGrammarExpressionParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(CustomGrammarExpressionParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarNodeValue}.
	 * @param ctx the parse tree
	 */
	void enterGrammarNodeValue(CustomGrammarExpressionParser.GrammarNodeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarNodeValue}.
	 * @param ctx the parse tree
	 */
	void exitGrammarNodeValue(CustomGrammarExpressionParser.GrammarNodeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarHeader}.
	 * @param ctx the parse tree
	 */
	void enterGrammarHeader(CustomGrammarExpressionParser.GrammarHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarHeader}.
	 * @param ctx the parse tree
	 */
	void exitGrammarHeader(CustomGrammarExpressionParser.GrammarHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarTokens}.
	 * @param ctx the parse tree
	 */
	void enterGrammarTokens(CustomGrammarExpressionParser.GrammarTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarTokens}.
	 * @param ctx the parse tree
	 */
	void exitGrammarTokens(CustomGrammarExpressionParser.GrammarTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarNonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterGrammarNonTerminal(CustomGrammarExpressionParser.GrammarNonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarNonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitGrammarNonTerminal(CustomGrammarExpressionParser.GrammarNonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#allTargets}.
	 * @param ctx the parse tree
	 */
	void enterAllTargets(CustomGrammarExpressionParser.AllTargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#allTargets}.
	 * @param ctx the parse tree
	 */
	void exitAllTargets(CustomGrammarExpressionParser.AllTargetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#targets}.
	 * @param ctx the parse tree
	 */
	void enterTargets(CustomGrammarExpressionParser.TargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#targets}.
	 * @param ctx the parse tree
	 */
	void exitTargets(CustomGrammarExpressionParser.TargetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#targetsPoint}.
	 * @param ctx the parse tree
	 */
	void enterTargetsPoint(CustomGrammarExpressionParser.TargetsPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#targetsPoint}.
	 * @param ctx the parse tree
	 */
	void exitTargetsPoint(CustomGrammarExpressionParser.TargetsPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(CustomGrammarExpressionParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(CustomGrammarExpressionParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#targetCode}.
	 * @param ctx the parse tree
	 */
	void enterTargetCode(CustomGrammarExpressionParser.TargetCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#targetCode}.
	 * @param ctx the parse tree
	 */
	void exitTargetCode(CustomGrammarExpressionParser.TargetCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#terminalVariable}.
	 * @param ctx the parse tree
	 */
	void enterTerminalVariable(CustomGrammarExpressionParser.TerminalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#terminalVariable}.
	 * @param ctx the parse tree
	 */
	void exitTerminalVariable(CustomGrammarExpressionParser.TerminalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#grammarTerminal}.
	 * @param ctx the parse tree
	 */
	void enterGrammarTerminal(CustomGrammarExpressionParser.GrammarTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#grammarTerminal}.
	 * @param ctx the parse tree
	 */
	void exitGrammarTerminal(CustomGrammarExpressionParser.GrammarTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#terminalParameter}.
	 * @param ctx the parse tree
	 */
	void enterTerminalParameter(CustomGrammarExpressionParser.TerminalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#terminalParameter}.
	 * @param ctx the parse tree
	 */
	void exitTerminalParameter(CustomGrammarExpressionParser.TerminalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomGrammarExpressionParser#functionCode}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCode(CustomGrammarExpressionParser.FunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomGrammarExpressionParser#functionCode}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCode(CustomGrammarExpressionParser.FunctionCodeContext ctx);
}