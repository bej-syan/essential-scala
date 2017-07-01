package com.syan.essentialscala.modelling.adt

sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

object Calculation {
  def +(calculation: Calculation, num: Int): Calculation = {
    calculation match {
      case Success(res) => Success(res + num)
      case Failure(reason) => Failure(reason)
    }
  }

  def -(calculation: Calculation, num: Int): Calculation = {
    calculation match {
      case Success(res) => Success(res - num)
      case Failure(reason) => Failure(reason)
    }
  }
}

object CalcApp {
  def main(args: Array[String]): Unit = {

    assert(Calculation.+(Success(1), 1) == Success(2))
    assert(Calculation.-(Success(1), 1) == Success(0))
    assert(Calculation.+(Failure("Badness"), 1) == Failure("Badness"))
  }
}
