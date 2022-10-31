package ru.main

import TerminalExpressionLexer
import TerminalExpressionParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    val pars =
        TerminalExpressionParser(
            CommonTokenStream(
                TerminalExpressionLexer(
                    CharStreams.fromString(
                        "с=+"
                    )
                )
            )
        )

    val res = pars.prog().out
    println("\n=====\n")
    println(res)

}