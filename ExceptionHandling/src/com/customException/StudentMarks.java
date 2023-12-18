package com.customException;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id:");
		int id = sc.nextInt();

		System.out.println("Enter student name:");
		String name = sc.next();

		try
		{
			int marks = 0;
			int total =0;
			double per;
			for (int i = 0; i < 5; i++)
			{
				System.out.println("Enter student marks:");
				marks = sc.nextInt();
				total+= marks;

				if (marks < 0)
				{
					throw new InvalidMarksEXception("Negative marks entered");
				}
			}
			System.out.println("Total:" + total);
			per = (total/500)*100;
			System.out.println("Average of 5 sub:" + per+"%");
		}
		catch (InvalidMarksEXception e) {
			System.out.println(e);
		}

	}

}
