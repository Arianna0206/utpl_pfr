package Taller1
import io.StdIn._
object Fibonacci {
  def main(args: Array[String]): Unit = {

    var n1 = 0
    var n2 = 1
    var suma = 1

    println("Ingrese un número")
    var se = readInt()

    for(i <- 1 to se){

      suma = n1 + n2
      n1 = n2
      n2 = suma

    }
    println("El ultimo número del fibonacci es " + n2)
  }

  def fibonacci(n: Double): Double = {
    if(n == 0){
      return 0
    }else {
      if (n == 1){
        return 1
      }else{
        return fibonacci(n - 1) + fibonacci(n - 2)
      }
    }
  }

}

