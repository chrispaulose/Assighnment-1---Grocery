package irs;

public class Bike extends VehicleInheritence {
	int speed;
	int mileage;
	int weight;
	Bike(int s, int m, int p,String Colour,String name,double price){
		super(Colour,name,price);
		this.speed=s;
		this.mileage=m;
		this.weight=p;
	}
	public static void main(String[] args) {
		
	
	Bike b1=new Bike(25,44,53,"Blue","Car",123344.98);
	System.out.println(b1.speed);
	System.out.println(b1.mileage);
	System.out.println(b1.Colour);
	System.out.println(b1.weight);
	System.out.println(b1.price);
}
}