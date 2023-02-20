package com.example

class Developer(val name: String, val specialty: String) {
  var developerName: String = name
  var developerSpecialty: String  = specialty

  def writeCode() {
    println(this.developerSpecialty + " writes code.")
  }
  // You must always specify a type for method parameters,
  // the return type the compiler can determine
  def max (a: Int, b: Int): Int ={
    if (b > a) b else a
  }
}


// Unlike Java, in Scala we cannot have static entities.
// This is because Scala is more of an object oriented programming language.
// Instead of static objects, in this programming language we use single objects
// (singleton objects).
// We create an object with the 'object' keyword. After we have created this object,
// we cannot pass parameters to the constructor.

object DeveloperDemo {
  def main(args: Array[String]) {
    val javaScalaDeveloper = new Developer("Alex", "Java/Scala Developer")


    println("Developer name: " + javaScalaDeveloper.developerName)
    println("Developer specialty: " + javaScalaDeveloper.developerSpecialty)
    javaScalaDeveloper.writeCode()
  }
}

// Inheritance, to override need to write 'override'

class Program(val name: String) {

  var programName: String = name

  def startWork() {
    println("Hello, I'm a simple program. My name is: " + this.name)
  }
}

class SecuredProgram(override val name: String, val securityCertificate: String) extends Program(name) {
  override def startWork() {
    println("Hello, I'm a secured program. My name is: " + this.name)
    println("I have security certificate: " + this.securityCertificate)
  }
}

object ProgramDemo {
  def main(args: Array[String]) {
    val program = new Program("Simple Program")
    program.startWork()

    val securedProgram = new SecuredProgram("Secured Program", "Security Certificate")
    securedProgram.startWork()
  }
}

// Hidden classes
object Squaring {

  implicit class Squarer(x: Int) {
    def numberSquaring[A](f: => A): Unit = {
      println(x + " * " + x + " = " + x * x)
    }
  }
}

import Squaring._

object SquaringDemo {
  def main(args: Array[String]) {
    100 numberSquaring()
  }
}

object HelloWorldApp extends App{
  println("Hello World App")
}

// AnyVal
class MyInt(val value: Int) extends AnyVal {
  def add(other: MyInt) = new MyInt(value + other.value)
  def multiply(other: MyInt) = new MyInt(value * other.value)
  override def toString: String = s"MyInt($value)"
}

object Test {
  def main(args: Array[String]) {
    val a = new MyInt(10)
    val b = new MyInt(20)
    val c = new MyInt(2)
    println(a add b multiply c)
  }
}

class MyIntWithCorrectPrior(val value: Int) extends AnyVal {
  // Operator (methods) precedence in Scala is determined by the first character in their name
  def +(other: MyIntWithCorrectPrior) = new MyIntWithCorrectPrior(value + other.value)
  def *(other: MyIntWithCorrectPrior) = new MyIntWithCorrectPrior(value * other.value)
  // As a rule, most operators are left-associative, but right-associative ones can also occur.
  def ::(other : MyIntWithCorrectPrior) = new MyIntWithCorrectPrior(s"${other.value}$value".toInt)
  override def toString: String = s"MyIntWithCorrectPrior($value)"
}

object Test1 {
  def main(args: Array[String]) {
    val a = new MyIntWithCorrectPrior(10)
    val b = new MyIntWithCorrectPrior(20)
    val c = new MyIntWithCorrectPrior(2)
    println(a + b * c)
    print(a :: b)
    print(a :: b :: c)
    print(c.::(b).::(a))
  }
}