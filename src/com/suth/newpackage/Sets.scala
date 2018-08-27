package com.suth.newpackage

object Sets {
  def main(args: Array[String]): Unit = {

    val myset: Set[Int] = Set(1, 2, 5, 8, 9, 6, 4);
    val myset2: Set[Int] = Set(4, 2, 9, 18, 19, 16, 14);
    val names: Set[String] = Set("Max", "Tom", "John");
    println(myset + 10);
    println(names("Maxxxx"));
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty);

    println(myset ++ myset2);
    println(myset.++(myset2))

    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);

    println(myset.min);
    myset.foreach(println);

    for (name <- names) {
      println(name);
    }
  }
}
