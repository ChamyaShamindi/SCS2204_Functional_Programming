object oddeven extends App{
  def IsEven(n:Int):Boolean = n match{
    case 0 => true          //for 0
    case _ => IsOdd(n-1)    //if n is even then n-1 is odd
  }

  def IsOdd(n:Int):Boolean = !(IsEven(n))   //if n is not even, it is odd

  println(IsEven(4))
} 
