package com.syan.essentialscala.modelling.adt

/**
  * To define valid recursive data, we must define a base case, which is the case that ends
  * the recursion.
  */
sealed trait IntList {
  def length: Int =
    this match {
      case End => 0
      case Pair(hd, tl) => 1 + tl.length
    }

  def double: IntList =
    this match {
      case End => End
      case Pair(hd, tl) => Pair(hd * 2, tl.double)
    }

  def product: Int =
    this match {
      case End => 1
      case Pair(hd, tl) => hd * tl.product
    }

  def sum: Int =
    this match {
      case End => 0
      case Pair(hd, tl) => hd + tl.sum
    }
}

final case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList


object RecursiveData {
  def main(args: Array[String]): Unit = {

    val oneToSix =
      Pair(1,
        Pair(2,
          Pair(3,
            Pair(4,
              Pair(5,
                Pair(6, End))))))

    println(s"oneTwoThree's length: ${oneToSix.length}")
    println(s"oneTwoThree's product: ${oneToSix.product}")
    println(s"oneTwoThree's double: ${oneToSix.double}")
    println(s"oneTwoThree's sum: ${oneToSix.sum}")
  }
}
