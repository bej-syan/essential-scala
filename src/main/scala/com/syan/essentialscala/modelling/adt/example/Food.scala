package com.syan.essentialscala.modelling.adt.example

sealed trait Food

final case object Antelope extends Food

final case object TigerFood extends Food

final case object Licorice extends Food

final case class CatFood(food: String) extends Food
