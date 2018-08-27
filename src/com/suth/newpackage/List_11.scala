package com.suth.newpackage
/*
 * Let us walk through collections.
 * Let us discuss List here.
 * List is an Immutable collection in Scala
 * We can not change the values in the List once it is defined.
 * We can perform several operations on it
 *
 *
 */
object List_11 {

  val names: List[String] = List("Ram", "Sham", "Ajay", "Vijay", "Ramesh", "Suresh")
  val ids: List[Int] = List(1, 2, 3, 4, 5, 5, 6)
  val sal = List(10000.00, 20000.00, 30000.00, 40000.00, 50000.00, 60000.00)

  def main(args: Array[String]): Unit = {
    
    names.foreach(println)
    ids.foreach(println)
    sal.foreach(println)
    
    // for loop iteration
    for (i <- names) {
      println(i)
    }
    println("Adding an element in the list")
    println(names :+ "Amit") // Prints the element along with element of the list. List remains unchanged.
    println(names)
   
    val newnames = names :+ "Amit"
    val newnames1 = "Hitesh" +: names
    println("Appending the value to the list")
    println(newnames)
    println("Prepending the value to the list")
    println(newnames1)
    println("Adding two immutable lists")
    val newnames2 = newnames :: newnames1
    val newnames3 = newnames ::: newnames1
    println(newnames2)
    println(newnames3)
    // Operations
    println("Head of names list")
    println(names.head)
    println("Tail of names list")
    println(names.tail)
    println("Reversing names list")
    println(names.reverse)
    println("Getting slice from names list")
    println(names.slice(1, 3)) // Start from index position 1 and fetch till 3, excluding 3
    println("check if the names list is empty")
    println(names.isEmpty)
    println("concating the Lists")
    println(names.++(List("Akshay", "Samir", "Abhinav")))
    println("get the value at index")
    println(names.apply(3))
    println("Find the index of the value")
    println(names.indexOf("Akshay"))
    println(names.indexOf("Ramesh"))
    println("check if we have values defined at the index")
    println(names.isDefinedAt(2))
  }
}