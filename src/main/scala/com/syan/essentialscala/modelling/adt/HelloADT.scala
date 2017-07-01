package com.syan.essentialscala.modelling.adt

/**
  * HOW TO TRANSLATE A DATA MODEL INTO SCALA CODE
  *
  * The `Product Type Pattern`
  * If A has a b (with type B) and a c (with type C) write
  *     case class A(a: A, c: C)
  *   or
  *     trait A {
  *       def b: B
  *       def c: C
  *     }
  *
  * The `Sum Type Pattern`
  * If A is a B or C
  *     sealed trait A
  *     final case class B() extends A
  *     final case class C() extends A
  *
  *
  * An algebraic data type is any data that uses the above two patterns.
  * In the functional programming literature, data using the "has-a and" pattern is known as a
  * product type, and the "is-a or" pattern is a sum type.
  *
  *
  */

object HelloADT {

  def main(args: Array[String]): Unit = {


  }
}
