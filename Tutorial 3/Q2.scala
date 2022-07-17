object findTemp extends App{
    def cenToFan(c:Double):Double = c*1.8000 + 32.00;
    println("Celsius value is: 35C");
    println("Fahrenheit value is: " + cenToFan(40));
}