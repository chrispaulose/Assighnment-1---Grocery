package polymorphism;
public class SMSNotification extends Notification{
 int num1;
 int num2;
 String content;
 SMSNotification(int num1,int num2,String content,int time, int day, String month , int year){
	  super(time,day,month,year);
	  this.num1=num1;
	  this.num2=num2;
	  this. content=content;
	  
 }
 void sendNotification() {
	   System.out.println( "From" + num1 + "To" + num2  + "Subject"+ content + time + day + month + year );
 }
}
