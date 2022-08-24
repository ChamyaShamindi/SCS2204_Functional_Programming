object prime extends App{
  def GCD(a:Int, b:Int):Int = b match{
    case 0 => a                     //if b is 0 then return a
    case x if (x>a) => GCD(x,a)
    case x => GCD(x, a%x)
  }

  def prime(p:Int, i:Int=2):Boolean= i match{
    case x if(x==p) => true
    case x if GCD(p,x) >1 => false
    case x => prime(p,i+1)         //for all other cases
  }

  def printSeq(m:Int, n:Int):Any={
    if (prime(m)) println(m)
    if(m<n) printSeq(m+1,n)
  }
  printSeq(2,10)
}
