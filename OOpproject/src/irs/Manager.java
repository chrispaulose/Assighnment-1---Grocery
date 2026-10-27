package irs;

public class Manager extends Employee {
  String department;
	Manager(String department,String name, int Salary) {
		super(name, Salary);
		this.department=department;
	}
   public static void main(String[] args) {
	Manager m1 = new  Manager("IT","Joz",120000);
	m1.dispaly();
	System.out.println(m1.department);
}
}
