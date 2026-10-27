package irs;

public class Car extends VehicleInheritence{
	int speed;
	int mileage;
	int weight;
	Car(int s, int m, int p,String Colour,String name,double price){
		super(Colour,name,price);
		this.speed=s;
		this.mileage=m;
		this.weight=p;
	}
	public static void main(String[] args) {
	/*int speed=45;
	 int mileage=34;
	 int weight=44;
	 Car c1=new Car();
	 c1.Colour="Blue";
	 c1.name="Car";
	 c1.price=1200000;
	 System.out.println(speed);
	 System.out.println(mileage);
	 System.out.println(weight);
	 System.out.println("Vehicle's colour is "+c1.Colour);
	 System.out.println("Vehicle  is a "+c1.name);
	 System.out.println("vechicle's price is " + c1.price);*/
		Car c1=new Car(25,44,53,"Blue","Car",123344.98);
		System.out.println(c1.speed);
		System.out.println(c1.mileage);
		System.out.println(c1.Colour);
		System.out.println(c1.weight);
		System.out.println(c1.price);
		 
		
	 
	}
}

