package util

import analyzer.Parser
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.*
import guru.nidi.graphviz.model.Graph
import guru.nidi.graphviz.model.LinkSource
import guru.nidi.graphviz.model.Node
import models.Tree
import java.io.File

fun Tree.draw() {
    this.draw("parser-tree.png")
}

fun Tree.draw(fileName: String? = null) {
    val g: Graph = graph("parser-tree").directed()
        .with(downDraw2(node(this), this, this.children))

    Graphviz.fromGraph(g)
        .height(2500)
        .render(Format.PNG)
        .toFile(File("output/${fileName ?: "parser-tree.png"}"))

}

private fun downDraw2(parentNode: Node, parentTree: Tree, children: List<Tree>): List<LinkSource> {
    val childrenList = children.map { Pair(it, node(it)) }
    val output: MutableList<LinkSource> = childrenList.map { parentNode.link(to(it.second)) }.toMutableList()
    childrenList.forEach {
        output.addAll(downDraw2(it.second, it.first, it.first.children))
    }

    if (output.isEmpty()) {
        if (parentTree.node == Parser.EPS)
            output.add(parentNode.with(Color.BLUE))
        else
            output.add(parentNode.with(Color.RED))
    }
    return output
}

private fun node(tree: Tree) = node(getRandomString(24)).with(Label.of(tree.node))

fun getRandomString(length: Int): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}