import scala.io.StdIn.readInt
object findBestProfit extends App{

  def TotalAttendence(TicketPrice: Int): Int={
    if(TicketPrice>15){
      return ((TicketPrice-15)/5)*(-20)
    }else{
      return ((15-TicketPrice)/5)*(20)
    }
  }

  def Income(TicketPrice: Int, attendence: Int): Int= TicketPrice*attendence;

  def Profit(TicketPrice: Int, attendence: Int): Int={
    return Income(TicketPrice, attendence + TotalAttendence(TicketPrice)) -(500 + 3*(attendence + TotalAttendence(TicketPrice)))
  }

    print("Enter tickect price: Rs.")
    var TicketPrice = readInt()
    print("Profit: Rs."+Profit(TicketPrice,120))
}
    

