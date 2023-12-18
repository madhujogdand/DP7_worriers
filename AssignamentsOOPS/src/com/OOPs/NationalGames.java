package com.OOPs;

import java.util.Scanner;

public class NationalGames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Country name:");
		String cname=sc.next();

		String nationalGame;
		switch(cname)
		{
		case "India": nationalGame="Hockey";
		              break;
		case "China": nationalGame="Table Tennis";
                      break;
		case "Bangladesh": nationalGame="kabaddi";
                      break;
        case "Italy": nationalGame="Football";
                      break;
        case "US": nationalGame="Baseball";
                      break;
        default: nationalGame="Unknown";
		}
		
		System.out.println("The national game of "+cname+" is "+nationalGame);
	   sc.close();
	}

}
