package com.syan.essentialscala.generics.maybe

sealed trait Maybe[A] {
  def flatMap[B](fn: A => Maybe[B]): Maybe[B] =
    this match {
      case Empty() => Empty[B]()
      case Full(value) => fn(value)
    }
}

final case class Full[A](value: A) extends Maybe[A]

final case class Empty[A]() extends Maybe[A]


object MaybeApp {
  def main(args: Array[String]): Unit = {

    val perhaps1: Maybe[Int] = Empty[Int]
    println(perhaps1)

    val perhaps2: Maybe[Int] = Full(10)
    println(perhaps2)

    val mightFail1: Maybe[Int] = Full(1)
    val mightFail2: Maybe[Int] = Full(2)
    val mightFail3: Maybe[Int] = Empty()

    val res1 = mightFail1 flatMap { x =>
      mightFail2 flatMap { y =>
        Full(x + y)
      }
    }
    println(res1)

    val res2 = mightFail1 flatMap { x =>
      mightFail2 flatMap { y =>
        mightFail3 flatMap { z =>
          Full(x + y + z)
        }
      }
    }
    println(res2)

  }
}
