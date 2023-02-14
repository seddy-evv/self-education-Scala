package com.example

import java.io._
import scala.io.Source


object Files {
  def main(args: Array[String]) {
    val filePath = "textFile.txt";
    // Write file
    val writer = new PrintWriter(new File(filePath));
    writer.write("This is simple text file.");
    writer.close();
    // Read file
    val txtSource = Source.fromFile(filePath)
    txtSource.foreach {
      print
    }
    txtSource.close()
  }
}
