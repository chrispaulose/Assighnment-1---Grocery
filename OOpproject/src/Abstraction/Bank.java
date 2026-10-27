package Abstraction;

public class Bank  extends Atm{
@Override

 void engine() {
	System.out.println("Error detected");
}
	public static void main(String[] args) {
		//Bank b1=new Bank();
		//b1.engine();
	Atm a1 = new Bank();   //upcasting
a1.engine();
a1.work(111);
	}
}
  // interface 2 usage data 