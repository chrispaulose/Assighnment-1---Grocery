class Movie{
	String director;
	String actor;
	String genere;
  String title;
  static boolean j;
  //static String language;
     Movie(String d,String a,String g,String t){
    	 this.director=d;
    	 this.actor=a;
    	 this.genere=g;
    	 this.title=t;
     }
   public  void release() {
	   System.out.println(title+" released");
   }
    public  void  play() {
    System.out.println(title+" is palying");
}
    public void review() {  // titile is here so no need of static
    	System.out.println(title+" directed by "+director+" acted by "+actor+" is a decent "+genere+" movie");
    }
   //  public static void lingustic() {
    	// System.out.println(language);
     
      public static void main(String args[]) {
    	  //int k=0;
    	//  language=" movie is in MALAYALAM language";
    	  Movie m1 = new Movie( "Christopher Nolan","Tom Holland","SciFi","Odessy");
    	  Movie m2= new Movie("Priyadarshan","Dileep","Comedy","Vettam");
    	  System.out.println(j); // default value
    	/*  m1.director="Padamarajan";
    	 
    	  		m1.actor = "Momooty and Shobana";
    	  m1.genere="Comedy";
    	  m1.title="Megha Sandesham";
    	   m1.play();// for m1
    	   m1.release();// for m1
    	   m1.review(); //for movie m1
    	    lingustic(); // for entire class
    	     Movie m2= new Movie();
    	     m2.director="Prashanth Neel";
    	     m2.actor="Yash";
    	     m2.genere="Action";
    	     m2.title="KGF";
    	     m2.play();// for m1
      	   m2.release();// for m1
      	   m2.review(); //for movie m1
      	    lingustic(); // for entire class*/
    	  
    	   m1.review();
    	   m2.review();
    	   m1.release();
    	   m1.play();// for m1
    	   m1.release();// for m1
    	   m1.review(); //for movie m1
    	   m2.play();// for m1
    	   m2.release();// for m1
    	   m2.review(); //for movie m1
      }
}