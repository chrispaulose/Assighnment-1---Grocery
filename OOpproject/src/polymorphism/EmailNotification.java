package polymorphism;
public class EmailNotification extends Notification {
 String sendid;
 String recevieid;
 String content;
  EmailNotification(String s,String r, String c,int time, int day, String month , int year){
	  super(time,day,month,year);
	  this.sendid=s;
	  this.recevieid=r;
	  this.content=c;	  
  }
   void sendNotification() {
	   System.out.println( "From " + sendid + "To " + recevieid  + "Subject   "+ content +   time + day + month + year );
   }
}
