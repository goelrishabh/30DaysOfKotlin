package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */

//Filters are a handy way to get part of a list based on some condition.
fun main() {

    val names = listOf("Rishabh", "Shubhi", "Aman", "Aakash", "Suresh", "Ramesh")

//    println(names.filter { it[0] == 'R' })

//    val filteredNames = names.filter { it[0] == 'R' }
//    println(filteredNames)

    /**
     *  Is the result list created immediately, or when the list is accessed?
     *  In Kotlin, it happens whichever way you need it to.
     *  By default, filter is eager, and each time you use the filter, a list is created.
     * */
    // To make the filter lazy, you can use a Sequence,
    // which is a collection that can only look at one item at a time,
    // starting at the beginning, and going to the end.

    val eagerNames = names.filter { it[0] == 'R' }
    println("eager $eagerNames")

    val lazyNames = names.asSequence().filter { it[0] == 'R' }
    println("lazy $lazyNames") // won't hold a new list—it'll hold a Sequence of the list elements and knowledge of the filter to apply to those elements

    println("lazyList ${lazyNames.toList()}") // Force Evaluation

}