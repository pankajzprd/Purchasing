package com.suth.newpackage

/*
 * Sets are type of collection which store only unique values in it
 * It doesn't take duplicates values in it
 * By default they are Immutable. We can also use Mutable sets
 * Mutable.set can be used if we need to use mutable sets
 * Sets are un-ordered collections. Order of values in the collection is not preserved
 */
object Sets_13 {

  val names: Set[String] = Set("Hadoop", "Hive", "Hive", "Pig", "Sqoop", "HDFS", "Scala")
  val ids = Set(1, 2, 3, 4, 5, 6, 7, 8)
  val values = Set(1, 4, 7, 10, 14)
  
  def main(args: Array[String]): Unit = {
    println("Elements of the Set are " + names)

    for (name <- names) {
      println("The values in the set are " + name)
    }

    val setvalues = for {
      name <- names
    } yield name

    println(setvalues)

    println(ids.head)
    println(ids.tail)
    println(ids.isEmpty)
    println(names.contains("Hadoop"))

    ids.foreach(println)

    println("Adding values to Set")
    val names1 = names + "Spark" + "SQL" + "Shell"

    println(names1)

    println("Subtracting one value from set")
    val names2 = names1 - "SQL"
    println(names2)

    println("Interset between two sets")
    println(ids.intersect(values))
    println(ids.&(values))
    println("Difference between two sets")
    println(ids.&~(values))
  }
}