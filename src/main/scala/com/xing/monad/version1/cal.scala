package com.xing.monad.version1

object cal {
  def sqrt(v:Double):Double =
    if (v <0)
      throw new Exception("sqrt should not less than 0")
    else Math.sqrt(v)

  def div(numerator:Double, denominator:Double):Double =
    if (denominator == 0)
      throw new Exception("denominator should not be zero")
    else numerator/denominator

  def sum(left:Double, right:Double):Double = left + right

  def sub(left:Double, right:Double):Double = left - right

  def calculation:Unit = {
    val x1 = 6
    val x2 = 2
    val x3 = 6
    val x4 = 1

    val result = sub(sqrt(sum(div(x1,x2),x3)),x4)
    println(result)
  }

  def main(args: Array[String]): Unit = {
    cal.calculation

    Option
  }

}
