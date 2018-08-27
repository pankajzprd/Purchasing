package com.suth.newpackage

abstract class abstractclass_9 {
  def call()
  var course = "Hadoop"
}

class someclass extends abstractclass_9 {
  def call() {
    println("Calling method from Abstract class")
  }
  def empdetails(id: Int, name: String): String = {
    println("Printing the employee details")
    name.concat(s" is associated with ID ${id}")
  }
  // Overriding the variable here
  course = "Scala"
}

object anyobject {
  def main(args: Array[String]): Unit = {
    val inst = new someclass()
    inst.call()
    // calling variables defined in abstract class
    println(inst.course) // prints "Scala" here
    
    println(inst.empdetails(100, "Ramesh"))
    //Can not instantiate the abstract like below
   // val x = new abstractclass_9()
  }
}