package com.Hashset;

public class Student {
	private int id;
	private String name;
	private int marks;
	private int feespaid;
	private Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int marks,int feespaid, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.feespaid=feespaid;
		this.course = course;
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

	public int getFeespaid() {
		return feespaid;
	}

	public void setFeespaid(int feespaid) {
		this.feespaid = feespaid;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", feespaid=" + feespaid + ", course="
				+ course + "]";
	}

	

}
