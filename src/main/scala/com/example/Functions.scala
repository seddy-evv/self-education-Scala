package com.example

// def FUNCTION_NAME ([LIST_PARAMETERS]): [return RETURN_TYPE] = {
//
//   BODY_FUNCTION;
//   return [EXPRESSION];
//
// }

object alert {
  def printAlertMessage(): Unit = {
    println("ALERT!!!")
    // Infix, method as operator
    Console println "Hi"
    // In Scala all operators are methods !
  }
}

object multiplication {
  def multipleIntegers(first: Int, second: Int): Int = {
    val result = first * second

    result
  }
}

import alert._
import multiplication._


object FunctionsDemo {
  def main(args: Array[String]):Unit= {
    val firstInteger = 100
    val secondInteger = 7

    val multiplicationResult = multipleIntegers(firstInteger, secondInteger)

    println(firstInteger + " * " + secondInteger + " = " + multiplicationResult)

    printAlertMessage()

    // ??? returns nothing
    def f(a1: Int, a2: String): String = ???

    // Recursion
    val fac = (x: Int) => {
      @scala.annotation.tailrec
      def factorial(x: Int, accum: Int): Int = if (x == 1) accum else factorial(x-1, accum*x)
      factorial(x,1)
    }
    println(fac(5))

    // Anonymous functions
    // Int => Int - functional type
    val sqr: Int => Int = (x: Int) => x * x
    // We can replace expression above to
    // val sqr = new Function1[Int, Int] {
    //   override def apply(v1: Int) = v1 * v1
    // }
    // or we can replace to
    // val sqr = (x: Int) => x * x
    println(sqr(3))
    val add: (Int, Int) => Int = (x, y) => x + y
    // We can replace expression above to
    //   val add = (x: Int, y: Int) => x + y
    // or
    //   val add: (Int, Int) => Int = _ + _
    // or
    //   val add = (_: Int) + (_: Int)
    println(add(1, 2))

    // Complex anonymous function
    val addSqr = (x: Int, y: Int) => {
      val f = (a: Int) => a * a
      val x2 = f(x)
      val y2 = f(y)
      add(x2, y2)
    }
    println(addSqr(2, 3))
  }
}