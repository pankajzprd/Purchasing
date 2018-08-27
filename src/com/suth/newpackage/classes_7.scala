package com.suth.newpackage
/*
 * You can  create a class as below. To instantiate the class we are using "new" keyword
 * To run the class, it is necessary to create a object of the class with "main" method
 * 
 * Scala can not run a class because the main method needs to be static. 
 * This can only be created behind the scenes by the compiler from 
 * a singleton object in Scala.
 */

// Defining the class with class properties

class classes_7(id: Int, name: String) {

  def getval = println(s"The $id is associated with $name")
  def maths(a: Int, b: Int): Int = {
    a + b
  }
}
/*
 * You can not access "id" and "name" properties of class due to access.
 * In order to access them, we'll need to create case class, which automatically 
 * enables the access
 * 
 * 
 * We can create a companion object of the class as below. Companion object has the same
 * name as that of the class and should define "apply" method 
 * 
 * "apply" method of the class can be used as "factory" for your class
 */

object classes_7 {
  def main(args: Array[String]): Unit = {
    
    def apply(id: Int, name: String): classes_7 ={
      new classes_7(id,name)
    }
    // Instantiating the class 
    val class1 = new classes_7(101, "Rahul")
    val class2 = new classes_7(102, "Akshay")
// calling class methods here
    class1.getval
    println("The sum is " + class1.maths(10, 20))
    class2.getval
    println("The sum is " + class2.maths(30, 40))
  }
}