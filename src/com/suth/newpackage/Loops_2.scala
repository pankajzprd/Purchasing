package com.suth.newpackage

object Loops_2 {
  def main(args: Array[String]): Unit = {
    val employees = List("Engineer", "IAS", "Engineer", "IPS", "Clerk", 
                         "Consultant", "Engineer")

    // FOR loop examples
    for (e <- 1 to 10) {
      println("The count is " + e)
    }
    for (i <- 1 until 10) {
      println("Value of i is " + i)
    }
    
    for (jb <- employees) {
      println("The jobs listed are " + jb)
    }
    
    for (job <- employees if job.toUpperCase() == "ENGINEER") {
      println("Most of the employees are " + job)
    }
    
    // Returning output of for loop in a variable
    val empjob = for {
      jobs <- employees if jobs == "IAS"
    } yield jobs
    println("Most popular job is " + empjob)

    // Range examples
    val from1to5 = 1 to 5
    println("Range from 1 to 5 " + from1to5)

    val from1until5 = 1 until 5
    println("Range from 1 until 5 " + from1until5)

    val from1to20by2 = 1 to 20 by 2
    println("Incrementing by 2 " + from1to20by2)

    val alpharange = 'a' to 'z'
    println("The alphanumeric values are " + alpharange)

    val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
    println(s"Range of every other alphabet = $alphabetRangeFromAToZBy2")

    // while loop
    var count = 10
    while (count > 0) {
      println("The count is " + count)
      count -= 1
    }
   // do-while loop
    do {
      count += 1
      println(s"Number of count is = $count")
    } while (count < 9)
  }
}