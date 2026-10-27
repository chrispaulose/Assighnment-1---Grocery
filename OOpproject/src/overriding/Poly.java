package overriding;

 public class Poly {
 int age;
 String name;
 protected void work(){
	 System.out.println(name+" is a worker in nabard") ;
	 System.out.println(" He has 25 years of exp");
	 
  }
   Poly(int a,String b){
	   this .age=a;
	   this.name=b;
   }
}
