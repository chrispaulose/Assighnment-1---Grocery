
 public class Books {
 int price;
  String author;
  String title;
  String language;
  int rating;
      public void open() {
    	  System.out.println( title + " is open");
      }
      public void close() {
    	  System.out.println(title + " is close");
      }
      public void bind() {
    	  System.out.println(title + "  is binded");
      }
       public void rating() {
    	   System.out.println(title+" is wrriten by "+ author + " is in " + language+" language"+ " is a book with rating "+rating);
       }
        public static void main(String[] args) {
			Books b1 = new Books ();
			b1.author="David Gogins";
			b1.title="Cant hurt me";
			b1.language="English";
			b1.rating=4;
			b1.open();
			b1.close();
			b1.bind();
			b1.rating();
		}
}
