package lab4;

public class player {
private int playerID;
private String name;
private int jerseyNumber;
private String position;
public player(int playerID, String name, int jerseyNumber, String position) {
	super();
	this.playerID = playerID;
	this.name = name;
	this.jerseyNumber = jerseyNumber;
	this.position = position;
}
public String getName() {
	return name;
}
public int getJerseyNumber() {
	return jerseyNumber;
}
public String toString() {
	return "player [playerID=" + playerID + ", name=" + name + ", jerseyNumber=" + jerseyNumber + ", position="
			+ position + "]";
}

}


