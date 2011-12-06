package org.functionalkoans.forscala

import support.KoanSuite
import scala.collection.mutable

class AboutMutableMaps extends KoanSuite {

  koan("Mutable maps can be created easily") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.size should be(__)
    myMap += "OR" -> "Oregon"
    myMap contains "OR" should be(__)
  }

  koan("Mutable maps can have elements removed") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap -= "OH"
    myMap contains "OH" should be(__)
  }

  koan("Mutable maps can have tuples of elements removed") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap -= ("IA", "OH")
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable maps can have tuples of elements added") {
    val myMap = mutable.Map("MI" -> "Michigan", "WI" -> "Wisconsin")
    myMap += ("IA" -> "Iowa", "OH" -> "Ohio")
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable maps can have Lists of elements added") {
    val myMap = mutable.Map("MI" -> "Michigan", "WI" -> "Wisconsin")
    myMap ++= List("IA" -> "Iowa", "OH" -> "Ohio")
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable maps can have Lists of elements removed") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap --= List("IA", "OH")
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

  koan("Mutable maps can be cleared") {
    val myMap = mutable.Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
    myMap.clear() // Convention is to use parens if possible when method called changes state
    myMap contains "OH" should be(__)
    myMap.size should be(__)
  }

}
