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
                    CharStreams.fromFileName("input.txt")
                    //CharStreams.fromString(
                    //"a=((x + 3) * 44 / 12 + 2*999) /((5 + 6) * 0);"
                    //  "a=2**3**2;b=2**(3**2);c=2**9;d=2**1024**1024;d=1024**1024;"
                    //"a = 2**3**3;c=2**3*3**2;d=1-2-3;d=(-(-5));"
                    //"a=1-2-3;b=1-5;a=(-1)-3;"
                    //"a=1-(2+3);"
                )
            )
        )

    val a: Int = -2147483647
    val res = pars.prog().out

}