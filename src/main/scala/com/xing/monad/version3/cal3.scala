package com.xing.monad.version3

object cal3 {
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

    //todo implement with computerIfNormal
    val divResult: Data = div(x1, x2)
    val sumResult: Data = divResult.computerIfNormal(sum(_, x3))
    val sqrtResult: Data = sumResult match {
      case Normal(v) => sqrt(v)
      case e => e
    }
    val result = sqrtResult.computerIfNormal(sub(_, x4))

    println(result)
  }

  def main(args: Array[String]): Unit = {
    cal3.calculation

    Option
  }
}
