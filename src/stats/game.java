package stats;

public class game {

	int kills = 0;
	int deaths = 0;
	int assists = 0;
	
	game(int kills, int deaths, int assists) {
		if(deaths < 0) {
			throw new IndexOutOfBoundsException("Cannot die negative times");
		}
		if(assists < 0) {
			throw new IndexOutOfBoundsException("Cannot unassist people");
		}
		
		
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
	}
	
	
	/*
	 * more code created by people who track the stats in a current game;
	 * probably changes the implementation to record all players stats 
	 * individually and then can add each players new info respectively 
	 * post game
	 */
	
	
}
