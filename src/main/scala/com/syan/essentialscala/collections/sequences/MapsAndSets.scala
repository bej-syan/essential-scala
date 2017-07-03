package com.syan.essentialscala.collections.sequences

object MapsAndSets {
  def main(args: Array[String]): Unit = {

    /**
      * `->` is actually a function that generates a `Tuple2`
      */
    val example = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(example)

    println(example("a"))
    println(example.get("b"))
    println(example.getOrElse("d", 10))

    println(example.contains("a"))
    println(example.contains("d"))
    println(example.size)

    println(example - "b")
    println(example + ("d" -> 4))
    println(example + ("d" -> 4, "e" -> 5))

    println(example.map(p => p._1 -> p._2 * 2))
    println(example.map(p => p._1 + " = " + p._2))


    val people = Set(
      "Alice",
      "Bob",
      "Charlie",
      "Derek",
      "Edith",
      "Fred")
    val ages = Map(
      "Alice" -> 20,
      "Bob" -> 30,
      "Charlie" -> 50,
      "Derek" -> 40,
      "Edith" -> 10,
      "Fred" -> 60)
    val favoriteColors = Map(
      "Bob" -> "green",
      "Derek" -> "magenta",
      "Fred" -> "yellow")
    val favoriteLolcats = Map(
      "Alice" -> "Long Cat",
      "Charlie" -> "Ceiling Cat",
      "Edith" -> "Cloud Cat")

    println((1 until 10).toList)
    println((1 to 10).toList)
    println((10 to 1 by -1).toList)
    println((20 to 15).toList)
  }
}
