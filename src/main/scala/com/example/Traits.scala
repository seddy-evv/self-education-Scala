package com.example

// A trait is an entity that encapsulates fields or methods that can then
// be used to insert into other classes. This mechanism helps us bypass
// lack of multiple inheritance in Scala - we can use any number of traits in a class.

object Traits {
  trait BaseTrait {
    def isScalaDeveloper (x: String): Boolean = x.equals("Scala Developer");
  }

  class DeveloperNew(sSpecialty: String) extends BaseTrait {
    var specialty:String = sSpecialty;
  }
  def main(args: Array[String]) {
    val scalaDeveloper = new DeveloperNew("Scala Developer");
    val javaDeveloper = new DeveloperNew("Java Developer");

    println(scalaDeveloper.isScalaDeveloper(scalaDeveloper.specialty));
    println(javaDeveloper.isScalaDeveloper(javaDeveloper.specialty));
  }
}