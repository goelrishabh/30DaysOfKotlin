package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */
fun main() {

    val dataClass1 = DataClass("Rishabh Goel", 22)
    val dataClass2 = DataClass("Rishabh Goel", 22)

    val normalClass1 = DataClass.NormalClass("Rishabh Goel", 22)
    val normalClass2 = DataClass.NormalClass("Rishabh Goel", 22)

    //Structural

    val a = 1;
    val b = 1;

//    println(a == b)

    println(dataClass1 == dataClass2) // true as values are compared
    println(normalClass1 == normalClass2) // false as addresses are compared NEED TO BE A "DATA CLASS" to actually compare the Values


    //Referential
//
//    val c = 1;
//    val d = 1;
//    println(c === d) // Deprecated for numbers, chars & boolean i.e Primitives

    val c = "Hello"
    val d = "Hello"

//    println(c === d)

    println(dataClass1 === dataClass2) // false "address comparison"
    println(normalClass1 === normalClass2) // false "address comparison"

}