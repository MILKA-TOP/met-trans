import custom.CustomGrammarExpressionLexer
import custom.CustomGrammarExpressionParser
import generate.FirstFollowGenerate
import generate.LexerGenerate
import generate.ParserGenerate
import generate.TokenGenerate
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    genBadGrammar()
}

fun genBadGrammar() {
    val grammarFileName = "BadGrammar"
    val pars =
        CustomGrammarExpressionParser(
            CommonTokenStream(
                CustomGrammarExpressionLexer(
                    CharStreams.fromFileName("examples/$grammarFileName")
                )
            )
        )

    val path = "src/main/kotlin/gen/badgrammar/"
    val packageName = "gen.badgrammar"
    val grammar = pars.read()

    TokenGenerate().createTokenClass(grammar.data, path, packageName)
    LexerGenerate().createLexerClass(grammar.data, path, packageName)
    ParserGenerate(FirstFollowGenerate(grammar.data)).createParserClass(grammar.data, path, packageName)
}

