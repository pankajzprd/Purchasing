package com.suth.newpackage

import java.io._
import scala.io.Source

object FileIOoperations_16 {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("files/file1.txt"))
    writer.write("This is the first line")
    writer.write("This is the Second line")
    writer.close()

    val lines = Source.fromFile("files/hello.txt").getLines().take(3)
    while (lines.hasNext) {
      println(lines.next())
    }
  }

}