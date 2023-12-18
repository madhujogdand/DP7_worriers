package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VotingException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		try
		{
			System.out.println("Enter age:");
			age = sc.nextInt();
			if (age > 18)
			{
				System.out.println("You can vote");
			}
			else
			{
				System.out.println("You cannot vote");
			}
			
		} 
		catch (InputMismatchException e) {
			System.out.println(e + "- Age entered was not in number");
		}
		finally
		{
			sc.close();
			System.out.println("Thanks for voting.........");
		}

	}

}
