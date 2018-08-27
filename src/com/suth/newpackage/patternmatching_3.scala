package com.suth.newpackage

object patternmatching_3 {
  def main(args: Array[String]): Unit = {
    val name: String = "Akshay"
    val id = 123

    name match {
      case "Ram"   => println("Ram")
      case "Jay"   => println("Jay")
      case "Rahul" => println("Rahul")
      case other   => println("The name is " + name)
    }

    val thename = name match {
      case "Ram"   => "Ram"
      case "Jay"   => "Jay"
      case "Rahul" => "Rahul"
      case _       => "Akshay"
    }
    println("The name with returned value is " + thename)

    val unname = name match {
      case "Ram" | "Sham"          => "Ram"
      case "Jay" | "Ajay" | "Jack" => "Jay"
      case "Rahul" | "RAHUL"       => "Rahul"
      case _                       => "Akshay"
    }
    println("The name is " + unname)

    val salary: Any = 45666.50
    
    val salaryType = salary match {
      case price: Int     => "Int"
      case price: Double  => "Double"
      case price: Float   => "Float"
      case price: String  => "String"
      case price: Boolean => "Boolean"
      case price: Char    => "Char"
      case price: Long    => "Long"
    }
    println(s"salary is of type  = $salaryType")
  }
}