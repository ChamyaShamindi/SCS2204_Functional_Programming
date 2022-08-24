object sequence extends App{
    def fibonacci(n:Int):Int = n match{
        case n if n==0 => 0
        case n if n==1 => 1
        case _ => fibonacci(n-1) + fibonacci(n-2)
    }

    def fibonacciSequence(n:Int):Unit = {
        if (n>0) fibonacciSequence(n-1)
        println(fibonacci(n))
    }

    fibonacciSequence(10)
}