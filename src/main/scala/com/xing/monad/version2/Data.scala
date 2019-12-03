package com.xing.monad.version2

sealed trait Data
case class Normal(v:Double) extends Data
case class InvalidInput(error:String) extends Data
