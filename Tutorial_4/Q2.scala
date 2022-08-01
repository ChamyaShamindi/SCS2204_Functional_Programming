import scala.io.StdIn.readInt;
object patternMAtching{
    def main(args: Array[String]): Unit ={

        print("Enter number: ");
        var number = readInt();

        if(number == 0){
            println("Zero");
        }else if(number < 0){
            println("Negative");
        }else if(number > 0 && (number%2 == 0)){
            println("Even");
        }else{
            println("Odd");
        }
    }
}