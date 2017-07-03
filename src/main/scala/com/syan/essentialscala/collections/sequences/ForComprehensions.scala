package com.syan.essentialscala.collections.sequences

object ForComprehensions {
  def main(args: Array[String]): Unit = {

    /**
      * Say we have the sequence Seq(1, 2, 3) and we wish to create a sequence
      * with every element doubled.
      */
    println(Seq(1, 2, 3).map(_ * 2))
    val res = for {
      x <- Seq(1, 2, 3)
    } yield x * 2
    println(res)

    val data = Seq(Seq(1), Seq(2, 3), Seq(4, 5, 6))
    println(
      data.flatMap(_.map(_ * 2))
    )

    for {
      seq <- data
      element <- seq
    } println(element * 2)




  }
}
