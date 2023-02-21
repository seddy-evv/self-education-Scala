package com.example

object Closures {
  def main(args: Array[String]) {
    println("devider(300): " + devider(300))
    println("devider(600): " + devider3(600))
  }

  var deviderFactor = 2
  val devider = (i: Int) => i / deviderFactor
  val devider3 = (i: Int) => i / 3
}
