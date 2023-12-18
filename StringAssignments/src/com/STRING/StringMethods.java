package com.STRING;

public class StringMethods {
	/*4.	Write a Java program to find length of a string.
	5.	Write a Java program to concatenate two strings.
	6.	Write a Java program to compare two strings.
	7.	Write a Java program to convert lowercase string to uppercase.
	16.	Write a Java program to convert uppercase string to lowercase.
	*/
	
		public static void main(String[] args) {
			String str="java is programming language.";
			String str1="Java is fun.";
	        //length
			System.out.println("Length:"+str.length());
			//concat
			System.out.println("Concatenate:"+str.concat(str1));
			//compare
			System.out.println("Compare:"+"Shivani".compareTo("Shivani"));
			System.out.println("Compare:"+"Radha".compareTo("Aashu"));
			System.out.println("Compare:"+"Aashu".compareTo("Radha"));
			System.out.println("Compare:"+"Shivani".compareTo("Shivani"));
		    //LowerCase to Uppercase
			System.out.println("Uppercase:"+"madhu".toUpperCase());
			//Uppercase to lowercase
			System.out.println("Uppercase:"+"MADHU".toLowerCase());
		    //ReplaceAll
			System.out.println();
		    
		
		}
}
