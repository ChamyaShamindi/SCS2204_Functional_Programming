object prime extends App{
  def GCD(a:Int, b:Int):Int = b match{
    case 0 => a                 //if b is 0 then return a
    case b if (b>a) => GCD(b,a)
    case b => GCD(b, a%b)
  }

  def prime(p:Int, i:Int=2):Boolean= i match{
    case x if(x==p) => true
    case x if GCD(p,x) >1 => false
    case x => prime(p,i+1)     //for all other cases
  }
  println(prime(8))
}