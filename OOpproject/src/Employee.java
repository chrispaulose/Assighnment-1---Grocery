
 class Employee {
  int employeeid;
 String employeeName;
  int Salary;
     Employee(int e,String id,int Pay){
    	 this.employeeid=e;
    	 this.employeeName=id;
    	 this.Salary=Pay;
     }
       void display() {
    	   System.out.println(employeeid);
    	   System.out.println(employeeName);
    	   System.out.println(Salary);
       }public static void main(String[] args) {
		Employee ey=new Employee(101,"Jacob",120000);
		ey.display();
	}
       
}
