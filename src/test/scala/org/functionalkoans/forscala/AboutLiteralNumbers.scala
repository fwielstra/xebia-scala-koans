package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.KoanSuite

class AboutLiteralNumbers extends KoanSuite with ShouldMatchers {
  koan("Integer Literals are 32-bit and can be created from decimal, octal, or hexadecimal") {
    val a = 2
    val b = 31
    val c = 0x30F
    val d = 077
    val e = 0
    val f = -2
    val g = -31
    val h = -0x30F
    val i = -077
    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    d should be(__) //Hint: 077 = 63
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__) //Hint: 30F = 783
    i should be(__) //Hint: 077 = 63
  }

  koan("""Long Literals are 64 bit, are specified by appending an L or l at the end;
         |   l is rarely used since it looks like a 1""") {
    val a = 2L
    val b = 31L
    val c = 0x30FL
    val d = 077L
    val e = 0L
    val f = -2l
    val g = -31L
    val h = -0x30FL
    val i = -077L

    a should be(__)
    b should be(__)
    c should be(__) //Hint: 30F = 783
    d should be(__) //Hint: 077 = 73
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__) //Hint: 30F = 783
    i should be(__) //Hint: 077 = 63
  }

  koan("""Float and Double Literals are IEEE 754 for specific,
         |   Float are 32-bit length, Doubles are 64-bit.
         |   Floats can be coerced using a f or F suffix, and
         |   Doubles can be coerced using a d or D suffix.
         |   Exponent are specified using e or E.""") {

    val a = 3.0
    val b = 3.00
    val c = 2.73
    val d = 3f
    val e = 3.22d
    val f = 93e-9
    val g = 93E-9
    val h = 0.0
    val i = 9.23E-9D

    a should be(__)
    b should be(__)
    c should be(__)
    d should be(__)
    e should be(__)
    f should be(__)
    g should be(__)
    h should be(__)
    i should be(__)
  }


  koan("""Trick: To distinguish the dot for a method invocation from the
          |   decimal point in a float or double literal,
          |   add a space after the literal""") {
    3.0.toString should be(__)
    3.toString should be(__)
    (3. toString) should be(__)
    (3.0 toString) should be(__)
    3d.toString should be(__)
  }

}
