package irs;
public class Employee {
 String name ;
 int Salary;
  Employee(String name,int Salary){
	  this.name = name;
	  this.Salary = Salary;
	  
  }
     public void dispaly() {
    	 System.out.println(name);
    	 System.out.println(Salary);
     }
}
