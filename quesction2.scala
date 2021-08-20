//19001355
//Hansana Ranweera

  class Rational(number1:Int,number2:Int){
    def numer = number1;
    def dino = number2;
    def +(r:Rational) = new Rational(this.dino*r.numer + this.numer*r.dino,this.dino*r.dino);
    def neg = new Rational(- this.numer,this.dino);
    def -(r:Rational) = this + r.neg ;
    override def toString = "[" + this.numer + "/" + this.dino + "]";
  }
  
  val x= new Rational(3,4);
  val y = new Rational(5,8);
  val z = new Rational(2,7);
  val result = x-y-z;
  println(result);
}