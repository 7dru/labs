package lab4;

public class Team {
private String teamName;
private String sport;
private int numOfPlayers;
private player[] players;

public Team(String teamName, String sport, int numOfPlayers) {
	super();
	this.teamName = teamName;
	this.sport = sport;
	this.numOfPlayers = 0;
	this.players = new player[25];
}
public void signPlayer(player p) {
	if(numOfPlayers < players.length) {
		players[numOfPlayers] = p;
		numOfPlayers++;
	}
	
}
public String findPlayersByNumber(int num) {
	for(int i = 0; i < numOfPlayers; i++) {
		if(players[i].getJerseyNumber() == num) {
			return players[i].getName();
		}
}
	 return "player not found"; 	
}
}