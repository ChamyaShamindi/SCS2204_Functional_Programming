object volume extends App{
    def volSphere(r:Int):Double = (4/3)*math.Pi*r*r*r;
    println("Volume of sphere: " + volSphere(5));
}