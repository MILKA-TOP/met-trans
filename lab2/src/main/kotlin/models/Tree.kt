package models

class Tree {

    var node: String = ""
    val children = ArrayList<Tree>()

    constructor(node: String) {
        this.node = node
    }

    constructor(node: String, children: List<Tree>) {
        this.node = node
        this.children.addAll(children)
    }

    constructor(node: String, child: Tree) {
        this.node = node
        this.children.add(child)
    }

    constructor(node: String, childName: String) {
        this.node = node
        this.children.add(Tree(childName))
    }


    override fun toString(): String {
        return "Tree($node: $children)"
    }

}