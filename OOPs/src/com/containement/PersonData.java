package com.containement;

public class PersonData {

	public static void main(String[] args) {
		Address a=new Address("Nanded","Maharashta","India");
		Address a1=new Address("Pune","Maharashta","India");
		Address a2=new Address("Mumbai","Maharashta","India");
		
		Person p1=new Person("Radha","female",29,a1);
		Person p2=new Person("Neha","female",30,a1);
		Person p3=new Person("Parth","male",20,a2);
		Person p4=new Person("Madhur","male",21,a);
		
		System.out.println(p1);
		System.out.println("---------------------");
		
		System.out.println(p2);
		System.out.println("---------------------");

		System.out.println(p3);
		System.out.println("---------------------");

		System.out.println(p4);
		System.out.println("---------------------");


	}

}
