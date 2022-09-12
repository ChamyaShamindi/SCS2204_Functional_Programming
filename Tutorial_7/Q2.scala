object ration extends App{
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    
    val n = x-y-z
    println(n)
}

class Rational(x: Int, y: Int){
    require(denom > 0, "Denominator must be greater than 0")
    def numer = x
    def denom = y

    def neg = new Rational(-this.numer, this.denom)
    def add(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, this.denom*r.denom)
    def -(r: Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}
