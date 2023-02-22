// Iterators
package com.example

object IteratorDemo {
  def main(args: Array[String]) {
    var simpleIterator = Iterator("This ", "is ", "simple ", "iterator.")

    while (simpleIterator.hasNext) {
      print(simpleIterator.next())
    }

    simpleIterator = Iterator("This ", "is ", "simple ", "iterator.")

    println()
    println("Length of simpleIterator: " + simpleIterator.length)

    var integerIterator = Iterator(1, 2, 3, 4, 5, 6)
    println()
    println("Min value of integerIterator: " + integerIterator.min)

    integerIterator = Iterator(1, 2, 3, 4, 5, 6)

    println("Max value of integerIterator: " + integerIterator.max)
  }
}

// Lists

// var VARIABLE_NAME: List[DATA_TYPE] = List (OBJECT_1, OBJECT_2);

object ListDemo {
  def main(args: Array[String]) {
    val skills: List[String] = List("Java", "Scala", "SQL", "NoSQL", "Hibernate")

    val salaries: List[Int] = List(10, 20, 30, 40, 50)

    println("skills:" + skills)
    println("salaries: " + salaries)
  }
}

object ListConsDemo {
  def main(args: Array[String]) {

    val skills = "Java" :: ("Scala" :: ("SQL" :: ("NoSQL" :: ("Hibernate" :: Nil))))

    val salaries = 10 :: (20 :: (30 :: (40 :: (50 :: Nil))))

    val list = Nil.::(3).::(2).::(1)
    // Add to tail
    val listTail = list :+ 4

    println("skills:" + skills)
    println("salaries: " + salaries)
    println("list: " + listTail)
  }
}

// Multidimensional Lists

object TwoDimensionalListDemo {
  def main(args: Array[String]) {
    val twoDimensionalList: List[List[String]] =
      List(
        List("A", "B", "C"),
        List("D", "E", "F")
      )

    println("twoDimensionalList:")
    println(twoDimensionalList)
  }
}

// Lists per type Nothing

object NothingListDemo {
  def main(args: Array[String]) {
    val nothingList:List[Nothing] = List()

    println("nothingList: " + nothingList)
  }
}

// Basic List Operations

object ListBasicOperationsDemo {
  def main(args: Array[String]) {
    val list1 = 1 :: (2 :: (3 :: Nil))
    val list2 = 4 :: (5 :: (6 :: Nil))

    println("list1: " + list1)
    println("list2: " + list2)

    val commonList = List.concat(list1, list2)
    println("commonList" + commonList)

    println("Reversed commonList: " + commonList.reverse)
  }
}

// Map
// The key must be unique, and the value can be repeated within the collection.

// var collection_name:Map[Int,String] = Map();
//
// or
//
// var collection_name = Map(1-> "First", 2 -> "Second");

object MapDemo {
  def main(args: Array[String]) {
    var users = Map(1 -> "Ivan Ivanov", 2 -> "Kolya Nikolaev", 3 -> "Viktor Viktorov")

    println("users: " + users)
    println("users keys: " + users.keys)
    println("users values: " + users.values)


    val moreUsers = Map(4 -> "Innokentii Morozov", 5 -> "Mikhail Mikheev")

    println("moreUsers: " + moreUsers)

    users = users ++ moreUsers

    println("users: " + users)

    println("users contains key 1: " + users.contains(1))
    println("users contains key 100: " + users.contains(100))
  }
}

// Set
// A set is a collection that contains only unique values.

// var set_name : Set [String] = Set();
//
// or
//
// set_name = Set("First", "Second", "Third");

object SetBasicOperationsDemo {
  def main(args: Array[String]) {
    val skills1 = Set("Java", "Java", "SQL", "SQL")
    val skills2 = Set("Scala", "Scala", "Play", "Play")

    println("skills1: " + skills1)
    println("skills2: " + skills2)

    val allSkills = skills1 ++ skills2

    println("allSkills: " + allSkills)

    println("Max element allSkills: " + allSkills.max)
    println("Min element allSkills: " + allSkills.min)
  }
}

// Options
// Option  – is a collection of elements of the given type.

// def findDeveloper(key: String): Option[Developer];

object OptionDemo {
  def main(args: Array[String]) {
    val developers = Map("Eugene Suleimanov" -> "Java/Scala Developer", "Ivan Ivanov" -> "C++ Developer")

    println("developers: " + developers)

    println("developers.get(\"Eugene Suleimanov\"): " + developers.get("Eugene Suleimanov"))
    println("developers.get(\"Ivan Ivanov\"): " + developers.get("Eugene Suleimanov"))
    println("developers.get(\"Kolya Nikolaev\"): " + developers.get("Kolya Nikolaev"))


    println()
    println("Using method showDevelopers...")

    println("showDevelopers(developers.get(\"Eugene Suleimanov\")): " + showDevelopers(developers.get("Eugene Suleimanov")))
    println("showDevelopers(developers.get(\"Ivan Ivanov\")): " + showDevelopers(developers.get("Ivan Ivanov")))
    println("showDevelopers(developers.get(\"Kolya Nikolaev\")): " + showDevelopers(developers.get("Kolya Nikolaev")))
  }

  def showDevelopers(x: Option[String]):String = x match {
    case Some(some)=> some;
    case None => "Developer with this name not found";
  }
}

// Tuple
// Tuple – is a data structure that combines a certain number of elements of one or more types.

// val collection_name = ("Some String", 100500, "#FFFFFF");

object TupleDemo {
  def main(args: Array[String]) {
    val simpleTuple = ("String", 100500, "#FFFFFF")

    println("simpleTuple: ")
    simpleTuple.productIterator.foreach { element => println("Element: " + element) }

    val integerTuple = (1, 2, 3)

    val integerTupleSum = integerTuple._1 + integerTuple._2 + integerTuple._3

    println("integerTuple: " + integerTuple)
    println("integerTupleSum: " + integerTupleSum)

    val stringTuple = Tuple2("First", "Second")

    println("stringTuple: " + stringTuple)
    println("Swapped integerTuple: " + stringTuple.swap)
  }
}