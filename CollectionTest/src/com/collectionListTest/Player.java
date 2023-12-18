package com.collectionListTest;

public class Player {

	private int playerId;
	private String name;
	private String country;
	private String team;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String name, String country, String team) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.team = team;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
	
	
	
}
