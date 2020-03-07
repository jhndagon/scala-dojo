object Factorial {
    def main(args: Array[String]): Unit = {
        var x = factorial(5);
        println(x);
    }

    def factorial(x: Int): Int = {
        if(x<=1){
            return 1;
        }
        return x * factorial(x-1);
    }
}