package com.syan.essentialscala.generics.variance

sealed trait Sum[A, B] {
  def fold
  def map
  def flatMap
}
final case class Failure[???](value: ???) extends Sum[???, ???]
final case class Success[???](value: ???) extends Sum[???, ???]


sealed trait Expression {
  def eval: Sum[] = ???

  def lift2(l: Expression, r: Expression, f: (Double, Double) => Sum[String, Double]) = ???
}
final case class Addition(left: Expression, right: Expression) extends Expression
final case class Subtraction(left: Expression, right: Expression) extends Expression
final case class Division(left: Expression, right: Expression) extends Expression
final case class SquareRoot(value: Expression) extends Expression
final case class Number(value: Double) extends Expression


object Calculation {
  def main(args: Array[String]): Unit = {

    assert(Addition(Number(1), Number(2)).eval == Success(3))
    assert(SquareRoot(Number(-1)).eval == Failure("Square root of negative number"))
    assert(Division(Number(4), Number(0)).eval == Failure("Division by zero"))
    assert(Division(Addition(Subtraction(Number(8), Number(6)), Number(2)), Number(2)).eval == Success(2.0))

  }
}
