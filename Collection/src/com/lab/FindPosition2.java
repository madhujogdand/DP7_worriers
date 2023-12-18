package com.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPosition2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Shradha");
		al.add("Radha");
		al.add("Neha");
		al.add("Priti");
		
		System.out.println(al);
		
		System.out.println("Enter name:");
		String name=sc.nextLine();
		
		for(int i=0;i<al.size();i++)
		{
			if(name.equals(al.get(i)))
			{
				System.out.println(i);
			}
		}

	}

}
