package Taller1
import io.StdIn._

object NumerosPrimos {

  def main(args: Array[String]): Unit = {
    var i = 2
    var numero = 0
    val boolean = true

    println("Ingrese un número")
    numero = readInt()

    while (numero > i && boolean) {
      if (numero % i == 0) {
        boolean == false
      }
      i = i + 1
    }
      if(boolean){
        println("El número es primo")
      }else{
        println("El número no es primo")
      }
    }

  }


