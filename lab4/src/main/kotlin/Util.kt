import gen.reg.ParserNode
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Label
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.*
import guru.nidi.graphviz.model.Graph
import guru.nidi.graphviz.model.LinkSource
import guru.nidi.graphviz.model.Node
import java.io.File

fun ParserNode.draw() {
    this.draw("parser-tree.png")
}

fun ParserNode.draw(fileName: String? = null) {
    val g: Graph = graph("parser-tree").directed()
        .with(downDraw2(node(this), this))

    Graphviz.fromGraph(g)
        .height(2500)
        .render(Format.PNG)
        .toFile(File("output/${fileName ?: "parser-tree.png"}"))

}

private fun downDraw2(parentNode: Node, parentTree: ParserNode): List<LinkSource> {
    val childrenList = parentTree.tokenChildren.map { Pair(it, node(it)) }.toMutableList()
    if (childrenList.isEmpty() && parentTree.tokenName.first().isLowerCase()) {
        childrenList.add(Pair(epsTreeNode, node(epsTreeNode)))
    }
    val output: MutableList<LinkSource> = childrenList.map { parentNode.link(to(it.second)) }.toMutableList()

    childrenList.forEach {
        output.addAll(downDraw2(it.second, it.first))
    }

    if (output.isEmpty()) {
        if (parentTree.tokenName == "EPS")
            output.add(parentNode.with(Color.BLUE))
        else
            output.add(parentNode.with(Color.RED))
    }
    return output
}

private fun node(tree: ParserNode) = node(getRandomString(24)).with(
    Label.of(
        if (tree.tokenName.first().isUpperCase()) tree.tokenValue else tree.tokenName
    )
)

fun getRandomString(length: Int): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

private val epsTreeNode = ParserNode("EPS", tokenValue = "ε")