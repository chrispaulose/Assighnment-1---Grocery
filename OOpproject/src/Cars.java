import java.util.Scanner;
public  class Cars{
 String name;
 int price;
 String colour;
    public static void move() {
    	System.out.println("car is moving");
    }
      static void start() {
    	System.out.println("car is starting");
    }
    public static void stop() {
    	System.out.println("car is stopping");
    }

 
     public static void main(String[] args) {
    	 Scanner sc =new Scanner(System.in);
    	 Cars maruthi = new Cars();
		maruthi.name="Maruthi";
		maruthi.price = 1000;
		maruthi.colour= "blue";
		 System.out.println(maruthi.name);
		 System.out.println(maruthi.price);
		 System.out.println(maruthi.colour);
		 maruthi.move();
		maruthi. start();
		maruthi.start();
	}
}
