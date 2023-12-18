package com.labCovarient;

class Person {
	private int id;
	private String name;
	private float bal;

	Person() {

	}

	Person(int id, String name, float bal) {
		this.id = id;
		this.name = name;
		this.bal = bal;

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

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

}

class Paytm {
	static Person display() {
		Person p = new Person();
		p.setId(101);
		p.setName("Madhu");
		p.setBal(50000);
		return p;
	}

}

public class BankDetails {
	public static void main(String[] args) {
		
		Person p = Paytm.display();
		System.out.println("Person id:"+p.getId() +"\nPerson name:"+ p.getName() + "\nBalance:"+p.getBal());
	    System.out.println("balance after shopping:"+(p.getBal()-2000));
	}

}