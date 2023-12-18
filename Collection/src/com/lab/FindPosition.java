package com.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPosition {

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
		
		int position=al.indexOf(name);
		if(position!=-1)
		System.out.println(name+" is at"+" Position "+position);
		else
		{
			System.out.println(name+" is not found in the list");
		}

	}

}
