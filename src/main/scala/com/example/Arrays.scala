package com.example
import Array._


object Arrays {
  def main(args: Array[String]) {
    // Array declaration
    // var stringArray[String] = new Array[String](10)
    //
    // OR
    //
    // var stringArray = new Array[String](10);
    val integerArray = Array(10, 20, 30, 40, 50)
    println(integerArray(1))
    println("integerArray: ")
    for (arrayElement <- integerArray) {
      print(arrayElement + " ")
    }

    println()

    var integerArrayTotalSum = 0

    for (arrayElement <- integerArray) {
      integerArrayTotalSum += arrayElement
    }

    println("Total sum of array elements is: " + integerArrayTotalSum)

    // Multidimensional arrays
    // var twoDimensionalArray = ofDim[String](2,2);
    val twoDimensionalArray = ofDim[String](5, 5)

    println("Filling twoDimensionalArray...")
    for(i <- 0 to 4){
      for(j <- 0 to 4){
        twoDimensionalArray(i)(j) = "*"
      }
    }

    println("twoDimensionalArray:")

    for(i <- 0 to 4){
      for(j <- 0 to 4){
        print(twoDimensionalArray(i)(j) + " ")
      }
      println()
    }
    // Merging arrays
    val integerArrayOne = Array(2, 4, 6, 8)
    val integerArrayTwo = Array(1, 3, 5, 7)

    println("integerArrayOne: ")
    for (arrayElement <- integerArrayOne) {
      print(arrayElement + " ")
    }

    println()

    println("integerArrayTwo: ")
    for (arrayElement <- integerArrayTwo) {
      print(arrayElement + " ")
    }

    println()

    val integerConcatenatedArray = concat(integerArrayOne, integerArrayTwo)

    println("integerConcatenatedArray: ")
    for (arrayElement <- integerConcatenatedArray) {
      print(arrayElement + " ")
    }

    println()

    val sortedIntegerConcatenatedArray = integerConcatenatedArray.sorted

    println("sortedIntegerConcatenatedArray: ")
    for (arrayElement <- sortedIntegerConcatenatedArray) {
      print(arrayElement + " ")
    }
  }
}
