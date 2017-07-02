package com.syan.essentialscala.generics

sealed trait Sum[A, B]

final case class Left[A, B](value: A) extends Sum[A, B]

final case class Right[A, B](value: B) extends Sum[A, B]


object SumApp {
  def main(args: Array[String]): Unit = {

    println(Left[Int, String](1).value)
    println(Right("foo").value)

    val sum: Sum[Int, String] = Right("foo")
    sum match {
      case Left(x) => println(x.toString())
      case Right(x) => println(x)
    }

  }
}