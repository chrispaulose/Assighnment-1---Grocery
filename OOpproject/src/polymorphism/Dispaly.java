package polymorphism;
public class Dispaly extends Employee{
  Dispaly(String company,String name,int id){
	  super(company, name, id);
  }
	public static void main(String[] args) {
		//Employee e1= new Employee("Quest","Chris",112);
		 Developer d1=new Developer(25,"Btech","Quest","Chris",112);
		 Tester t1= new Tester(15,"Btech","Quest","Joz",113);
		 Manager m1 = new Manager(15,"MBA","Quest","Tobin",114);
		 d1.role="Developer";
		 
		 d1.work();
		// e1.work();
		 t1.role ="Tester";
		 t1.work();
		 m1.role="Manager";
		 m1.work();
		 
		
	}
}

