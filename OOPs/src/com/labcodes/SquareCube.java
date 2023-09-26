package com.labcodes;
import java.util.Scanner;
public class SquareCube {
   public int square(int num)
    {
    	return num*num;
    }
   public int cube(int num)
   {
	  return num*square(num);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SquareCube s=new SquareCube();
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		
		System.out.println("Square: "+s.square(num));
		System.out.println("Cube: "+s.cube(num));
	}

}
