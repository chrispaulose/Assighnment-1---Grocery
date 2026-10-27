
public class BankAccount {
 String accountholder;
 int accountnumber;
 int balance;
 
   BankAccount(String name,int ac,int amo){
	  this.accountholder=name;
	   this.accountnumber=ac;
	   this.balance=amo;
   }
    public void withdraw(int cash) {
    	if(balance>cash) {
    	balance=balance-cash;
   System.out.println(cash+" is withdrawn from "+accountnumber+ " available balance " + balance);
}
    	else {
    		System.out.println("In sufficiant Balance");
    	}
    }
      public void deposit(int rupee) {
    	  balance=rupee+balance;
    	  System.out.println(rupee+" is deposited to "+accountnumber + " available balance " + balance);
      }
        public void display() {
        	System.out.println(accountholder);
        	System.out.println(balance);
        	System.out.println(accountnumber);
  

        }
      public static void main(String args[]) {
    	  System.out.println("Account History");

    	  BankAccount b2= new BankAccount("Bhramadathan",31212122,443000);

     	/* b1. accountholder="Bhramadathan";
     	 b1. balance=3000000;
     	 b1. amount=3500;
     	 b1.accountnumber=312654344;*/
     	   //b2.withdraw(200);
     	  // b2.deposit(100);
    	   b2.display();
    	   b2.deposit(10000);
    	  // System.out.println(b2.balance);
    	   b2.withdraw(10000);
    	  // System.out.println(b2.balance);
    	   
    	   b2.withdraw(500000000);
      }
}
