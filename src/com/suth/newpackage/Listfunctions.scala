package com.suth.newpackage

object Listfunctions {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John");
  def main(args: Array[String]) {
    println(lst.map(x => x / 0.2));
    println(lst.map(x => "hi" * x));
    println(mymap.mapValues(x => "hi " + x));
    println("hello".map(_.toUpper));
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten);
    println(lst.flatMap(x => List(x, x + 1)));

    println(lst.filter(x => x % 2 != 0))

    println(lst.reduceLeft(_ + _))
    println(lst.foldLeft(10)(_ + _))
    println(lst.scanLeft(10)(_ + _))
  }
}
