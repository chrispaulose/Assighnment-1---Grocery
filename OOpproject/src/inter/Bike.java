package inter;

public class Bike implements Vehicle,Car {
 
	public void dispaly() {
		System.out.println("Bike is child of Vehicle and car");
		
	}
	//public void display() {
		//System.out.println("Bike is the child of Car");
	//}

	 public static void main(String[] args) {
		Bike b1= new Bike();
		b1.dispaly();
		//b1.display();
	}
}
