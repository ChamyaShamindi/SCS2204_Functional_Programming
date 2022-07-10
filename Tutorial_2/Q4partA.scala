object salary{
  def main(args: Array[String])={
    println("Total week salary is: Rs."+salary(40,30));
  }

  def salary(N:Int, OT:Int):Double={
    var NWhour=250
    var OThour=85
    var TotalSalary=0
    TotalSalary=((N*NWhour)+(OT*OThour))*88/100
    return TotalSalary
  }
}
