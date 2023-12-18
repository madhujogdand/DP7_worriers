package com.collectionListTest;

public class Dept {
	private int dId;
	private String dName;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}
