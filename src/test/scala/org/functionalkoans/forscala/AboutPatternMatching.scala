package org.functionalkoans.forscala

import support.KoanSuite

class AboutPatternMatching extends KoanSuite {


  koan("Pattern matching returns something") {

    val stuff = "blue"

    val myStuff = stuff match {
      case "red" => println("RED"); 1
      case "blue" => println("BLUE"); 2
      case "green" => println("GREEN"); 3
      case _ => println(stuff); 0
    }

    myStuff should be(__)

  }

  koan("Pattern matching can return complex somethings") {
    val stuff = "blue"

    val myStuff = stuff match {
      case "red" => (255, 0, 0)
      case "green" => (0, 255, 0)
      case "blue" => (0, 0, 255)
      case _ => println(stuff); 0
    }

    myStuff should be(__, __, __)

  }

  koan("Pattern matching can match complex expressions") {


    def goldilocks(expr: Any) = expr match {
      case ("porridge", "Papa") => "Papa eating porridge"
      case ("porridge", "Mama") => "Mama eating porridge"
      case ("porridge", "Baby") => "Baby eating porridge"
      case _ => "what?"
    }

    goldilocks(("porridge", "Mama")) should be(__)

  }

  koan("Pattern matching can wildcard parts of expressions") {

    def goldilocks(expr: Any) = expr match {
      case ("porridge", _) => "eating"
      case ("chair", "Mama") => "sitting"
      case ("bed", "Baby") => "sleeping"
      case _ => "what?"
    }

    goldilocks(("porridge", "Papa")) should be(__)
    goldilocks(("chair", "Mama")) should be(__)

  }
  koan("Pattern matching can substitute parts of expressions") {


    def goldilocks(expr: Any) = expr match {
      case ("porridge", bear) => bear + " said someone's been eating my porridge"
      case ("chair", bear) => bear + " said someone's been sitting in my chair"
      case ("bed", bear) => bear + " says someone's been sleeping in my bed"
      case _ => "what?"
    }

    goldilocks(("porridge", "Papa")) should be(__)
    goldilocks(("chair", "Mama")) should be(__)

  }


}
