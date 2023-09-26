package com.operators;
import java.util.Scanner;

public class VolumeOfCylender {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
		
		System.out.println("Enter the height:");
        double height= sc.nextDouble();
		

		double volume= Math.PI * radius * radius*height;

		System.out.println("Volume of Cyclender:" +volume );
		
		sc.close();
}
}