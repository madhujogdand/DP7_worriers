package com.lab;

public class Movie {
	private int id;
	private String mName;
	private float rating;
	
	public Movie()
	{
		super();
		
	}

	public Movie(int id, String mName, float rating) {
		super();
		this.id = id;
		this.mName = mName;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMName() {
		return mName;
	}

	public void setMName(String mName) {
		this.mName = mName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", mName=" + mName + ", rating=" + rating + "]";
	}
	

}
