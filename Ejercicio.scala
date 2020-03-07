object Ejercicio {
    def main(args: Array[String]): Unit = {
        val numeros = List(4, 8, 15, 16, 23, 42);
        val datos = numeros.map((valor:Int) => valor*2)
        println(datos)
    }
}