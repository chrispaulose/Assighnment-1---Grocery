package Encapsulation;

public class ATM {
 private double balance=0;
 public void deposit(double amount) {
	balance=balance+amount;
	System.out.println("Amount" + amount + "is deposited");
 } 
 public void  withdaw(double amount) {
	 if(balance<=amount) {
		 balance= balance-amount;
	 }
 }
}
