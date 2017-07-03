package com.syan.essentialscala.collections.sequences

/**
  * A sequence is a collection of items with a defined and stable order.
  *
  * scala> val seq = Seq(1, 2, 3)
  * seq: Seq[Int] = List(1, 2, 3)
  *
  *
  */


object WorkingWithSequences {
  def main(args: Array[String]): Unit = {

    val sequence = Seq(1, 2, 3)
    println(s"val sequence = Seq(1, 2, 3)")
    println(s"println(sequence)\n" +
      s"val sequence: Seq[Int] = $sequence")

    println(sequence.apply(2))
    println(sequence(2))

    println(sequence.head)
    println(sequence.tail)
    println(sequence.tail.head)

    try {
      Seq().head
    } catch {
      case e: Exception => println(s"Exception: ${e.getMessage}")
    }

    try {
      Seq().tail
    } catch {
      case e: Exception => println(s"Exception: ${e.getMessage}")
    }

    println(Seq().headOption)
    println(sequence.headOption)

    println(sequence.length)
    println(sequence.size)
    println(sequence.mkString)

    println(sequence.contains(2))
    println(sequence.find(_ == 3))
    println(sequence.find(_ > 4))
    println(sequence.filter(_ > 1))
    println(sequence.sortWith(_ > _))

    println(sequence.:+(4))
    println(sequence :+ 4)
    println(0 +: sequence)
    println(Seq(4, 5, 6) ++ sequence)


    // The default implementation of Seq is a List, which is a classic linked list data structure

    println(Nil)
    val list = 1 :: 2 :: 3 :: 4 :: Nil
    println(list)
    println(0 :: list)
    println(List(1, 2, 3, 4, 5, 6))
    println(list ::: List(5, 6, 7, 8, 9))
    println(":: and ::: are specific to lists whereas +:, :+ and ++ work on any type of sequence.")


    println("import scala.collection.immutable.Vector")
    import scala.collection.immutable.Vector
    println(Vector(1, 2, 3))

    println("import scala.collection.immutable._")
    import scala.collection.immutable._
    println(Queue(1, 2, 3, 4, 5))


    val animals = Seq("cat", "dog", "penguin")
    println(animals)

    println(animals.:+("tyrannosaurus"))


    // map
    println(sequence.map(x => x * 2))
    println(sequence.map(_ * 2))


    // permutation
    println("dog".permutations)
    println("dog".permutations.toList)
    println(Seq("a", "wet", "dog").map(_.permutations.toList))


    // flatMap
    println(Seq("a", "web", "dog").flatMap(_.permutations.toList))
    println(Seq(1, 2, 3).flatMap(x => Seq(x, x * 10)))
    println(Vector(1, 2, 3) flatMap { num => Seq(num, num * 10)})


    // fold
    // foreach

  }
}
