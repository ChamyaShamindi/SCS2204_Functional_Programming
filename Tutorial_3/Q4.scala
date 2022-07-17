object bookPrice extends App{
    def totCost(copies: Int):Double = copies*24.95;
    def discount(copies: Int):Double = 24.95 * 0.4;
    def shippingCost(copies: Int):Double = (copies*3) + ((copies-50) * 0.75);
    
    println("Final total Cost: "+ (totCost(60)-discount(60)+shippingCost(60)));
}
