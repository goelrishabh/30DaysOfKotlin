package com.goelrishabh.kotlin

/**
 * @project Sample
 * @author rishabh-goel on 22-05-2020
 */

fun main() {

    println(AccountType.valueOf("bronze".toUpperCase()))
    println(AccountType.PLATINUM.discountPercentage)
    println(AccountType.PLATINUM.subs)

    println(AccountType.BRONZE.calculateAbstract())

    for (value in AccountType.values()) {
        println(value)
    }
    println()
    // OR
    println()
    AccountType.values().forEach {
        println(it)
    }

    println()

    println(AccountType.calculate(AccountType.BRONZE))


}

enum class AccountType(val discountPercentage: Int, val subs: Int) {
    BRONZE(5, 50) {
        override fun calculateAbstract(): Int {
            return discountPercentage * subs
        }
    },
    SILVER(10, 100) {
        override fun calculateAbstract(): Int {
            return discountPercentage * subs
        }
    },
    GOLD(15, 200) {
        override fun calculateAbstract(): Int {
            return discountPercentage * subs
        }
    },
    PLATINUM(20, 150) {
        override fun calculateAbstract(): Int {
            return discountPercentage * subs
        }
    },
    RUBY(35, 29) {
        override fun calculateAbstract(): Int {
            return discountPercentage * subs
        }
    };

    // Local Fun
    fun calculateLocal(accountType: AccountType): Int {
        return accountType.discountPercentage * accountType.subs
    }

    abstract fun calculateAbstract(): Int

    companion object {

        fun calculate(accountType: AccountType): Int {
            return accountType.calculateLocal(accountType)
        }

    }

}