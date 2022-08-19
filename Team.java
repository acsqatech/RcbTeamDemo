package testng;

import java.util.List;

public class Team {    
    private String name;
    private String location;
    private List<Player> player;
    
    public Team() {
    }

	public Team(String name, String location, List<Player> playersList) {
		super();
		this.name = name;
		this.location = location;
		this.player = playersList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", location=" + location + ", player=" + player + "]";
	}
    
	   
    
}