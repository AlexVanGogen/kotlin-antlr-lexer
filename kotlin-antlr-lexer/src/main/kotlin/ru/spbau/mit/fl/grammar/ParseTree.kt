package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.util.*

abstract class ParseTreeElement {
    abstract fun multilineString(indentation: String = ""): String
}

class ParseTreeLeaf(val text: String): ParseTreeElement() {
    override fun multilineString(indentation: String): String {
        return "${indentation}T[$text]\n"
    }

    override fun toString(): String {
        return "T[$text]"
    }
}

class ParseTreeNode(val name: String): ParseTreeElement() {

    val children = LinkedList<ParseTreeElement>()

    fun child(c : ParseTreeElement) : ParseTreeNode {
        children.add(c)
        return this
    }

    override fun toString(): String {
        return "Node($name) $children"
    }

    override fun multilineString(indentation: String): String {
        val sb = StringBuilder()
        sb.append("$indentation$name\n")
        children.forEach { c -> sb.append(c.multilineString("$indentation  ")) }
        return sb.toString()
    }
}

fun toParseTree(node: ParserRuleContext) : ParseTreeNode {
    val res = ParseTreeNode(node.javaClass.simpleName.removeSuffix("Context"))
    node.children.forEach { c ->
        when (c) {
            is ParserRuleContext -> res.child(toParseTree(c))
            is TerminalNode -> res.child(ParseTreeLeaf(c.text))
        }
    }
    return res
}