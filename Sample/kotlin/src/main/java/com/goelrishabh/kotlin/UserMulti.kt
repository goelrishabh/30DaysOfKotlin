package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */
class UserMulti constructor(val firstName: String = "", val lastName: String = "") {

    //Secondary Constructor
    constructor(firstName: String) : this(firstName, "unknown") {
        // Do some work if req
        println("2nd constructor")
    }

    constructor() : this("unknown", "unknown") {
        // Do some work if req
        println("3rd constructor")
    }

    fun printUser() {
        println("$firstName $lastName")
    }

}