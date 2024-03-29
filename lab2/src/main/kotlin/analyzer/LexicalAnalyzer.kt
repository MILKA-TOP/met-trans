package analyzer

import models.CurrentElement
import models.Token
import models.exceptions.UnknownSymbolException
import java.io.IOException
import java.io.InputStream
import java.text.ParseException

class LexicalAnalyzer(private var input: InputStream) {
    private val _currElement = CurrentElement()
    val currElement: CurrentElement get() = _currElement

    init {
        nextChar()
    }

    fun nextToken() {
        while (isBlank()) nextChar()

        when (_currElement.char) {
            '('.code -> {
                nextChar()
                _currElement.token = Token.LPAREN
            }
            ')'.code -> {
                nextChar()
                _currElement.token = Token.RPAREN
            }
            '|'.code -> {
                nextChar()
                _currElement.token = Token.OR_OPERATION
            }
            '*'.code -> {
                _currElement.value = _currElement.char.toChar().toString()
                nextChar()
                _currElement.token = Token.KLEENE
            }
            '+'.code -> {
                _currElement.value = _currElement.char.toChar().toString()
                nextChar()
                _currElement.token = Token.PLUS
            }
            '?'.code -> {
                _currElement.value = _currElement.char.toChar().toString()
                nextChar()
                _currElement.token = Token.QUESTION
            }
            in 97..122 -> {
                _currElement.value = _currElement.char.toChar().toString()
                nextChar()
                _currElement.token = Token.SYMBOL
            }
            -1 -> {
                _currElement.token = Token.END
            }
            else -> throw UnknownSymbolException(symbol = _currElement.char.toChar())
        }
    }

    private fun nextChar() {
        _currElement.pos++;
        try {
            _currElement.char = input.read()
        } catch (e: IOException) {
            throw ParseException(e.message, _currElement.pos)
        }
    }

    private fun isBlank() = _currElement.char.toChar().isWhitespace()
}