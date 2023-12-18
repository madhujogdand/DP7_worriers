package com.enumdemo;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose the tickets type:");
        System.out.println("1. Standard");
        System.out.println("2. Premium");
        System.out.println("3. Recliner");
        
        int seatType=sc.nextInt();
        
        System.out.println("Enter number of seats:");
        int num=sc.nextInt();
        
        MovieSeats ms=null;
        
        switch(seatType)
        {
        	case 1:ms=MovieSeats.STANDARD;
        	     break;
        	case 2:ms=MovieSeats.PREMIUN;
   	             break;
        	case 3:ms=MovieSeats.RECLINER;
   	            break;
   	        default:System.out.println("Error");
        }
        System.out.println("Ticket Type:"+ms);
        System.out.println("Number of Tickets:"+num);
        System.out.println("Total amount:"+(num*(ms.price)));
        
	}

}
