package models

data class CurrentElement(
    var pos: Int = 0,
    var char: Int = 0,
    var token: Token = Token.END,
    var symbol: Int = 0
)