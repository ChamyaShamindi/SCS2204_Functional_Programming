object findTime extends App{
    def easyPase(a: Int): Int = a*8;
    def tempo(b: Int):Int = b*7;

    println("Total running time: " + (easyPase(2)+tempo(3)+easyPase(2)) + " min");
}
