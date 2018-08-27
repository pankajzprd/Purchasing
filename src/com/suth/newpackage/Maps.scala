package com.suth.newpackage

object Maps {
  def main(args: Array[String]) {
    val mymap: Map[Int, String] = Map(801 -> "max", 802 -> "Tom", 804 -> "July");
    val mymap2: Map[Int, String] = Map(805 -> "lua");
    println(mymap);
    println(mymap(801));
    println(mymap.keys);
    println(mymap.values);
    println(mymap.isEmpty);

    mymap.keys.foreach { key =>
      println("key " + key);
      println("Value " + mymap(key));
    }
    println(mymap.contains(801000));
    println(mymap ++ mymap2);
    println(mymap.size);
  }
}
