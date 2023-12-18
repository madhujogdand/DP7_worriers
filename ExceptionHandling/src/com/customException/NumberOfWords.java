package com.customException;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence=sc.next();
        
        String splits[]=sentence.split("\\s");
        
        try
        {
        	if(splits.length<2)
        	{
        		throw new InvalidSentenceException("Name should be greater than 2 characters");
        	}
        System.out.println("Welcome "+splits);
        }
        catch(InvalidSentenceException e)
        {
        	System.out.println(e);
        }
	}

}
