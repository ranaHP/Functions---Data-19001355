//19001355
//Hansana Ranweera

object Q3 extends App {
  
 class Account(Account:Int,Amount:Double){
    val ac_no = Account;
    var balance = Amount;   
    def withdraw(a:Double) = (this.balance = this.balance-a)
    def deposit(a:Double) = (this.balance = this.balance+a)
    def transfer(a:Account,b:Double) = {this.withdraw(b) 
        a.deposit(b)}
    override def toString = "["+ ac_no + " - "  + balance + "]"
 }
 
}
