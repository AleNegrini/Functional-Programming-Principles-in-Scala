package week1

object NewtonSqrt_block extends App {

  def sqrt(x: Double): Unit = {

    def sqrtNetworkMethod (guess: Double, x: Double): Double = {
      if (isGoodEnough(guess,x)) guess
      else sqrtNetworkMethod(improve(guess,x),x)
    }

    def abs(x: Double) = {
      if (x > 0) x else -x
    }

    def isGoodEnough(d: Double, d1: Double) = {
      if (abs(d * d - d1) < 0.001) true
      else false
    }

    def improve(d: Double, d1: Double) = {
      ( d + d1 / d)/2
    }

    println(sqrtNetworkMethod(1.0, x))

  }

  sqrt(36)


}
