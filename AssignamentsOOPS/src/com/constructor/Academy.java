package com.constructor;

public class Academy {
	private String aNAme;
	private int noOfStudents;
	private String location;
	 Academy()
	 {
		 
	 }

	Academy(String aNAme, int noOfStudents, String location)
	{
		
		this.aNAme = aNAme;
		this.noOfStudents = noOfStudents;
		this.location = location;
	}

	public String getaNAme() {
		return aNAme;
	}

	public void setaNAme(String aNAme) {
		this.aNAme = aNAme;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "Academy Details:\nAcademy Name:" + aNAme + "\nNo Of Students:" + noOfStudents + "\nlocation:" + location;
	}
    public static void main(String[] args) {
		Academy a=new Academy("TQ",100,"Nal Stop");
	    System.out.println(a);
    }
}
