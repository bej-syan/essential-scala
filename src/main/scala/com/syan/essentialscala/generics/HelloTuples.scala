package com.syan.essentialscala.generics

/**
  * A tuple is the generalisation of a pair to more terms.
  * Scala includes built-in generic tuple types with up to 22 elements,
  * along with special syntax for creating them.
  */

object HelloTuples {

  def main(args: Array[String]): Unit = {

    println(Tuple2("hi", 1))

    println(("hi", 3))

    println(("hi", 1, true))

    def tuplized[A, B](in: (A, B)) = in._1
    println(tuplized("a", 10))

    // pattern matching
    (1, "a") match {
      case (a, b) => println(a + b)
    }

    val x = (1, "b", true, 'c')
    println(x._1)
    println(x._2)
    println(x._3)
    println(x._4)
  }
}
