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

    val cloneOfDataClass = DataClass("", 0)
    cloneOfDataClass.name = dataClass.name
    cloneOfDataClass.age = dataClass.age
    // OR
    val (name, age) = dataClass // Only works for "Component" aka DATA CLASSES

    val normalClass = DataClass.NormalClass("Rishabh Goel", 22)
    print(normalClass) // Prints the object address

    println()
    println()
    println()

    var user1 = DataClass("Rishabh Goel", 22)
    var user2 = DataClass("Shubham Modi", 23)

    println(user1)
    println(user2)

    user2 = user1.copy() // Useful when there are large object to reuse, "WORKS ON DATA CLASSES ONLY"

    println(user2)

    println()
    println()
    println()

    // TODO Be aware of List as there is SHALLOW COPY not DEEP COPY

    val list1 = listOf("A", "B", "C", "D")
    var copyClass1 = CopyClass("Rishabh Goel", list1)

    val list2 = listOf("E", "F", "G", "H")
    var copyClass2 = CopyClass("Shubham Modi", list2)

    println(copyClass1)
    println(copyClass2)

    copyClass2 = copyClass1.copy("Hello")

    println(copyClass2)

}
