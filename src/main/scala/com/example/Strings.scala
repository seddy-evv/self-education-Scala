package com.example

object Strings {
  // Create a string
  val simpleStringAutoString = "This is simple String";
  var simpleString:String = "This is simple String";

  def main(args: Array[String]) {
    println(simpleString);

    // String concatenation
    val developerName: String = "Eugene";
    val developerSpecialty: String = "Java/Scala developer";

    val developerData: String = developerName + " is a " + developerSpecialty + ".";
    println(developerData);
    // Interpolator S
    val developerNameAutoString = "Eugene Suleimanov";

    println(s"Developer name: $developerNameAutoString");
    println(s"100 * 8 = ${100 * 8}");

    // Interpolator F
    val product = "Milk";
    val price = 12.5d;

    println(f"$product%s price is: $price%2.2f");
    // Interpolator RAW
    println(raw"This \b String ignores \n escape sequences \n");
  }
}