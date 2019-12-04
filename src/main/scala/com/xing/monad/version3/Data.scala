package com.xing.monad.version3

sealed trait Data
case class Normal(v:Double) extends Data
case class InvalidInput(error:String) extends Data

object Data {

  implicit class DataOps(v: Data) {
    def computerIfNormal(f: Double => Double): Data = v match {
      case Normal(v) => Normal(f(v))
      case _ => v
    }
  }

}