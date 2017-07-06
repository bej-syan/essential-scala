package com.syan.essentialscala.typeclasses

trait HtmlWriter[A] {
  def write(a: A): String
}

/**
  * The idea is to simply select a type class instance by type (done by the no-argument apply
  * method) and then directly call the methods defined on that instance.
  */
object HtmlWriter {
  def apply[A](implicit writer: HtmlWriter[A]): HtmlWriter[A] = writer
}


case class Person(name: String, email: String)

object PersonWriter extends HtmlWriter[Person] {
  def write(p: Person) = s"<span>${p.name} &lt;${p.email}&gt;</span>"
}