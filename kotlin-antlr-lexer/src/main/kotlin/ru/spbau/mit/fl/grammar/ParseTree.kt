package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.tree.TerminalNode
import java.io.ByteArrayOutputStream
import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.PrintStream
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
        children.forEach { sb.append(it.multilineString("$indentation  ")) }
        return sb.toString()
    }
}

fun toParseTree(node: ParserRuleContext) : ParseTreeNode {
    val res = ParseTreeNode(node.javaClass.simpleName.removeSuffix("Context"))
    node.children.forEach { c ->
        when (c) {
            is ParserRuleContext -> res.child(toParseTree(c))
        }
    }
    return res
}

fun traverse(parser: LParser): String {
    val capturedOutputStream = ByteArrayOutputStream()
    val ps = PrintStream(capturedOutputStream)
    System.setOut(ps)
    ParseTreeWalker.DEFAULT.walk(LParserTreeListener(), parser.program())
    System.setOut(PrintStream(FileOutputStream(FileDescriptor.out)))
    return String(capturedOutputStream.toByteArray())
}
