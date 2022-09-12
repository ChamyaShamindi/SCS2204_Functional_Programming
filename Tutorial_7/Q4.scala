object bank extends App{
    class Account(id: String, n: Int, b: Double){
        val nic:String = id
        val acnumber:Int = n
        var balance:Double = b

        override def toString = "NIC : "+nic+"   Acc. NO : "+acnumber+"   Balance : "+balance

    }
    val acc1= new Account("589462584V",259845625,76500)
    val acc2= new Account("791856328V",259842825,-5000)
    val acc3= new Account("799843528V",251255625,45500)
    val acc4= new Account("984162584V",259846874,-20000)

    var bank:List[Account]=List(acc1,acc2,acc3,acc4)

    val overdraft = bank.filter(x=>x.balance<0)
    val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
    val interest = (b:List[Account])=>b.map((x) => (x.nic,x.acnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))

    println("List of Accounts with negative balances : \n\t" + overdraft)
    println("\nSum of all account balance : Rs: \n\t" + balance)
    println("\nFinal balances of all accounts after apply the interest function : \n\t" + interest(bank))
}