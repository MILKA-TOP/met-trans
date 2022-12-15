package generate

import models.GrammarData

class FirstFollowGenerate(val grammarData: GrammarData) {

    val firstMap: HashMap<String, HashSet<String>> = hashMapOf()
    val followMap: HashMap<String, HashSet<String>> = hashMapOf()

    companion object {
        const val _EPS = "EPS"
        const val _DOLLAR = "$"
    }

    init {
        writeMaps()
        firstGenerate()

        for (key in firstMap.keys) {
            print("$key: ")
            println(firstMap[key].toString())
        }
        println("=====")
        followGenerate()
        for (key in followMap.keys) {
            print("$key: ")
            println(followMap[key].toString())
        }

    }

    private fun writeMaps() {
        grammarData.nonTerminalList.forEach { firstMap[it.name] = hashSetOf() }
        grammarData.nonTerminalList.forEach { followMap[it.name] = hashSetOf() }
    }

    private fun firstGenerate() {
        var changed: Boolean = true

        while (changed) {
            changed = false

            for (nonTerm in grammarData.nonTerminalList) {
                for (nonTermRules in nonTerm.targets) {
                    if (nonTermRules.statesList.isNotEmpty()) {
                        val firstFromTarget = nonTermRules.statesList.first()
                        val pushedData = mutableListOf<String>()
                        if (grammarData.terminalList.find { it.name == firstFromTarget.name } != null) {
                            pushedData.add(firstFromTarget.name)
                        } else {
                            firstMap[firstFromTarget.name]?.let {
                                pushedData.addAll(it)
                            }
                        }

                        val sizeBefore = firstMap[nonTerm.name]!!.size
                        firstMap[nonTerm.name]!!.addAll(pushedData)

                        changed = changed || (sizeBefore != firstMap[nonTerm.name]!!.size)
                    }
                }
            }
        }
    }

    private fun followGenerate() {
        var changed: Boolean = true
        grammarData.nonTerminalList.firstOrNull()?.let {
            followMap[it.name]!!.add(_DOLLAR)
        }

        while (changed) {
            changed = false

            for (nonTerm in grammarData.nonTerminalList) {
                for (nonTermRules in nonTerm.targets) {
                    val stateSize = nonTermRules.statesList.size
                    for (index in nonTermRules.statesList.indices) {
                        val b = nonTermRules.statesList[index].name

                        if (grammarData.terminalList.find { it.name == b } == null) {
                            val gamma = if (index == stateSize - 1) _EPS
                            else nonTermRules.statesList[index + 1].name

                            val pushedData = mutableListOf<String>()
                            if (gamma != _EPS) {
                                if (grammarData.terminalList.find { it.name == gamma } != null) {
                                    pushedData.add(gamma)
                                } else {
                                    pushedData.addAll(firstMap[gamma]!!)
                                }
                            } else {
                                pushedData.add(_EPS)
                            }
                            if (pushedData.contains(_EPS)) {
                                pushedData.addAll(followMap[nonTerm.name]!!)
                            }
                            pushedData.removeAll { it == _EPS }

                            val sizeBefore = followMap[b]!!.size
                            followMap[b]!!.addAll(pushedData)

                            changed = changed || (sizeBefore != followMap[b]!!.size)
                        }
                    }
                }
            }
        }

    }

}