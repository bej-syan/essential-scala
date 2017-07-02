package com.syan.essentialscala.generics

sealed trait Result[A]

final case class Success[A](result: A) extends Result[A]

final case class Failure[A](reason: String) extends Result[A]


/**
  *   `Invariant Generic Sum Type Pattern`
  *
  *   If A of type T is a B or C,
  *
  *       sealed trait A[T]
  *       final case class B[T]() extends A[T]
  *       final case class C[T]() extends A[T]
  */