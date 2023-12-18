package com.collectionListTest;

public class Emp {
	private int id;
	private String name;
	private Dept d;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Dept d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
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
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", d=" + d + "]";
	}

	
}
