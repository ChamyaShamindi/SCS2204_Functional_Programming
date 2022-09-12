object bank extends App{
    class Account(id: String, n: Int, b: Double){
        val nic:String = id
        val accnumber:Int = n
        var balance:Double = b

        def withdraw(a:Double) = this.balance = this.balance - a

        def deposit(a:Double) = this.balance = this.balance + a

        def transfer(a:Account, b:Double):Unit = {
            this.withdraw(b)
            a.deposit(b)
        }
        override def toString = "NIC:- " + this.nic + "   Acc. NO:- " + this.accnumber + "   Balance:- " + this.balance
    }

    val account1 = new Account("589462584V", 259845625, 8000)
    val account2 = new Account("791856328V", 259854625, 5000)

    println("Account balance before transfer money: ")
    println(account1)
    println(account2)

    account1.transfer(account2, 1500)
    println("\nAccount balance after transfer money: ")
    println(account1)
    print(account2)
}