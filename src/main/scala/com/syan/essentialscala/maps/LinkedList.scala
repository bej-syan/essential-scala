package com.syan.essentialscala.maps

sealed trait LinkedList[A] {
  def map[B](fn: A => B): LinkedList[B] =
    this match {
      case End() => End[B]()
      case Pair(hd, tl) => Pair(fn(hd), tl.map(fn))
    }
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

final case class End[A]() extends LinkedList[A]

/**
  * LinkedList Tests
  */
object LinkedListApp {
  def main(args: Array[String]): Unit = {

    val example =
      Pair(1,
        Pair(2,
          Pair(3,
            Pair(4,
              Pair(5, End())))))

    println(example)
    println(example.map(x => x * 10))
  }
}
