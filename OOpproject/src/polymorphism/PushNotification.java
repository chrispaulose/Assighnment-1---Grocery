package polymorphism;
public class PushNotification extends Notification {
 PushNotification(int time,int day,String month,int year){
	 super( time, day,  month,  year);
 }
 public static void main(String[] args) {
	EmailNotification e1= new EmailNotification("chrispaulosecp7@gamil.com"," ancv@gmail.com"," hlo friend ", 12 ,22,"March",2026);
	e1.sendNotification();
	
}
}
