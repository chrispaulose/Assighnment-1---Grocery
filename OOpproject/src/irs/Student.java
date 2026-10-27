package irs;

public class Student extends Person {
  int rollno;
  String name;
  Student(int rollno,String name, String School,int age){
	  super(School,age);
	  this.rollno=rollno;
	  this.name=name;
  }
	  public static void main(String[] args) {
		Student s1= new Student(11,"Chris Paulose","MDSHSS",19);
		System.out.println(s1.School);
		System.out.println(s1.name);
		
	}
  
}
