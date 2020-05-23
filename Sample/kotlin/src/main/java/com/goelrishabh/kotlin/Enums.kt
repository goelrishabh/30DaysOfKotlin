package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */

fun main() {

    println(AccountType.valueOf("bronze".toUpperCase()))
    println(AccountType.PLATINUM.discountPercentage)
    println(AccountType.PLATINUM.subs)

    println(AccountType.BRONZE.calculate())

}

enum class AccountType(val discountPercentage: Int, val subs: Int) {
    BRONZE(5, 50) {
        override fun calculate(): Int {
            return discountPercentage * subs
        }
    },
    SILVER(10, 100) {
        override fun calculate(): Int {
            return discountPercentage * subs
        }
    },
    GOLD(15, 200) {
        override fun calculate(): Int {
            return discountPercentage * subs
        }
    },
    PLATINUM(20, 150) {
        override fun calculate(): Int {
            return discountPercentage * subs
        }
    },
    RUBY(35, 29) {
        override fun calculate(): Int {
            return discountPercentage * subs
        }
    };

    abstract fun calculate(): Int
}