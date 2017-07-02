package com.syan.essentialscala.functions.linkedlist

sealed trait LinkedList[A] {
  def fold[B](end: B, pair: (A, B) => B): B =
    this match {
      case End() => end
      case Pair(hd, tl) => pair(hd, tl.fold(end, pair))
    }
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

final case class End[A]() extends LinkedList[A]


/**
  * LinkedList Tests
  */
object LinkedListApp {
  def main(args: Array[String]): Unit = {


    println(
      "As structural recursion is the generic pattern for writing any" +
        "function that transforms an algebraic datatype, fold is the concrete" +
        "realisation of this generic pattern")

  }
}