package com.syan.essentialscala.generics.variance

object TypeBounds {
  def main(args: Array[String]): Unit = {

    println(s"A <: B  --- to declare type A must be a subtype of type B")
    println(s"A >: B  --- to declare type A is a supertype of type B")

  }
}
