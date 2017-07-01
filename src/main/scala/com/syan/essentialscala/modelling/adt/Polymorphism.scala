package com.syan.essentialscala.modelling.adt.polymorphism

/**
  * Polymorphic dispatch, or just polymorphism for short, is a fundamental object-oriented technique.
  * If we define a method in a trait, and have different implementations in classes extending that
  * trait, when we call that method the implementation on the actual concrete instance will be used.
  */

sealed trait A {
  def foo: String =
    "It's A!"
}

final case class B() extends A {
  override def foo: String =
    "It's B!"
}

final case class C() extends A {
  override def foo: String =
    "It's C!"
}

object Polymorphism {
  def main(args: Array[String]): Unit = {

    val anA1: A = B()
    println(anA1.foo)

    val anA2: A = C()
    println(anA2.foo)

  }
}