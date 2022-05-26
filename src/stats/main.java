package stats;

public class main {

	public static void main(String[] args) {
		
		player playerbase = new player();
		
		game g1 = new game(12,4,2);
		
		try {
			game g2 = new game(0,-1,0);
		}catch(Exception e){
			System.out.println("Good; Game doesn't accept negative deaths");
		}
		
		try {
			game g3 = new game(0,0,-1);
		}catch(Exception e){
			System.out.println("Good; Game doesn't accept negative assists");
		}
		
		stats oldPlayerStats = new stats(1,2,3);
		playerbase.addPlayer("Obi-Wan", oldPlayerStats);
		
		stats newPlayerStats = new stats();
		playerbase.addPlayer("Josh Lee Quai", newPlayerStats);
		
		playerbase.getStats("Josh Lee Quai").addGame(g1);
		
		/*
		 * I would do this in junit I just ran out of time and need to work on the second
		 * design problem. I would also do more checks, but again, time shortage
		 * (for reference my physics prof assigned a long hw assignment due 2 days later
		 * on the last day of class)
		 */
		
		//confirm KD is equals to the 3 pieces it should be
		System.out.println(playerbase.getKD("Obi-Wan")
				.equals(oldPlayerStats.kills + "/" + oldPlayerStats.deaths + 
						"/" + oldPlayerStats.assists));
		
		//add 1 kill, 1 death, 1 assist
		playerbase.getStats("Obi-Wan").kill();
		System.out.println(playerbase.getKD("Obi-Wan").equals("2/2/3"));
		playerbase.getStats("Obi-Wan").death();
		System.out.println(playerbase.getKD("Obi-Wan").equals("2/3/3"));
		playerbase.getStats("Obi-Wan").assist();
		System.out.println(playerbase.getKD("Obi-Wan").equals("2/3/4"));
		
		//confirm addGame functionality works
		playerbase.getStats("Obi-Wan").addGame(g1);
		System.out.println(playerbase.getKD("Obi-Wan").equals("14/7/6"));
		
		//check playerbase holds everyone
		for(String s : playerbase.keySet()) {
			System.out.printf("%s has a KD of %s\n",s, playerbase.getKD(s));
		}
	}

}
