package com.ArrayListAdditionl;
/*2.Create ArrayList of integers. Add first 50 odd numbers to arraylist.*/
import java.util.ArrayList;

public class AddOddNumber {

	public static void main(String[] args) {
	
		ArrayList <Integer>al=new ArrayList<>();
		
		for(int i=0;i<=50;i++)
		{
			if(i%2!=0)
			     al.add(i);
		}
		System.out.println("Odd numbers:"+al);

	}

}
