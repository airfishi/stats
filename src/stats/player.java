package stats;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class player{
	
	Map<String, stats> playerbase = new HashMap<>();
	
	void addPlayer(String name,stats stats){
		playerbase.put(name, stats);
	}
	
	Set<String> keySet() {
		return playerbase.keySet();
	}
	
	String getKD(String name) {
		stats a = playerbase.get(name);
		return a.getKills() + "/" + a.getDeaths() + "/" + a.getAssists();
	}
	
	stats getStats(String name) {
		return playerbase.get(name);
		
	}
	
	
}
