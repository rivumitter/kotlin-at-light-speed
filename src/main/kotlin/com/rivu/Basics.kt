package com.rivu

object Basics {

    @JvmStatic
    fun main(args: Array<String>) {

        val meaningOfLife: Int = 42; // val is const or final

        var objectiveInLife: Int = 32; // var can change

        objectiveInLife = 31;

        // Int , Boolean , Char , Short , Long , Float , Double

        // string

        val aString: String = "I love kotlin"
        val aChar: Char = 'S';

        val combineString = "I "+ "Love Kotlin";

        val aTemplateString: String = "The meaning of life is $meaningOfLife"


        // expressions

        val aCondition = 1 > 2

        if(aCondition) {
            println("...")
        }

        // in kotlin it can be a expressions assigned to avalue
        // we r storing the output this if else statement in a var

        val anIfCondition = if(aCondition) 42 else 999

        println(anIfCondition)



        // switch expe just like java enhanced switch
        // but with when() keyword

        when(meaningOfLife) {
            42 -> println("the meaning of life from HGG")
            43 -> println("not meaning of life")
            else -> println("something else")
        }

        // it evaluates the value and returns a value
        val whenValue = when(meaningOfLife) {
            42 -> "the meaning of life from HGG"
            43 -> "not meaning of life"
            else -> "something else"
        }

        println(whenValue)



        // looping

//        println("inclusive range")
//        for (i in 10 downTo 1)
//            println(i)


        // collection loop

        var aList = listOf(1, 2, 3, 4)

//        for (num in aList)
//            println(num)


        // function

        fun concatinateString(aString: String, count:Int): String {
            var result = ""
            for(i in 1..count)
                result+=aString

            return result
        }

        println(concatinateString("rivu", 2))

        // single expr function syntax

        fun combineString(strA: String, strB: String): String = "$strA...$strB"

        println(combineString("rivu", "arghya"))

        // unit  = void return

        fun returningVoid(arg: String): Unit {
            println("this is a string $arg")
        }

        returningVoid("mitra")

    }
}