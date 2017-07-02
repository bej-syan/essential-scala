package com.syan.essentialscala.generics.variance

/**
  * Scala has 23 built-in generic classes for functions of 0 to 22 arguments.
  *
  * Here's what they look like:
  *
  *       trait Function0[+R] {
  *         def apply: R
  *       }
  *
  *       trait Function1[-A, +B] {
  *         def apply(a: A): B
  *       }
  *
  *       trait Function2[-A, -B, +C] {
  *         def apply(a: A, b: B): C
  *       }
  *
  *       // ...
  *
  * Functions are contravariant in terms of their arguments and covariant in terms of their
  * return type.
  *
  *
  *
  */

object FunctionTypes {
  def main(args: Array[String]): Unit = {

  }
}
