package com.operators;
import java.util.Scanner;
public class Speed {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the distance in km:");
		
		int distance=sc.nextInt();
		
        System.out.println("Enter the time in hr:");
		
		float time=sc.nextFloat();
		
        System.out.println("Speed of car is:"+(distance/time)+"km/hr");
		
		sc.close();
		
		
		
		
	}
}
