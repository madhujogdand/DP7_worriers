package com.ifelse;
import java.util.Scanner;
public class VowelOrConso {
   public static void main (String args[]) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println(" Enter the Alphabet");
		
		char alphabet=sc.next().charAt(0);
		
		if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u')
		{
			System.out.println(alphabet+" is a Vowel.");
			
		}
		else
		{
			System.out.println(alphabet+" is a Consonant.");
			
		}
		
		sc.close();
	}
	

}
