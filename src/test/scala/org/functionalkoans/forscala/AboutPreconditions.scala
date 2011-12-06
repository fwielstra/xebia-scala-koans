package org.functionalkoans.forscala

import support.KoanSuite

class AboutPreconditions extends KoanSuite {

  class WithParameterRequirement(val myValue: Int) {
    require(myValue != 0)

    def this(someValue: String) {
      this (1)
    }
  }

  // Instruction: use Intercept to catch the type of exception thrown by an invalid precondition
  koan("On precondition violation, intercept expects type of exception thrown") {
    intercept[___] {
      val myInstance = new WithParameterRequirement("")
    }
  }
}




	
