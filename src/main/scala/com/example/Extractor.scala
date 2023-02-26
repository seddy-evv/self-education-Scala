package com.example

// An extractor is an object that has a method to remove one of its members.

object Extractor {
  def main(args: Array[String]) {
    println(apply("Eugene Suleimanov", "Java/Scala Developer"))
    println(unapply("Ivan Ivanov: C++ Developer"))
    println(unapply("Kolya Nikolaev - PHP Developer"))
  }

  def apply(name: String, specialty: String): String = {
    name + ": " + specialty
  }

  def unapply(str: String): Option[(String, String)] = {
    val stringParts = str split ":"

    if (stringParts.length == 2) {
      Some(stringParts(0), stringParts(1))
    } else {
      None
    }
  }
}