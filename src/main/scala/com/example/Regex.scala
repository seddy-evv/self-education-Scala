package com.example


object Regex {
  def main(args: Array[String]) {
    val pattern = "Scala Developer".r
    val scalaDeveloper = "Eugene Suleimanov is a Java/Scala Developer"

    println(pattern findFirstIn scalaDeveloper)

    val patternC = "C".r
    val scalaDeveloperAlex = "Alex is C developer"

    println(patternC replaceAllIn(scalaDeveloperAlex, "Java/Scala"))
  }
}