package com.CAArrayList;

import java.util.ArrayList;

public class Q38 {
	public static void main(String[] args) {
		//using default constructor
		
		ArrayList<Double> al=new ArrayList<>();
        al.add(34.5);
        al.add(45.7);
        al.add(23.9);
        al.add(78.3);
        System.out.println(al);
        System.out.println("================================");
      //using  constructor with an initial capacity
        ArrayList<Double> al1=new ArrayList<>(2);
        al1.add(34.5);
        al1.add(45.7);
        al1.add(23.9);
        System.out.println(al1);
        System.out.println("================================");
        ////using existing collection
        ArrayList<Double> al2=new ArrayList<>(al1);
        al2.add(21.5);
        al2.add(67.7);
        al2.add(97.9);
       
        System.out.println(al2);
	}

}
