package ru.main

import TerminalExpressionLexer
import TerminalExpressionParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

private val inResMap = hashMapOf(
    File("./tests/default_calc_in") to File("./tests/default_calc_out"),
    File("./tests/hard_calc_in") to File("./tests/hard_calc_out"),
    File("./tests/one_var_in") to File("./tests/one_var_out"),
    File("./tests/simple_calc_in") to File("./tests/simple_calc_out"),
)

fun main() {
    inResMap.forEach { (testFile, resultFile) ->
        println("============================")
        println("[[[START TESTING ${testFile.name}]]]")
        val testText = testFile.getText()
        val correctResultText = resultFile.getText()
        val inputParserResult = startTest(testText)
        println("----------------------------\nCode result:")
        println(inputParserResult)
        if (inputParserResult == correctResultText) {
            println("TEST IS CORRECT")
        } else {
            println("!!!!!!!!TEST IS INCORRECT!!!!!!!!\nExcepted:")
            println(correctResultText)
        }
        println("============================")
    }
}

private fun File.getText(): String = this.bufferedReader().use { it.readText() }.replace("\r", "")

private fun startTest(text: String): String {
    val parser = TerminalExpressionParser(CommonTokenStream(TerminalExpressionLexer(CharStreams.fromString(text))))
    return parser.prog().out
}