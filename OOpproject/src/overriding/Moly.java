package overriding;

public class Moly extends Poly {
	int id;
	String role;
 Moly(int a, String b,int id,String role) {
		super(a, b);
		this.role=role;
		this.id=id; //setter getter  
	}

 
   public void work() {
	   System.out.println(name+" is working as "+role);
	   System.out.println(age);
	   System.out.println(id);
   }
  public static void main(String[] args) {
	Poly py= new Poly(15,"Chris");
	py.work();
	Moly my=new Moly(15, "Chris",111,"Developer");  //method over riding
	my.work();
}
}
