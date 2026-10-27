import java.util.Scanner;
class Cube{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int a=sc.nextInt();
 int cube=a*a*a;
System.out.println("Cube of " + a + "is" + (cube));
}
}