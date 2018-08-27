package com.suth.newpackage

object workingoncollectionList {
  def main(args: Array[String]): Unit = {
    /*  Instead of applying single transformation at a time, we can apply multiple
     *  transformations in one go. Refer below example
     */

    var Names = List("pankaj", "mayur", "shailesh", "niraj", "vivek")

    val funcass = Names.map { name =>
      val tr = name.trim()
      val upr = tr.toUpperCase()
      val lngt = upr.length()
      lngt
    }
    println("The length of each element is ," + funcass)
    // Converting first character in Uppercase
    val firstcharupr = Names.map { upr =>
      val fw = upr.substring(0, 1) // we can also use Slice function
      val ups = fw.toUpperCase()
      val rw = upr.substring(1).toLowerCase()
      ups + rw
    }
    println(firstcharupr)

    val ctc = List(10000, 20000, 30000, 40000, 50000)

    val netsal = ctc.map { sal =>
      val tax = sal * 10 / 100
      val hra = sal * 20 / 100
      val net = (sal - hra - tax)
      net
    }
    println("Net Salary is " + netsal)

    val ListofList = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9), List(10, 11, 12))

    val reverseall = ListofList.flatMap(x => x).reverse // reversing all the elements
    val reverseeach = ListofList.flatMap(x => x.reverse)
    println(reverseall)

    val arrlist = List("I am here to help", "Let me know if you need any help",
      "I will help you", "Thank you")

    val flatlist = arrlist.flatMap(x => x.split(" "))
    val maplist = flatlist.map(x => (x, 1))
    println(maplist)

    var listd = List(
      "101, Amar, M, 40000, 5",
      "102, Nidhi, F, 50000, 6",
      "103, Jay, M, 60000, 6",
      "104, Lakshmi, F, 60000, 6")

    listd.foreach(println)
    val required = listd.map(x => x.split(","))
    val needed = required.map(x => (x(2), x(3)))
    println(needed)

    println("filtering males")
    val males = listd.filter { x =>
      val sex = x.split(",")(2).toUpperCase()
      sex == 'M'
    }
    println(males)
    /*
     * If we have sub-collections, FlatMap comes into picture. All the elements are important
     * If we have collection and specific elements are important, Map comes into picture
     */

    val lists = List(List(1, 2, 3, 4), List(5, 6), List(7, 8, 9, 10, 11), List(1, 3, 5, 7, 9))

    val filtrs = lists.filter(x => x.size > 3)
    println("The greater than 3 ", filtrs)

    val arrays = Array(
      "101,Ram,30000,M,10",
      "102,Sita,40000,F,10",
      "103,Akshay,50000,M,11",
      "104,Sneha,60000,F,11")
      
    val tupl = arrays.map{x =>
      val w = x.split(",")
      val sex = w(3)
      val sal = w(2).toInt
      val ss = (sex,sal)
      println(ss)
      }
    // Mutliple keys
    
    val tupl1 = arrays.map{x =>
      val w = x.split(",")
      val name = w(1)
      val sex = w(3)
      val sal = w(2).toInt
      val keys = (name, sex)
      val ss = (keys,sal)
      println(ss)
      }   
  }

}