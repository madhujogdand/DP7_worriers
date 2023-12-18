package com.Comparable;

public class Profile {
	private String state;
	private String country;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Profile [state=" + state + ", country=" + country + "]";
	}

}
