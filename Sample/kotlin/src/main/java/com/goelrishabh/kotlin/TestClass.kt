package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */
fun main() {

    val user = User()
//    user.printUser()

//    val userPrimary = UserPrimary()

    val userMulti = UserMulti("")

    val initBlock = InitBlock("")

    println()
    println()
    println()

    val dataClass = DataClass("Rishabh Goel", 22)
    println(dataClass) // Prints from .toString()
    println(dataClass.component1())
    println(dataClass.component2())
    val normalClass = DataClass.NormalClass("Rishabh Goel", 22)
    print(normalClass) // Prints the object address

}
