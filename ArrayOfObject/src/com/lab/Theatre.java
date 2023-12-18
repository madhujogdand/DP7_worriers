package com.lab;

public class Theatre {

	private int id;
	private String name;
	private String location;
	private Movie m;

	public Theatre() {
		super();

	}

	public Theatre(int id, String name, String location, Movie m) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.m = m;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Movie getM() {
		return m;
	}

	public void setM(Movie m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", location=" + location + ", m=" + m + "]";
	}

	public static void main(String[] args) {
		
		Movie m[]=new Movie[2];
		m[0]=new Movie(1,"RRR",9.2f);
		m[1]=new Movie(2,"Pathan",7.2f);
		
		Theatre t[]=new Theatre[2];
		t[0]=new Theatre(101,"PVR","Pune",m[0]);
		t[1]=new Theatre(102,"Esquare","Pune",m[1]);
		
		for(Theatre th:t)
		{
			System.out.println(th);
		}

	}

}
