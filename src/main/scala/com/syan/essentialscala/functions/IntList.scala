package com.syan.essentialscala.functions.intlist

sealed trait IntList {

  /**
    * We started developing an abstraction over `sum`, `length`, and `product`
    */
  def fold(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

  def length: Int = fold(0, (_, tl) => 1 + tl)
  def sum: Int = fold(0, (a, b) => a + b)
  def product: Int = fold(1, (a, b) => a * b)

  def double: IntList =
    this match {
      case End => End
      case Pair(hd, tl) => Pair(hd * 2, tl.double)
    }
}

final case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

object IntListTest {
  def main(args: Array[String]): Unit = {

    val example = Pair(1, Pair(2, Pair(3, Pair(4, End))))

    assert(example.length == 4)
    assert(example.sum == 10)
    assert(example.product == 24)

  }
}