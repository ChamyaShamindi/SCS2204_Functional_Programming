object ration extends App{
    val r1 = new Rational(1,3)
    val r2 = new Rational(5,7)
    println(r1.neg)
    val z = r1.add(r2)
    println(z)
}

class Rational(x: Int, y: Int){
    require(denom > 0, "Denominator must be greater than 0")
    def numer = x
    def denom = y

    def add(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, this.denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)

    override def toString(): String = numer + "/" + denom
}
