package com.suth.newpackage

/*
 * Vector is a data structure which is similar to List.
 * with Vector, you can have random access to the elements
 * Index starts from 0
 */
object Vector_14 {
  val vector1: Vector[String] = Vector("Hadoop", "Hive", "Hive", "Pig", "Sqoop", "Scala")
  val vector = Vector("Devops", "AWS", "Cloud")
  def main(args: Array[String]): Unit = {
    println("Elements of the vector are " + vector1)

    val vector2 = vector1 :+ "Shell"

    println("Elements of vector2 are " + vector2)
    //accessing value at index 1
    println(vector2(1))
    
    val vector3 = vector1 ++ vector
    println("Combining two vectors")
    println(vector3)

    println("Iterating through the vector elements")
    for (i <- vector3) {
      println(i)
    }
  }

}