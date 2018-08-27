package com.suth.newpackage

object functions_5 {
  /*
   * Functions are used to define your code that is needed in future purpose
   * and in a better format
   */
  def main(args: Array[String]): Unit = {

    // Function with No return Type
    def salesreport(): Unit = {
      println("This function returns no value")
    }

    // To call above function
    salesreport
    val s = salesreport
    println(s)

    def salesreport1 {
      println("This function also returns no value")
    }
    salesreport1

    // Function with Return Type
    def revenuereport(): String = {
      println("Function with return type of String")
      "Revenue Generated"
    }

    println(revenuereport())
    // Another way of calling a function
    val revenue = revenuereport()
    println(revenue)

    // Parameterized functions
    def parafunctions(emp: String, add: String): String = {
      println("Parameterized function defined")
      emp.concat(add)
    }

    println(parafunctions("Ramesh stays at ", "Hyderabad"))
    // Another way
    val empadd = parafunctions("Rahul is a ", "good boy")
    println(empadd)

    // Function with default values
    def deffunction(emp: String, add: String, desg: String = "ENGINEER"): String = {
      println("Function with default value specified")
      emp.concat(add).concat(desg)
    }

    println(deffunction("Ramesh", " works at TCS as ")) // Continue with default value
    println(deffunction("Ramesh", " works at TCS as ", "DEVELOPER")) //Override default value

    // Typed functions
    def typedfunctions[T](number: T) {
      number match {
        case a: String => println(s"$a is a string")
        case a: Double => println(s"$a is a double")
        case _         => println("datatype not specified")
      }
    }
    typedfunctions[Double](123.12)
    typedfunctions[String]("Amy Jackson")
    typedfunctions[Integer](12)

    // Passing variable arguments/collections to a function as parameters

    def varargu(names: String*) {
      println(s"The values passed are ${names.mkString("|")}")
    }

    varargu("Ravi", "Prakash", "Samir", "Akshay")

    val namesl: List[String] = List("TCS", "INFOSYS", "CTS", "WIPRO", "ANT", "EXS")

    varargu(namesl: _*)
    // varargu(namesl) gives compile time error

    // Curried functions -- each parameter is enclosed in its own group
    def curryfunc(names: String)(add: String)(desg: String): String = {
      names.concat(add).concat(desg)
    }
    println(curryfunc("Rahul works at ")("Bangalore ")("as an Engineer"))

    def calc(a: Int, b: Int) = a + b;
    //Let us convert above function in Currying
    def calc1(a: Int) = (b: Int) => a + b
    //Currying provided by Scala
    def calc2(a: Int)(b: Int) = a + b
    //Passing more than two arguments
    def calc3(a: Int)(b: Int)(c: Int) = a + b + c

    println("The Sum of values is => " + calc(10, 30))
    println("The Sum of values in Currying function is => " + calc1(10)(30))
    //Another way of calling Currying function is
    val x = calc1(10)
    println("The Sum of values in partial way of Currying Function is => " + x(30))
    //Implementing the Scala way of Currying
    println("The Sum of values in Scala Currying way is => " + calc2(10)(30))
    // Another way of calling Scala Currying
    val y = calc2(10)_ // Like above, here we can not just pass one argument and second at variable run
    // that is why we have used wildcard operator
    println("The Sum of values in partial implementing way Scala Currying is => " + y(30))
    //Currying example with three arguments
    println("The Sum of Curring with three arguments is => " + calc3(10)(20)(10))
    val z = calc3(10)_
    println("The Sum of Currying with three arguments in partial implementation is => " + z(10)(20))

  }
}