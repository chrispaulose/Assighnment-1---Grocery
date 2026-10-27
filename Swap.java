import java.util.Scanner;
class Swap{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
   int a=sc.nextInt();
System.out.println("Here value of a is"+a);
   
int b=sc.nextInt();
System.out.println("Here value of b is" +b);
 int swap=0;
 swap=a;
a=b;
b=swap;
 System.out.println("After Swapping");
  System.out.println( "value of a is" + a);
 System.out.println("value of b is"  +b);
}
}