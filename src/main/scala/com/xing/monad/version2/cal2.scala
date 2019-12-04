package com.xing.monad.version2

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
    val divResult: Data = div(x1, x2)
    val result: Data = divResult match {
      case Normal(v) =>
        val sumResult = sum(v, x3)
        val sqrtResult = sqrt(sumResult)
        sqrtResult match {
          case Normal(v1) => Normal(sub(v1, x4))
          case InvalidInput(e1) => InvalidInput(e1)
        }
      case InvalidInput(e) => InvalidInput(e)
    }

    println(result)
  }

  def main(args: Array[String]): Unit = {
    cal2.calculation

    Option
  }
}
