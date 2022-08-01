import scala.io.StdIn.readInt;
object FindInterest extends App{
    print("Enter deposits money: ");
    var deposit_money = readInt();
    println(Interest(deposit_money.toInt))
}

def Interest(money: Int):Double = money match{
    case money if money<=20000 => money*0.02;
    case money if money<=200000 => money*0.04;
    case money if money<=2000000 => money*0.035;
    case _ => money*0.065;
}
    