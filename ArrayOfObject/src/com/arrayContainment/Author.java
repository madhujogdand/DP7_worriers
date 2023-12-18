package com.arrayContainment;

public class Author {
	private int aid;
	private String aname;
	public Author() {
		super();
		
	}
	public Author(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + "]";
	}
	

}
