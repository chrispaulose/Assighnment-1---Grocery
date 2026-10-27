package polymorphism;

public class Developer extends Employee{
int experience;
String role;
String Qualification;
 Developer(int e,String Q,String company,String name,int id){
	super(company,name,id) ;
	this.experience=e;
	this.Qualification=Q;
	
 }
 @Override
  void work() {
	  System.out.println(name + " is working in " + company + "for" + experience + "years" + "as" + role);
  }
	

}
