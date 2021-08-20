//19001355
//Hansana Ranweera

object Q1 extends App{
  class Rational(number1:Int,nnumber2:Int){
    def numer = number1;
    def dino = number2;
    def neg = new Rational(- this.numer,this.dino);
    override def toString = "[" + this.numer + "/" + this.dino + "]";
  }
  
  val x = new Rational(2,4);
  val y = x.neg;
  print(y);
}