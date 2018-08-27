package com.suth.newpackage

/*
 * Traits are like partially implemented interfaces in Scala
 * Traits can have abstract as well as non-abstract methods
 * All methods can be abstract, but it should have at least one abstract method
 * We can not initialize Traits, they can be extended
 * 
 * It is necessary to define all the methods from all the traits that we are
 * extending to be implemented
 */

trait trait_10 {
  def morning(wish: String): String
  def afternoon(wish: String): String
  def evening(wish: String): String
  def night(wish: String): String
}

trait trait_11 {
  def nomsg(wish: String): String
}
class sample extends trait_10 with trait_11 {

  override def morning(wish: String): String = {
    wish
  }
  override def afternoon(wish: String): String = {
    wish
  }
  override def evening(wish: String): String = {
    wish
  }
  override def night(wish: String): String = {
    wish
  }
  override def nomsg(wish: String): String = {
    wish
  }
}

object anyobj {
  def main(args: Array[String]): Unit = {

    val sample = new sample

    val morning = sample.morning("Good Morning")
    val afternoon = sample.afternoon("Good Afternoon")
    val evening = sample.evening("Good Evening")
    val night = sample.night("Good Night")
    val nomsg = sample.nomsg("No msg today")
    println(morning)
    println(afternoon)
    println(evening)
    println(night)
    println(nomsg)
  }
}