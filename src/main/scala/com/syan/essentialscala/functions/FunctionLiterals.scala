package com.syan.essentialscala.functions

object FunctionLiterals {
  def main(args: Array[String]): Unit = {

    println(s"Scala's `Function` types.")
    println(s"We write a function type like (A, B) => C, where A and B are the " +
      s"types of the parameters and C is the result type.")
    println(s"The same pattern generalises from functions of no arguments to an " +
      s"arbitrary number of arguments.")

    val sayHi = () => "Hi!"
    println(sayHi())

    val add1 = (x: Int) => (x + 1): Int
    println(add1(10))

    val sum = (x: Int, y: Int) => x + y
    println(sum(10, 20))


  }

}
