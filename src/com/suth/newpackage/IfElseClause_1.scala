package com.suth.newpackage

object IfElseClause_1 {
  def main(args: Array[String]): Unit = {
    val employees = 10000
    val hikepercentage = 10
    val bellhike = 5

    if (employees > 20000) {
      println(s"Overall amount required is = ${employees * bellhike}")
    } else if (employees == 20000) {
      println(s"Hike percentage is = $hikepercentage")
    } else {
      println(s"Overall amount required now is = ${employees * hikepercentage}")
    }
  }
}