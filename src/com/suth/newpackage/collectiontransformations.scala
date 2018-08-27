package com.suth.newpackage

object collectiontransformations {
  def main(args: Array[String]): Unit = {
    val a = 100
    val b = 200
    val c = 300

    if (a > b && a > c)
      println(a)
    else if (b > a && b > c) println(b)
    else println(c)

    val deptNos = List(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 4)
    val deptnames = deptNos.map { x =>
      if (x == 1) "Engineering" else if (x == 2) "Music" else if (x == 3) "Acting"
      else if (x == 4) "Camera"
      else "Spot Boys"
    }
    println(deptnames)

    val x = "M"
    val rs = (x == "M") match {
      case true  => "Male"
      case false => "Female"
    }
    println("X is "+ rs)
    
    val rs1 = x match {
      case "M" => "Male"
      case "F" => "Female"
      case other => "Others"
    }
    println("X is "+rs1)
    val Lists = List(10000,20000,30000,40000,50000,70000,80000,90000)
    
    val grades = Lists.map{ x =>
      if (x >= 70000) "Grade A"
      else if (x >= 40000) "Grade B"
      else "Grade C" 
    }
    println(grades)
  
    // Multiple functions on a collection
    val details = List("101,Pankaj, M, 60000, 10",
                       "102, Rahul, M, 50000, 11",
                       "103, Neha, F, 50000, 10",
                       "104, Jay, M, 30000, 8",
                       "105, Mehul, M, 90000, 11",
                       "106, Smita, F, 10000, 10",
                       "107, Praveen, M, 20000, 8",
                       "108, Anita, F, 30000, 8"
                       )
     val information = details.map{ y => 
       val x = y.split(",")
       val id = x(0)
       val name = x(1)
       val sex = x(2)
       val sal = x(3)
       val deptNo = x(4)
       val deptname = x(4) match {case "10" => "Engineer"
                                  case "11" => "Doctor"
                                  case other => "Locals"
                                  }
       val newlis = List(id,name,sex,sal,deptNo,deptname)
       newlis
      }
    println(information)
  }
  
}