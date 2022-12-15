package models

data class GrammarData(
    var name: String = "",
    var header: String = "",
    var defaultType: String = "",
    var defaultArg: String = "",
    val terminalList: MutableList<TerminalState> = mutableListOf(),
    val nonTerminalList: MutableList<NonTerminalState> = mutableListOf(),
    )

data class NonTerminalState(
    var name: String = "",
    var argName: String = "",
    var argClass: String = "",
    var targets: MutableList<RuleTarget> = mutableListOf()

)

data class RuleTarget(
    val statesList: MutableList<NonTerminalTarget> = mutableListOf()
)

data class NonTerminalTarget(
    var name: String = "",
    var parameter: String = "",
    var code: String = ""
)

data class TerminalState(
    var name: String = "",
    var value: String = ""
)