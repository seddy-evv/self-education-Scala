package com.example

object MatchCase {
  def main(args: Array[String]) {
    println(specialtyTest("Java"))
    println(specialtyTest("C++"))
    println(specialtyTest("Scala"))
    println(specialtyTest("PHP"))
  }

  def specialtyTest(specialty: String): String = specialty match {
    case "Scala" => "Scala Developer"
    case "Java" => "Java Developer"
    case "C++" => "C++ Developer"
    case _ => "Unsupported specialty"
  }
}
