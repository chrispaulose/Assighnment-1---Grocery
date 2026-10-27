package Abstraction;

abstract class Atm {

  void work(int pin) {
	  System.out.println("Pin is" + pin);
	  
  }
  abstract void engine();
 
}
