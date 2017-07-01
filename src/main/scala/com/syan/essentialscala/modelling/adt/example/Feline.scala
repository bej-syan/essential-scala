package com.syan.essentialscala.modelling.adt.example

sealed trait Feline {
  def dinner: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(favouriteFood) => CatFood(favouriteFood)
    }
}

final case class Lion() extends Feline

final case class Tiger() extends Feline

final case class Panther() extends Feline

final case class Cat(favouriteFood: String) extends Feline
