//19001355
//Hansana Ranweera

import Q3.Account
object Q4 extends App{
  var bank:List[Account] = List()
  var Print = (a:List[Account])=>(a.map(x => println(x)));  
  val overdraft = (b:List[Account])=>b.filter(x => (x.balance < 0))
  val sum  = (b:List[Account])=> b.reduce((x,y) => new Account(0,x.balance + y.balance)).balance
    val cal =(x:Account)=>if(x.balance < 0) x.balance * 0.1  else x.balance*0.05 
  val interest=(b:List[Account])=>b.map(x => x.deposit(cal(x)))                 
  var AC1 = new Account(100001999,400.5)
  var AC2 = new Account(200002000,23525.45)  
  var AC3 = new Account(300002001,-345.34)
  var AC4 = new Account(400002002,23423)
  bank = List(AC1,AC2,AC3,AC4)
  interest(bank)
  Print(bank)
}