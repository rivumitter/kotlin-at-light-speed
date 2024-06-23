package com.rivu

object OOPBasic {

    open class Pet { // open is to make class extensible
        // by-default class are final
        val age = 0

        // methods
        open fun eat() {
            println("I am eating ..")
        }

        companion object { // prop & method for pet type not obj kind of static
            var loveHuman: Boolean = true

            fun showLove() {
                println("showing love")
            }
        }
    }

    private val aPet = Pet()

    // inheritance

    class Dog(val name: String) : Pet() { //  see here name is not property unless we make them val or var

        // additional prop
        // to override method u need to make the parent method open too
        override fun eat() {
            println("I am eating cheetos ..")
        }

    }

    val aDog = Dog("rik")


    // subType polymorphism

    val myPet: Pet = Dog("doggoo")


    abstract class WalikingPet {
        abstract fun walk(): Unit
    }

    // interface

    interface Carnivore {
        fun eat(animal: Pet): Unit

    }

    interface ColdBloded {
        fun eat(animal: Pet): Unit

    }

    // a class can inherit from one class + implements >0 interface

    class Snake : Pet(), Carnivore, ColdBloded {
        override fun eat(animal: Pet) {
            println("I am sollowing haha")
        }

        override fun eat() {
            println("cold eating ")
        }
    }

    // objects and companions

    object MySingleTon { // singleton
        val myInt = 40
        fun myProp(num: Int): String {
            return "my num is $num"
        }
    }

    // data class

    data class Person(val name:String, val age: Int) // dtos

    // equals , hashCode , toString can generate like records
    // copy
    // destructuring

    // exception is same as java

    // generics ( its big concept )

    interface MyLinkedList<T> {
        fun head() : T
        fun tail(): MyLinkedList<T>

    }


    // in collection

    val numbers: List<Int> = listOf(1,2,3,4);






    @JvmStatic
    fun main(args: Array<String>) {

        aPet.eat()

        aDog.eat()

        println(aDog.name)

        myPet.eat()

        println(MySingleTon.myInt)
        println(MySingleTon.myProp(36))

        println(Pet.loveHuman)
        Pet.showLove()

        val bob = Person("Bob", 30)

        // destructing
        val ( name, age ) = bob

        println("name is $name and age is $age")

        // unlike records in java we cna create copy of data class also by
       // specifying the field we want to change

        val bobWithNewAge = bob.copy(age=32)

        val (_, updatedAge) = bobWithNewAge

        println(updatedAge)


    }
}