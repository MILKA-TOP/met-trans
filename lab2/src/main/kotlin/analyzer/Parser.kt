package analyzer

import models.Token
import models.Tree
import models.exceptions.ParserStateException
import java.io.InputStream

class Parser {

    private lateinit var analyzer: LexicalAnalyzer

    fun parse(line: String) = parse(line.byteInputStream())

    private fun parse(input: InputStream): Tree {
        analyzer = LexicalAnalyzer(input).also { it.nextToken() }
        return eState()
    }

    private fun getToken() = analyzer.currElement.token

    private fun eState(): Tree = when (getToken()) {
        Token.SYMBOL, Token.LPAREN -> Tree("E", listOf(tState(), eState()))
        Token.END, Token.RPAREN -> Tree("E", EPS)
        else -> throw ParserStateException(getToken().toString(), "E")
    }

    private fun tState(): Tree = when (getToken()) {
        Token.SYMBOL, Token.LPAREN -> Tree("T", listOf(dState(), tPrimeState()))
        Token.END, Token.RPAREN -> Tree("T", EPS)
        else -> throw ParserStateException(getToken().toString(), "T")
    }

    private fun tPrimeState(): Tree = when (getToken()) {
        Token.OR_OPERATION -> {
            analyzer.nextToken()
            Tree("T'", listOf(Tree("|"), dState()))
        }
        Token.END, Token.RPAREN, Token.LPAREN, Token.SYMBOL -> Tree("T'", EPS)
        else -> throw ParserStateException(getToken().toString(), "T'")
    }


    private fun dState(): Tree = when (getToken()) {
        Token.SYMBOL, Token.LPAREN -> Tree("D", listOf(fState(), dPrimeState()))
        Token.END, Token.RPAREN -> Tree("D", EPS)
        else -> throw ParserStateException(getToken().toString(), "D")
    }

    private fun dPrimeState(): Tree = when (getToken()) {
        Token.KLEENE -> {
            analyzer.nextToken()
            Tree("D'", "*")
        }
        Token.OR_OPERATION, Token.SYMBOL, Token.LPAREN, Token.END, Token.RPAREN ->
            Tree("D'", EPS)
        else -> throw ParserStateException(getToken().toString(), "D'")
    }


    private fun fState(): Tree = when (getToken()) {
        Token.SYMBOL -> Tree("F", analyzer.currElement.value)
            .also { analyzer.nextToken() }
        Token.LPAREN -> {
            analyzer.nextToken()
            val eState = eState()

            if (getToken() != Token.RPAREN) throw ParserStateException(getToken().toString(), "F")

            Tree("F", listOf(Tree("("), eState, Tree(")")))
                .also { analyzer.nextToken() }
        }
        else -> throw ParserStateException(getToken().toString(), "F")
    }

    companion object {
        const val EPS = "ε"
    }
}