package com.syan.essentialscala.typeclasses

object EnrichedInterfaces {
  def main(args: Array[String]): Unit = {

    /**
      * Type enrichment, allowing us to create interfaces that act as if they
      * where methods defined on the classes of interest.
      */

    def numberOfVowels(str: String) =
      str.filter(Seq('a', 'e', 'i', 'o', 'u').contains(_)).length

    println(numberOfVowels("the quick brown fox"))

    // It would be great if numberOfVowels was a built-in method of String so
    // we could write
    //    "a string".numberOfVowels
    //
    // Scala has a feature called `implicit classes` that allow us to add new
    // functionality to an existing class without editing its source code.


  }
}
