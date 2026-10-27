package imp;

public class Newemp {


 int employeeid;
 String employeeName;
 int salary;
     public Newemp(int id,String name,int salary){
    	 this.employeeid=id;
    	 this.employeeName=name;
    	 this.salary=salary;
     }
       public void display() {
        	System.out.println(employeeid);
        	System.out.println(employeeName);
        	System.out.println(salary);
        }
      public  void annualsalary() {
          int annualsalary= (int)((salary*12)+calcbonus());
          System.out.println(annualsalary);
        }
        public  float calcbonus() {
        	  float bonus= (float) (salary*0.01);
        	  System.out.println(bonus);
        	 // float totalsalary=salary+bonus;
        	//  System.out.println(totalsalary);*/
        	  return bonus;
          }
         // public static void main(String[] args) {
		   //Empoloyee e1=new Empoloyee(11,"George",10000);
		   //e1.display();
		   //e1.annualsalary();
		   //e1.calcbonus();
		}






