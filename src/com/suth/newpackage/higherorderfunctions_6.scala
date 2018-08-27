package com.suth.newpackage

object higherorderfunctions_6 {
  // types of ways to define function
  // Standard way
  def maths(x: Int, y: Int): Int = {
    return x + y
  }
  
  //Without return type specifying
  def sqr(a: Int) = a * a
  
  // another way
  def sub(a: Int, b: Int): Int = {
    a - b
  }
  
  // Operators as functions
  def +(a: Int, b: Int): Int = {
    a + b
  }
  def *(a: Int) = a * a
  
  def find(x: Int, y: Int, z: Int): Int = {
    return (x / y) / z
  }
   
 //Anonymous Function
 val j = (a: Int, b: Int) => a + b + 10
 val x = (x: String, y: String) => x + " is " + y

  // Higher Order functions
  def hsub(x: Int, y: Int, f: (Int, Int) => Int): Int = {
    f(x, y)
  }

  // Passing Function within Function
  def hsub1(x: Int, y: Int, z: Int, f: (Int, Int, Int) => Int): Int = {
    f(x, y, z)
  }
  def main(args: Array[String]): Unit = {
    println("Output of maths function is " + maths(10, 12))
    println("Output of sql function is " + sqr(10))
    println("Output of sub function is " + sub(20, 10))

    println(j(20, 40))
    println(x("Hadoop", "Awesome"))
    
    val result = hsub(10, 20, (x, y) => x + y)
    val result1 = hsub(10, 20, (x, y) => x min y)
    val result2 = hsub(10, 20, (x, y) => x max y)
    println("1st Higher Order function result is " + result)
    println("1st Higher Order function result is " + result1)
    println("1st Higher Order function result is " + result2)
    
    val value = hsub1(10, 20, 30, (x, y, z) => x * y * z)
    println("2nd Higher Order function result is " + value);
    //Use of wildcard operator _
    
    val value1 = hsub1(100, 10, 10, find)
    println("2nd Higher Order funtion result is " + value1)
  }

}