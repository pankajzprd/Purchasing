package com.suth.newpackage

object Tuples_4 {
  /*
   * The below tuple declaration can also be done in main method
   * Syntax:
   * val tuplename = (datatype1, datatype2, datatype3, ......)
   */
  
  val mytuple = (1, 2, "hello", true);
  val mytuple1 = new Tuple2(12.3, "Amy")
  val mytuple2 = new Tuple3(1, 2, "hello");
  val mytuple3 = new Tuple3(1, "hello", (2, 3));
  
  def main(args: Array[String]) {
    
    println(mytuple._1);
    println(mytuple._2);
    println(mytuple._3);
    println(mytuple._4);
    println(mytuple2._3);

    println(mytuple1._1)
    println(mytuple3._3._1)
    println(mytuple3._3._2);
    
    println("Using Foreach loop for Tuple")
    
    mytuple.productIterator.foreach {
      i => println(i);
    }
    
    println(1 -> "Tom" -> true -> 12.3);
    
  }
}