package com.syan.essentialscala.typeclasses

/**
  * The typical process for converting data to JSON in Scala involves two steps.
  * First we convert our data types to an intermediate case class representation,
  * then we serialize the intermediate representation to a string.
  */

sealed trait JsValue {
  def stringify: String
}

final case class JsObject(values: Map[String, JsValue]) extends JsValue {
  def stringify = values
    .map { case (name, value) => "\"" + name + "\":" + value.stringify }
    .mkString("{", ",", "}")
}

final case class JsString(value: String) extends JsValue {
  def stringify = "\"" + value.replaceAll("\\|\"", "\\\\$1") + "\""
}


object SerializingData {
  def main(args: Array[String]): Unit = {

    val res =
      JsObject(
        Map(
          "foo" -> JsString("a"),
          "bar" -> JsString("b"),
          "baz" -> JsString("c"))
      )
    println(res.stringify)

  }
}
