package stats;

public class stats {

	int kills;
	int deaths;
	int assists;
	
	//new player
	stats(){
		kills = 0;
		deaths = 0;
		assists = 0;
	}
	
	//integration from old system, adding a player that already exists
	stats(int kills, int deaths,int assists) {
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

	int getKills() {
		return kills;
	}
	
	int getDeaths() {
		return deaths;
	}
	
	int getAssists() {
		return assists;
	}
	
	void kill() {
		kills += 1;
	}
	
	void death() {
		deaths +=1;
	}
	
	void assist() {
		assists+=1;
	}
	
	//option to add stats from a game rather than updating througout the game since
	//it is unlikely to check your career stats during a game and this puts less
	//stress on the computer to add kda to multiple different locations throughout
	//the game
	void addGame(game g) {
		this.kills+=g.kills;
		this.deaths+= g.deaths;
		this.assists+= g.assists;
	}
}
