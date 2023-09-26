package com.labAssignment;

class Player
{
	private int playerId;
	private String playerName;
	private Country c;

	Player() {

	}

	Player(int playerId, String playerName, Country c) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.c = c;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}
	public String toString() {
		return "Player Id:" + playerId + "\nPlayerName:" + playerName + "\nPlayer country:" + c;
	}
}
public class PlayerDetails
{
	public static void main(String[] args) {
		Player p1=new Player();
		p1.setPlayerId(20);
		p1.setPlayerName("Sachin");
		p1.setC(new Country());
		p1.getC().setcId(101);
		p1.getC().setcName("India");
		
		System.out.println(p1);
		
		
		
	}


}