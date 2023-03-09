package com.example

import java.time.LocalDateTime

// Variable declaration example
// val or var VariableName : Data type = [Initial value];
// val or var VariableName : Data type;
// All types in Scala - objects with methods


object Variables {

  def main(args: Array[String]){
    // Mutable variables var
    var someVariableVar : String = "Some String"
    someVariableVar = "22"
    // Immutable variables val
    val someVariableVal : String = "Some String"
    // The type can be not specified and the compiler will determine it itself
    val simpleAutoDetectedString = "This is simple String"
    var simpleAutoDetectedInteger = 200800
    // Multiple assignment
    val (simpleInteger: Int, simpleString: String) = (100500, "String")
    val (simpleAutoInteger, simpleAutoString) = (100500, "String")
    simpleProgram()
    // Blocks
    val v3 = {
      val v1 = 1
      val v2 = v1 + 1
      v2 + 1
    }
    println(v3)
    // Type Unit, equals type void in other languages
    val v4: Unit = {
    }
    val v5: Unit = ()
    println(v4)
    println(v4.isInstanceOf[Unit])
    println(v5.getClass)
    // All types in Scala instance of class Any
    println(v5.isInstanceOf[Any])
    // Primitive types (double, float, long, boolean, Unit etc) are instances of class AnyVal
    // Types String, Option and custom classes are instances of class AnyRef
    // Type null is instance of types String, Option, custom class, AnyRef
    // Type nothing is instance of all types
    // When we specify the type of a variable or the return value type of a function,
    // instead of the specified type, you can use instance of this type

    // Get a current date
    val date = LocalDateTime.now()
    println(date)
  }
  // Program example
  def simpleProgram() {
    val simpleInteger: Int = 100500
    val simpleString: String = "This is simple String"
    val simpleAutoDetectedInteger = 200800
    val simpleAutoDetectedString = "This is simple auto detected String"

    println("simpleInteger:")
    println(simpleInteger)

    println("simpleString:")
    println(simpleString)

    println("simpleAutoDetectedInteger:")
    println(simpleAutoDetectedInteger)

    println("simpleString:")
    println(simpleAutoDetectedString)
  }

}

