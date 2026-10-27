package polymorphism;
public class Notification {
 int time;
 int day;
 String month;
 int year;
	Notification(int t, int d, String m, int y){
		this.time=t;
		this.day=d;
		this.month=m;
		this.year=y;
	}
	void sendNotification() {
		System.out.println("Notification Placed");
	}
}
