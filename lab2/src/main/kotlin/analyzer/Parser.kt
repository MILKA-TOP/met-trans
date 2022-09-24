package analyzer

import models.Token
import models.Tree
import java.io.InputStream

class Parser {

    private lateinit var analyzer: LexicalAnalyzer

    fun parse(line: String) = parse(line.byteInputStream())

    private fun parse(input: InputStream): Tree {
        analyzer = LexicalAnalyzer(input).also { it.nextToken() }
        return eState()
    }

    private fun eState(): Tree = when (analyzer.currElement.token) {
        Token.SYMBOL, Token.LPAREN -> Tree("E", ePrimeState())
        Token.END, Token.RPAREN -> Tree("E", EPS)
        else -> throw IllegalStateException()
    }

    private fun ePrimeState(): Tree = when (analyzer.currElement.token) {
        Token.SYMBOL, Token.LPAREN -> Tree("E'", listOf(tState(), ePrimeState()))
        Token.END, Token.RPAREN -> Tree("E'", EPS)
        else -> throw IllegalStateException()
    }

    private fun tState(): Tree = when (analyzer.currElement.token) {
        Token.SYMBOL, Token.LPAREN -> Tree("T", listOf(dState(), tPrimeState()))
        Token.END, Token.RPAREN -> Tree("T", EPS)
        else -> throw IllegalStateException()
    }

    private fun tPrimeState(): Tree = when (analyzer.currElement.token) {
        Token.OR_OPERATION -> {
            analyzer.nextToken()
            Tree("T'", listOf(Tree("|"), dState()))
        }
        Token.END, Token.RPAREN, Token.LPAREN, Token.SYMBOL -> Tree("T'", EPS)
        else -> throw IllegalStateException()
    }


    private fun dState(): Tree = when (analyzer.currElement.token) {
        Token.SYMBOL, Token.LPAREN -> Tree("D", listOf(fState(), dPrimeState()))
        Token.END, Token.RPAREN -> Tree("D", EPS)
        else -> throw IllegalStateException()
    }

    private fun dPrimeState(): Tree {
        return when (analyzer.currElement.token) {
            Token.KLEENE -> {
                analyzer.nextToken()
                Tree("D'", "*")
            }
            Token.OR_OPERATION, Token.SYMBOL, Token.LPAREN, Token.END, Token.RPAREN ->
                Tree("D'", EPS)
            else -> throw IllegalStateException()
        }
    }


    private fun fState(): Tree {
        return when (analyzer.currElement.token) {
            Token.SYMBOL -> Tree("F", "${analyzer.currElement.symbol.toChar()}")
                .also { analyzer.nextToken() }
            Token.LPAREN -> {
                analyzer.nextToken()
                val eState = eState()

                if (analyzer.currElement.token != Token.RPAREN) throw IllegalStateException()

                Tree("F", listOf(Tree("("), eState, Tree(")")))
                    .also { analyzer.nextToken() }
            }
            else -> throw IllegalStateException()
        }
    }

    companion object {
        const val EPS = "ε"
    }
}