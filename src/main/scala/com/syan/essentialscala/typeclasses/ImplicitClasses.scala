package com.syan.essentialscala.typeclasses


class ExtraStringMethods(str: String) {
  val vowels = Seq('a', 'e', 'i', 'o', 'u')
  def numberOfVowels = str.toList.filter(vowels contains _).length
}

object ImplicitClasses {
  def main(args: Array[String]): Unit = {

    println(
      new ExtraStringMethods("the quick brown fox").numberOfVowels
    )

    // However, if we tag our class with the `implicit` keyword, we give Scala
    // the ability to insert the constructor call automatically in our code:
    implicit class ExtrbStringMethods(str: String) {
      val vowels = Seq('a', 'e', 'i', 'o', 'u')
      def numberOfVowels = str.toList.filter(vowels contains _).length
    }
    println(
      "the quick brown fox".numberOfVowels
    )
    /**
      * Implicit classes follow the same scoping rules as implicit values. Like
      * implicit values, they must be defined within an enclosing object,
      * class, or trait
      */




  }
}
