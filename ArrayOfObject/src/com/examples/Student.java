package com.examples;

//POJO- plain old java object
public class Student {

	private int sid;
	private String name;
	private float marks;

	Student()
	{

	}

	Student(int sid, String name, float marks)
	{
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}

}
