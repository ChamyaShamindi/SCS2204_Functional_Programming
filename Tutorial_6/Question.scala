import scala.compiletime.ops.string
object  Caesar_Cipher extends App{

    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encryption = (shift:Int,c:Char)=>alphabet((alphabet.indexOf(c.toUpper)+shift)% alphabet.size)

    val decryption =(shift:Int,c:Char)=> {
        if((alphabet.indexOf(c.toUpper)-shift)<0) alphabet((alphabet.indexOf(c.toUpper)-shift+alphabet.size)% alphabet.size)
        else alphabet((alphabet.indexOf(c.toUpper)-shift)% alphabet.size)
    }

    val Cipher = (func:(Int,Char)=>Char,s:String,shift:Int)=> s.map(func(shift,_))

    val str=scala.io.StdIn.readLine()
    println(str)

    println("Enter 1-to encrypt message");
    println("Enter 2-to decrypt message");
    val a=scala.io.StdIn.readInt()
    if(a==1){
        val string = str.replace(" ", "")
        println("String: "+string)
        val em = Cipher(encryption, string, 3)
        println("Encrypt message :"+em)
    }
    else{
        val string = str.replace(" ", "")
        println("String: "+string)
        val dm = Cipher(decryption, string,3)
        println("Decrypt message :"+dm)

    }
    
    

}