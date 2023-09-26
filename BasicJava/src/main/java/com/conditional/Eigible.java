package com.conditional;
import java.util.Scanner;
public class Eigible {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter total percentage");
	float per=sc.nextFloat();
	System.out.println("Enter percentage of pcm:");
	float pcm=sc.nextFloat();
	
	
	if((per>=90) || (pcm>=85))
	{
		System.out.println("Eligible");
	
	}
	else
	{
		System.out.println("Not eligible");
	}
	
sc.close();	
}
	
	
	
}
