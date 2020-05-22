package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */
private val variable: String = "Kotlin"

fun main() {

    println("Hello $variable")

    println("Hello ${variable.toUpperCase()}")

    println("Hello ${if (variable.length >= 50) variable else ""}")

    val par = """
        Hello Dear,
        This is a simple paragraph, showing
        how
                cool
                        the
                                kotlin
                                        is!
    """.trimIndent()

    println(par + " Yeah it is!")
    // OR
    println("$par Yeah it is!")

}