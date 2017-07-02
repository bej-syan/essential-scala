package com.syan.essentialscala.generics

sealed trait LinkedList[T] {
  def length: Int =
    this match {
      case Empty() => 0
      case Pair(_, tl) => 1 + tl.length
    }

  def contains(i: T): Boolean =
    this match {
      case Empty() => false
      case Pair(hd, tl) => if (hd == i) true else tl.contains(i)
    }

  def apply(index: Int): Result[T] = {
    this match {
      case Pair(hd, tl) => if(index == 0) Success(hd) else tl(index - 1)
      case Empty() => Failure("Index out of bounds")
    }
  }

}

final case class Empty[T]() extends LinkedList[T]

final case class Pair[T](hd: T, tl: LinkedList[T]) extends LinkedList[T]


/**
  * TESTING
  */
object LinkedListApp {
  def main(args: Array[String]): Unit = {

    val example = Pair(1, Pair(2, Pair(3, Empty())))

    /**
      * METHOD: length
      */
    assert(example.length == 3)
    assert(example.tl.length == 2)
    assert(Empty().length == 0)

    /**
      * METHOD: contains
      */
    assert(example.contains(3) == true)
    assert(example.contains(4) == false)
    assert(Empty().contains(0) == false)

    /**
      * METHOD: apply
      */
    assert(example(0) == Success(1))
    assert(example(1) == Success(2))
    assert(example(2) == Success(3))
    assert(example(3) == Failure("Index out of bounds"))
  }
}