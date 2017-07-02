package com.syan.essentialscala.functions

object WorkingWithFunctions {
  def main(args: Array[String]): Unit = {

    /**
      * `Placeholder` syntax
      *     ((_: Int) * 2)      // is expanded by the compiler to
      *     (a: Int) => a * 2
      *
      *  It's more idiomatic to use the placeholder syntax only in the cases where the compiler
      *  can infer the types.
      *
      *     _ + _         // expands to `(a, b) => a + b`
      *     foo(_)        // expands to `(a) => f(a)`
      *     foo(_, b)     // expands to `(a) => foo(a, b)`
      *     _(foo)        // expands to `(a) => a(foo)`
      *
      */


    /**
      * `Multiple Parameter lists`
      *
      * Multiple parameter lists have two relevant uses: they look nicer when defining
      * inline and they assist with type inference.
      *
      */
    def example(x: Int)(y: Int) = x + y
    println(example(1)(2))






  }
}
