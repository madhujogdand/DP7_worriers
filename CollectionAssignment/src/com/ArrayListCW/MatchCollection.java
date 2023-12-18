package com.ArrayListCW;

/*19.WAP to match two collections*/
import java.util.ArrayList;

public class MatchCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);
        System.out.println("----------------------------------------");
		ArrayList<Integer> al2 = new ArrayList<>();

		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);

		System.out.println(al2);
		
		if(al.size()==al2.size())
		{
			if(al.equals(al2))
			{
				System.out.println("Two collections are matched");
			}
			else
			{
				System.out.println("Two collections are not matched");
			}
		}
		else
		{
			System.out.println("Size not equal of two collections");
		}
		
		

	}

}
