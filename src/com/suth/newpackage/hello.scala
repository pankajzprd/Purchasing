package com.suth.newpackage

object hello {
  def main(args: Array[String]): Unit = {
    /* var name = "Pankaj"
    println(name.toLowerCase())
    println(name.toUpperCase())
    println(name.charAt(1))
    println(name.compareTo("PANKAJ"))
    println(name.compareToIgnoreCase("PankaJ"))
    println(name.concat(" Hadoop"))
    println(name.contains("a", "j"))
    println(name.endsWith("J"))
    println(name.endsWith("j"))
    println(name.equals("Pankaj"))
    println(name.getBytes)
    println(name.hashCode())
    println(name.indexOf("P"))
    println(name.isEmpty())
    println(name.init)
    println(name.lastIndexOf("a"))
    println(name.length())
    println(name.last)
    println(name.matches("Pank%"))
    println(name.map(x => x + " A")) // returns VECTOR
*/
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
      val fw = upr.substring(0, 1)  // we can also use Slice function
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
    
    val ListofList = List(List(1,2,3), List(4,5,6), List(7,8,9),List(10,11,12))
    
     val reverseall = ListofList.flatMap(x => x).reverse // reversing all the elements 
     val reverseeach = ListofList.flatMap(x => x.reverse)
     println(reverseall)
     println(reverseeach)
  }

}
