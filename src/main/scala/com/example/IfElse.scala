package com.example
import scala.util.Random
//if(LOGICAL_EXPRESSION){
//   code that is executed if the expression returns true
//}else {
//   code that is executed if the expression returns false
//}

object IfElse {
  def main(args: Array[String]) {
    val specialty: String = "Java/Scala Developer";

    if (specialty == "Java/Scala Developer") {
      println("You are Java/Scala Developer")
    } else {
      println("You are not Java/Scala Developer")
    }
    // Also, we can use the IF statement alone:
    val number = 50;

    if (number < 100) {
      println("This number is less than 100");
    }
  }

  // Construction of several IF / ELSE following one another:
  val specialty: String = "C++";
  if (specialty == "Java") {
    println("You are Java Developer");
  } else if (specialty == "C++") {
    println("You are C++ developer");
  } else if (specialty == "Scala") {
    println("You are Scala developer");
  } else {
    println("Unknown specialty");
  }

  // Nested IF/ELSE constructs:
  val profession: String = "Developer";
  val specialty1: String = "Java";

  if (profession == "Developer") {
    if (specialty1 == "C++") {
      println("You are C++ developer");
    } else if (specialty1 == "Java") {
      println("You are Java developer");
    }
  } else if (profession == "Designer") {
    if (specialty1 == "3D") {
      println("You are 3D designer");
    } else if (specialty1 == "Web") {
      println("You are Web designer");
    }
    // Functional style
    val result = if (Random.nextBoolean()) 1 else 2
    println(result)
  }
}
