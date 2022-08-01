import scala.io.StdIn.readInt;
object FindInterest{
    def main(args: Array[String]): Unit ={
        print("Enter deposits money: ");
        var deposit_money = readInt();

        var interestOfYear: Double = 0;
        if(deposit_money<=20000){
            interestOfYear = deposit_money*0.02;
        }else if(deposit_money<=200000){
            interestOfYear = deposit_money*0.04;
        }else if(deposit_money<=2000000){
            interestOfYear = deposit_money*0.035;
        }else{
            interestOfYear = deposit_money*0.065;
        }

        println("Interest for year is: " + interestOfYear);
    }
}
    