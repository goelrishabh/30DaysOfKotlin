package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 23-05-2020
 */
// A lambda is an expression that makes a function. But instead of declaring a named function, you declare a function that has no name.
// Higher-order func - Passing a lambda to another function
fun main() {

    val no = 20

    // Type Inference [Auto detect the var/val type]
    val aZero = {
        // Write whatever Impl you want in this Lambda
        0
    }


    val zero: () -> Int = {
        // Write whatever Impl you want in this Lambda
        0
    }

    println(zero()::class)

}
/**
 *
 * NTR
 *
 * */
// https://codelabs.developers.google.com/codelabs/kotlin-bootcamp-functions/#6