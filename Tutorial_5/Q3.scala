object add extends App{
  def sum(n:Int):Int = n match{
    case n if(n<=1) => n
    case _ => n + sum(n-1)
  }

  println(sum(5))
}
