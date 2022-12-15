import custom.CustomGrammarExpressionLexer
import custom.CustomGrammarExpressionParser
import generate.FirstFollowGenerate
import generate.LexerGenerate
import generate.ParserGenerate
import generate.TokenGenerate
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    genCalc()
    genReg()
}

fun genCalc() {
    val grammarFileName = "Calculator"
    val pars =
        CustomGrammarExpressionParser(
            CommonTokenStream(
                CustomGrammarExpressionLexer(
                    CharStreams.fromFileName("examples/$grammarFileName")
                )
            )
        )

    val path = "src/main/kotlin/gen/calc/"
    val packageName = "gen.calc"
    val grammar = pars.read()

    TokenGenerate().createTokenClass(grammar.data, path, packageName)
    LexerGenerate().createLexerClass(grammar.data, path, packageName)
    ParserGenerate(FirstFollowGenerate(grammar.data)).createParserClass(grammar.data, path, packageName)
}

fun genReg() {
    val grammarFileName = "Reg"
    val pars =
        CustomGrammarExpressionParser(
            CommonTokenStream(
                CustomGrammarExpressionLexer(
                    CharStreams.fromFileName("examples/$grammarFileName")
                )
            )
        )

    val path = "src/main/kotlin/gen/reg/"
    val packageName = "gen.reg"
    val grammar = pars.read()

    TokenGenerate().createTokenClass(grammar.data, path, packageName)
    LexerGenerate().createLexerClass(grammar.data, path, packageName)
    ParserGenerate(FirstFollowGenerate(grammar.data)).createParserClass(grammar.data, path, packageName)
}