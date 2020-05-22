package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */

fun main() {

    println(AccountType.valueOf("bronze".toUpperCase()))
    println(AccountType.PLATINUM.discountPercentage)
    println(AccountType.PLATINUM.subs)

}

enum class AccountType(val discountPercentage: Int, val subs: Int) {
    BRONZE(5, 50),
    SILVER(10, 100),
    GOLD(15, 200),
    PLATINUM(20, 150),
    RUBY(35, 29)
}