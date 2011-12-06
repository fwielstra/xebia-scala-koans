package org.functionalkoans.forscala

import support.KoanSuite

class AboutParentClasses extends KoanSuite {
  koan("Class heirarchy is linear, a class can only extend from one parent class") {
    class Worker(firstName: String, lastName: String) {}
    class Employee(firstName: String, lastName: String, employeeID: Long) extends Worker(firstName, lastName)
  }

  koan("A class that extends from another is polymorphic") {
    class Worker(val firstName: String, val lastName: String) {}
    class Employee(override val firstName: String, override val lastName: String,
                   val employeeID: Long) extends Worker(firstName, lastName)

    val me = new Employee("Name", "Yourself", 1233)
    val worker: Worker = me

    worker.firstName should be(__)
    worker.lastName should be(__)
  }

  koan("An abstract class, as in Java, cannot be instantiated and only inherited") {
    abstract class Worker(val firstName: String, val lastName: String) {}

    // if you uncomment this line, if will fail compilation
    //val worker = new Worker
  }


  koan("An class can be placed inside an abstract class just like in java") {
    abstract class Worker(val firstName: String, val lastName: String) {

      class Assignment(val hours: Long) {
        // nothing to do here.  Just observe that it compiles
      }

    }
  }


}
