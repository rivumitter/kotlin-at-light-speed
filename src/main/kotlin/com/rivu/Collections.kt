package com.rivu

import java.util.function.Consumer

object Collections {


    private var aList:List<Int> = listOf(1,2,3,4)


    val thirdElement = aList[2] // aList.get(2)

    private val mutableList = mutableListOf<Int>() // define e,ty list

    private val mySet = setOf(1,2,44,44,1)

    val isPresent = 1 in aList


    // maps

    val phoneBook: Map<String, Int> = mapOf(
        Pair("rivu", 123),
        "Alice" to 999 // syntax suger
    )




    @JvmStatic
    fun main(args: Array<String>) {

        val intList = aList.map { num -> num * 3 }
            .filter { num -> num % 2 == 0 }
            .toList()

        println(intList)

        intList.forEach{ t -> print(t) }

        println()

        val myList: ArrayList<Int>


        mutableList.add(11)

        println(mutableList)


        println(phoneBook)

        phoneBook.forEach { (k, v) ->  println("$k $v") }

    }
}