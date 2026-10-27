package polymorphism;
//basic
public class Employee {
String company;
String name;
int id;
  void work(){
	   System.out.println(name + "is an Employee in" + company);
	   
   }
    Employee(String c,String n,int id){
    	this.company=c;
    	this.name=n;
    	this.id=id;
    }
    
}
