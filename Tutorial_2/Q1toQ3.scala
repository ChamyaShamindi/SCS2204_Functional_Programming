object main extends App{

//Q1 / Q2
    var k1 = 2;
    var i = 2;
    var j = 2;

    var m = 5;
    var n = 5;

    var f = 12.0f;

    var g = 4.0f;

    var c1 = 'X';
    
    println(k1 + 12 * m);
    println(m / j);
    println(n % j);
    println(m / j * j);
    println(f + 10 * 5 + g);
    // println(++i *n);     //increment operator is not available in scala



//Q3
    var a : Int = 2;
    var b : Int = 3;
    var c2 : Int = 4;
    var d : Int = 5;

    var k2 : Float = 4.3f;

    //println(--b*a+c*d--);   //decrement operator is not available in scala
    println((b-1)*a+c2*d);

    // println(a++)     //increment operator is not available in scala
    println(a);
    a=a+1;

    println(-2*(g-k2)+c2);

    // println(c=c++)     //increment operator is not available in scala
    println(c2);

    //println(c=++c*a++);   //increment operator is not available in scala
    println((c2+1)*a)
}