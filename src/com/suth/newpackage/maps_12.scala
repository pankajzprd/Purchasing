package com.suth.newpackage
/*
 * Scala Map is a collection of Key-Value pair, also known as hash table
 * The values can be accessed using the keys of the Map
 * Keys in the Map must be unique, values can be duplicated
 * Map can be Immutable as well as Mutable. Default is Immutable
 * If you refer mutable.map, we can have mutable map in this case
 *
 */
object maps_12 {

  val idnames: Map[Int, String] = Map(101 -> "Hadoop", 102 -> "Hive", 103 -> "Sqoop",
    104 -> "Pig", 105 -> "HDFS", 105 -> "HDFS")

  val marks = Map(("Physics" -> 75), ("Chemistry" -> 79), ("Maths" -> 89),
    ("Biology" -> 97), ("English" -> 97))

  val marks1 = Map(("Physics" -> 75), ("Chemistry" -> 79), ("Maths" -> 89),
    ("Biology" -> 97), ("English" -> 97), ("English" -> 98))

  def main(args: Array[String]): Unit = {
    println("Elements of Map idnames are " + idnames)

    println("Operations on marks1 map")
    println(marks1("English"))
    
    idnames.foreach(println)
    
    println(idnames(101))

    val idnames1 = idnames + (106 -> "Scala")
    println(idnames1)
    println("Printing the keys of the map")
    println(idnames.keys)
    println("Printing the values of the map")
    println(idnames.values)

    println("Using FOR loop to iterate and get values")
    for (key <- idnames.keys) {
      println(idnames(key))
    }
    println(idnames.head)
    println(idnames.tail)
    println(idnames.isEmpty)
    println(idnames.last)
    println(idnames.min)
    println(idnames.max)
    println(idnames.contains(101))
  }
}