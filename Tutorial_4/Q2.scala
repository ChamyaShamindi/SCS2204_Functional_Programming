import scala.io.StdIn.readInt;
object patternMAtching extends App{
    print("Enter number: ");
    var number = readInt();
    println(pattern(number.toInt));
}

def pattern(number:Int):String = number match{
    case number if number==0 => "Zero";
    case number if number<0 => "Negative";
    case number if (number>0 && (number%2 == 0)) => "Even";
    case _ => "Odd";
}