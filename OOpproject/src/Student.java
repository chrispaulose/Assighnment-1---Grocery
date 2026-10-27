
public class Student{
	int id;
 String name;
 String course;
   Student(int id, String name,String course){
	   this.id=id;
	   this.name= name;
	   this.course=course;
   }
     void display() {
    	 System.out.println("Student id is"+id);
    	 System.out.println("Student name is "+name);
    	 System.out.println("Course taken is "+course);
     }
     public static void main(String[] args) {
    	 Student s1= new Student(11,"Joz","BTech");
		s1.display();
	}
}
