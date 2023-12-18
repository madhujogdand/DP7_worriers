package com.ArrayListPractice;
/*Q2. Create 2 arraylist of String containing names .

 *  Then find the names common in both the arraylist*/
import java.util.ArrayList;

public class commonNames1 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();

		al1.add("Neel");
		al1.add("Priya");
		al1.add("Radha");
		al1.add("Neha");
		System.out.println("ArrayList 1:" + al1);

		System.out.println("========================================");
		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Neel");
		al2.add("Aashu");
		al2.add("Riyansh");
		al2.add("Neha");
		System.out.println("ArrayList 2:" + al2);
		
		for(int i=0;i<al1.size();i++)
		{
			for(int j=0;j<al2.size();j++)
			{
			   if(al1.get(i).equals(al2.get(j)))
		
			   System.out.println(al1.get(i));
			   
			}
			
		}
		   
	}

}
