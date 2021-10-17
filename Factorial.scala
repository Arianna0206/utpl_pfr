package Taller1

object Factorial {

  def main(args: Array[String]): Unit = {
    printf("Resultado = %.0f\n", factorial(5))
  }

  def factorial(numero: Double): Double = {
    if (numero <= 1) {
      println("1")
      return 1
    }else {
      printf("numero:%.0f * factorial(%.0f)\n", numero, numero - 1)
      return numero * factorial(numero - 1)
    }
  }
}
