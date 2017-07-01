package com.syan.essentialscala.modelling

/**
  * An example of a `trait`.
  *
  * Image we're modelling visitors to a website.
  * There're two types of visitor:
  * those who have registered on our site, and
  * those who are anonymous
  */

import java.util.Date

/**
  * Visitor prescribes two abstract methods. That is, methods which do not have an implementation
  * but must be implemented by extending classes.
  *
  * When we mark a trait as `sealed` we must define all of its subtypes in the same file.
  * Once the trait is sealed, the compiler knows the complete set of subtypes and will warn us if
  * a pattern matching expression is missing a case.
  */
sealed trait Visitor {
  def id: String // Unique id assigned to each user
  def createdAt: Date // Date this user first visited the site

  // How long has this visitor been around.
  def age: Long = new Date().getTime - createdAt.getTime
}

final case class Anonymous(
                            id: String,
                            createdAt: Date = new Date) extends Visitor

final case class User(
                       id: String,
                       email: String,
                       createdAt: Date = new Date()) extends Visitor

