package com.example
// In Scala, classes and objects can have the following access modifiers:
//
// private
// protected
// public – Assigned by default (if not specified explicitly)

// public
class PublicDemo {

  class Developer {
    def writeCode(): Unit = {
      println("Developer writes code...")
    }

    class InnerDeveloperClass {
      writeCode()
    }

  }

  (new Developer).writeCode()   // Must work - method is public
}

// protected
package ProtectedDemo{
  class Specialist{
    protected def makeJob(): Unit ={
      println("Specialist makes job...")
    }
  }

  class Developer extends Specialist{
    makeJob()
  }

  class Animal{
    //    (new Specialist).makeJob();  We get error - method makeJob() is protected and can't be accessed.
  }
}

// private
class PrivateDemo {

  class Developer {
    private def sleep() {
      println("Developer sleeps at home...")
    }


    class InnerDeveloperClass{
      sleep()
    }
  }

  //  (new Developer).sleep();  Error - private method of class Developer is not accessible outside the class.
}

// protection area
package project {
  package specialists {

    class Developer {
      private[specialists] var specialty = "Java Developer"
      private[project] var position = "Team Lead"
      private[this] var hobby = "Sport"

      def doJob(developer: Developer) {
        println(developer.specialty)
        println(developer.position)
        //        println(developer.hobby); // Error - not accessible
      }
    }
  }
}