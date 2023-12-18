package com.serializable;

import java.io.Serializable;

public class student implements Serializable {
   
	private int id;
	private String name;
	private int marks;
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
