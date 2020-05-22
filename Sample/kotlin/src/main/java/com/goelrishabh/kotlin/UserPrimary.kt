package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */
class UserPrimary constructor(val firstName: String = "", val lastName: String = "") {

    fun printUser() {
        println("$firstName $lastName")
    }

}