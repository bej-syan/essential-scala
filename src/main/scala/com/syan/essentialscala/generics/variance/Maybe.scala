package com.syan.essentialscala.generics.variance

/**
  * Variance annotations, which allow us to control subclass relationships between
  * types with type parameters.
  *
  * Recall our `Maybe` type
  *
  *       sealed trait Maybe[A]
  *       final case class Full[A](value: A) extends Maybe[A]
  *       final case class Empty[A]() extends Maybe[A]
  *
  * Ideally we would like to drop the unused type parameter on `Empty`, and write
  * something like
  *
  *       sealed trait Maybe[A]
  *       final case class Full[A](value: A) extends Maybe[A]
  *       final case object Empty extends Maybe[???]
  *
  * !!! Objects can't have type parameters.
  * In order to make `Empty` an object we need to provide a concrete type in the
  * `extends Maybe` part of the definition.
  *
  * In the absence of a preference for a particular data type, we could use something
  * like `Unit` or `Nothing`.
  *
  *       final case object Empty extends Maybe[Nothing]
  *
  *  However this leads to type errors:
  *
  *       scala> :paste
  *       // Entering paste mode (ctrl-D to finish)
  *
  *       sealed trait Maybe[A]
  *       final case class Full[A](value: A) extends Maybe[A]
  *       final case object Empty extends Maybe[Nothing]
  *
  *       // Exiting paste mode, now interpreting.
  *
  *       defined trait Maybe
  *       defined class Full
  *       defined object Empty
  *
  *       scala> val poss: Maybe[Int] = Empty
  *       <console>:13: error: type mismatch;
  *        found   : Empty.type
  *        required: Maybe[Int]
  *       Note: Nothing <: Int (and Empty.type <: Maybe[Nothing]), but trait Maybe is invariant in type A.
  *       You may wish to define A as +A instead. (SLS 4.5)
  *              val poss: Maybe[Int] = Empty
  *                                     ^
  *
  * The problem here is that `Empty` is a `Maybe[Nothing]` and a `Maybe[Nothing]` is not a subtype of `Maybe[Int]`
  *
  * To overcome this issue we need to introduce variance annotations.
  *
  *
  *
  *
  * `Invariance`, `Covariance`, and `Contravariance`
  *
  * If we have some type `Foo[A]`, and A is subtype of B, is Foo[A] a subtype of Foo[B]? The answer depends
  * on the variance of the type Foo.
  *
  * A type `Foo[T]` is invariant in terms of T, meaning that the types `Foo[A]` and `Foo[B]` are
  * unrelated regardless of the relationship between A and B.
  *
  * A type `Foo[+T]` is covariant in terms of T, meaning that the `Foo[A]` is a supertype of `Foo[B]` if A is
  * a supertype of B.  Most Scala collection classes are covariant in terms of their contents.
  *
  * A type `Foo[-T]` is contravariant in terms of T, meaning that `Foo[A]` is a subtype of `Foo[B]` if A is a
  * supertype of B.
  */

sealed trait Maybe[+T]

final case class Full[T](value: T) extends Maybe[T]

final case object Empty extends Maybe[Nothing]


object MaybeApp {
  def main(args: Array[String]): Unit = {

    val possible: Maybe[Int] = Empty

    println(possible)

  }
}