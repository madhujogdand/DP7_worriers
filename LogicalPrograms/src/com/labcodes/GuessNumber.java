package com.labcodes;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=34;
		int count=0;
		while(num!=0)
	    {
		   System.out.println("Guess the number");
			int num1=sc.nextInt();
		     count++;
		     
		   if(num>num1)
		    {
			System.out.println("You have entered higher number... please enter lower number");
		    }
		   else if(num<num1)
		    {
			System.out.println("You have entered lower number... please enter higher number");
		    }
		   else if(num==num1)
		    {
			System.out.println("Congratulation...!!! you have guessed correct number");
			System.out.println("Number of attempts: "+count);
			break;
		    }
		 
	    }
		sc.close();
	}

}
