def even(num: Int) : Boolean = {
    if (num == 0) {
        return true;
    } else if (num == 1) {
        return false;
    } else {
        return even(num - 2);
    }
}

def evenAddtion(n: Int, firstTime: String = "yes") : Int =  {
    if(n == 0) {
        return 0;
    } else if (even(n) && firstTime == "yes") {     // even number with last number
        return evenAddtion(n - 1, "no");
    } else if (even(n) && firstTime != "yes") {     // for even numbers without the last number
        return n + evenAddtion(n - 1, "no"); }
     else {
        return evenAddtion(n - 1, "no");            // for odd numbers
    }
}


object main extends App{
    println(evenAddtion(10))
    println(evenAddtion(6))

}