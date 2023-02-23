package com.example

// While
object WhileDemo {
  def main(args: Array[String]) {
    var counter: Integer = 1

    while (counter <=5 ) {
      println(counter)
      counter += 1
    }
  }
}

// do while
// do {
//   code block
// }
// while( LOGICAL EXPRESSION );
object DoWhileDemo {
  def main(args: Array[String]) {
    var counter: Integer = 1

    do {
      println(counter)
      counter += 1
    } while (counter < 5)
  }
}

// for
// for( var counter <- Range ){
//   method(s);
// }
object ForLoopDemo {
  def main(args: Array[String]) {
    for (counter <- 0 to 5){
      println(counter)
    }
    println()
    for (counter <- 0 until  4){
      println(counter)
    }
    println()
    for (counter <- 0 to (10,2))println(counter)
    println()
    // Nested cycles
    val col1 = List("a", "b", "c")
    val col2 = Array(1, 2, 3, 4)
    for (v1 <- col1){
      for (v2 <- col2){
        println(s"$v1 - $v2")
      }
    }
    println()
    // other functional way
    val result = for {
      v1 <- col1
      v2 <- col2
    } yield s"$v1 - $v2"
    println(result)
    // other functional way with variable
    val result1 = for {
      v1 <- col1
      v2 <- col2 if v2 < 2
    } yield s"$v1 - $v2"
    println(result1)
  }
}

object ForLoopCollectionDemo {
  def main(args: Array[String]) {
    val integerList = List(10, 20, 30, 40, 50)

    for (counter <- integerList ){
      println(counter)
    }
  }
}

// yield
// yield returns value from cycle "for", type value is equal collection type
// var someReturnValue = for{ var counter <- List
//      if condition1; if condition2...
//   }
//   yield counter

object ForLoopYieldDemo {
  def main(args: Array[String]) {
    val integerList = List(10, 20, 30, 40, 50)

    val filteredValue = for {counter  <- integerList if counter!= 10; if counter < 50}
      yield counter

    for(counter <- filteredValue){
      println(counter)
    }
  }
}
// As you can see, we left only those values that satisfy the conditions != 10 and < 50

// Break the loop
import scala.util.control.Breaks
object BreakLoopDemo {
  def main(args: Array[String]) {
    val loop = new Breaks

    loop.breakable({
      for(counter <- 1 to 10){
        println(counter)
        if(counter == 5){
          loop.break
        }
      }
    })
  }
}

// Alternative to cycles

object Alternative {
  def main(args: Array[String]) {
    // recursion
    @scala.annotation.tailrec
    def factorial2(n:Int, acc: BigInt = 1): BigInt = {
      assert(n >= 0,"error")
      if (n > 0) factorial2(n - 1, acc * n)
      else acc
    }
    println(factorial2(10))
    // range
    def factorial3(n: Int): BigInt = {
      assert(n >= 0,"error")
      if (n == 0) 1
      else (1 to n).foldLeft(BigInt(1)){(acc, e) =>
        acc * e
      }
    }
    println(factorial3(10))
    // equals factorial4
    def factorial4(n: Int): BigInt = {
      assert(n >= 0,"error")
      if (n == 0) 1
      else (1 to n).foldLeft(BigInt(1)){_ * _}
    }
    println(factorial4(10))
    // reduce
    def factorial5(n: Int): BigInt = {
      assert(n >= 0,"error")
      if (n == 0) 1
      else (BigInt(1) to BigInt(n)).product
    }
    println(factorial5(10))
    // product
    def factorial6(n: Int): BigInt = {
      assert(n >= 0,"error")
      if (n == 0) 1
      else (BigInt(1) to BigInt(n)).product
    }
    println(factorial6(10))
  }
}
