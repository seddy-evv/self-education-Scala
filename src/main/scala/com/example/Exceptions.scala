package com.example

object Exceptions {
  def main(args: Array[String]) {
    try {
      val result = 100 / 0
      println(result)
    } catch {
      // Curly braces can be removed
      case ex: ArithmeticException =>
        println(ex)
    }
    // Try-exception with finally
    try {
      val result = 100 / 0
      println(result)
    } catch {
      case ex: ArithmeticException =>
        println(ex)
        println("ArithmeticException - cannot divide by zero")
    }finally {
      println("Block finally. This message will be shown in most cases.")
    }
  }
}