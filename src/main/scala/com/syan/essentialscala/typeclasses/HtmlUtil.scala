package com.syan.essentialscala.typeclasses

object HtmlUtil {
  def htmlify[A](data: A)(implicit writer: HtmlWriter[A]): String = {
    writer.write(data)
  }
}


object HtmlUtilApp {
  def main(args: Array[String]): Unit = {

    val htmlifiedPerson =
      HtmlUtil.htmlify(Person("John", "john@example"))(PersonWriter)
    println(htmlifiedPerson)


    implicit val personWriter: HtmlWriter[Person] = PersonWriter
    println(
      HtmlWriter[Person].write(Person("Noel", "noel@example.com")))

  }
}