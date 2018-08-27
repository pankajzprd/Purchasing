package com.suth.newpackage

/*
 * Case class is similar to regular class except that it creates its own companion 
 * object by default along with apply(), toString(), hashcode and equals methods
 * by default
 */
case class caseclass_8(id: Int, name: String) {
  println(s"Hello $name")
}

object caseclass_8 {
  def main(args: Array[String]): Unit = {
    
    // Instance of the case class
    val cc1: caseclass_8 = caseclass_8(101, "Jack")
    val cc2: caseclass_8 = caseclass_8(102, "Ramesh")
    // Accessing the fields of the case class
    println(cc1.id)
    println(cc2.name)
    
  }
}