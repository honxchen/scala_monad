package com.xing.monad.version2

import com.xing.monad.version1.cal

object cal2 {
  def sqrt(v:Double):Data =
    if (v <0)
      InvalidInput("sqrt should not less than 0")
    else
      Normal(Math.sqrt(v))

  def div(numerator:Double, denominator:Double):Data =
    if (denominator == 0)
      InvalidInput("denominator should not be zero")
    else
      Normal(numerator/denominator)

  def sum(left:Double, right:Double):Double = left + right

  def sub(left:Double, right:Double):Double = left - right

  def calculation:Unit = {
    val x1 = 6
    val x2 = 2
    val x3 = 6
    val x4 = 1

    //todo implement sub(sqrt(sum(div(x1,x2),x3)),x4)

  }

  def main(args: Array[String]): Unit = {
    cal.calculation

    Option
  }
}
