package com.xing.monad.version4

sealed trait Data
case class Normal(v:Double) extends Data
case class InvalidInput(error:String) extends Data

object Data {

  def apply(v: Double): Data = Normal(v)


  implicit class DataOps(v: Data) {
    def map(f: Double => Double): Data = v match {
      case Normal(v) => Normal(f(v))
      case _ => v
    }

    def flatMap(f: Double => Data): Data = v match {
      case Normal(v) => f(v)
      case _ => v
    }


  }

}