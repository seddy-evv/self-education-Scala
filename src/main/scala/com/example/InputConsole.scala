package com.example

object InputConsole {
  def main(args: Array[String]) {
    println("Enter Your name: ");
    val userName = scala.io.StdIn.readLine();
    println("Nice to meet You, " + userName);
  }
}