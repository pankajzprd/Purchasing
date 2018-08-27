package com.suth.newpackage
/*
 * Arrays in Scala are mutable collection
 * When we want to hold elements of same datatype, we can use arrays
 * Arrays are of fixed size
 */
import Array._
object Arrays_15 {

  var names: Array[String] = Array("HDFS", "Hive", "Pig", "Sqoop")
  var names1: Array[String] = Array("Shell", "Scala", "Spark", "SQL")
  var ids = new Array[Int](4)
  ids = Array(1, 2, 3, 4,5,7)
  def main(args: Array[String]): Unit = {

    println("Element at Index position 0 is " + names(0))

    for (element <- names) {
      println(element)
    }
    var sum = 0
    for (i <- ids) {
      sum += i
    }
    println("The sum of all the elements in the array is " + sum)
 
    for(j <- ids) {
      println(j)
    }
    println(names.head)
    println(names.tail.mkString(","))
    println(names.contains("HDFS"))
  
    println("Concatenating the arrays ")
    var name2 = concat(names, names1)
    for(i <- name2) {
      println(i)
    }
    
    println("Creating 2-dimensional Arrays")
    val rows = 2
    val cols = 2
    val newarray: Array[Array[String]] = Array.ofDim[String](rows,cols)
    
    newarray(0)(0) = "Hadoop"
    newarray(0)(1) = "HDFS"
    newarray(1)(0) = "Hive"
    newarray(1)(1) = "Hana"
    
    println("2D array elements are " + newarray.deep.toList)
    
    println("Creating 3D Array")
    val newarray2 = Array(Array(1,2,3),Array(4,5,6),Array(7,8,9))
    
    println("3D Array elements are " + newarray2.deep.toSeq)
  }
  
}