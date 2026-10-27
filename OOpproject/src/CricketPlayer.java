
public class CricketPlayer {
 String name;
 String team;
 int runs;
 double avg;
 int wicket;
 double economy;
   public void batting() {
	   System.out.println("Player " + name + " in " + team+ " team has scored "+ runs +" runs "+"with an average of " + avg);
   }
     public void bowling() {
    	 System.out.println("Player " + name + " in " +  team+ " team has taken"+ wicket +" wickets"+"with an economy of" + economy);
     }
      public static void main(String[] args) {
		CricketPlayer batter = new CricketPlayer(); // constructor  // object memory set and call constructor
		CricketPlayer bowler = new CricketPlayer(); // jvm automatically create a constructor if it is not defined its called default constructor
		 batter.name="Scahin Tendulkar";
		 batter.team="India";
		 batter.runs=11654;
		 batter.avg = 54.5; // use constructor to avoid these steps
		batter. wicket=54; // constructor initialize objects value
		batter. economy=4.5;
				
		 batter.batting();
		 batter.bowling();
	}
     }


