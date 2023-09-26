package com.labcodes;

import java.util.Scanner;

class Ticket
{
	private int tid;
	private int price;
	static int availableTickets=25;

//	{
//		price=100;
//	}
	Ticket()
	{
		
	}
//  
   Ticket(int tid,int price)
   {
	   this.tid=tid;
	   this.price=price;
   }
   
   public int getTid()
   {
	   return tid;
   }
   public void setTid(int tid)
   {
	   this.tid=tid;
   }
   public int getPrice()
   {
	   return price;
   }
   public void setPrice(int price)
   {
	   this.price=price;
   }
   public int getAvailableTickets()
   {
	   return availableTickets;
   }
   public void setAvailableTickets(int availableTickets)
   {
	   if (availableTickets>0)
	   {
	   this.availableTickets=availableTickets;
	   }
   }   
   public String toString()
   {
	   return "Ticket Id:"+tid+"\nTicket Price:"+price;
   }
   
   public int calculateTicketCost(int nooftickets)
   {
	   if (availableTickets>=nooftickets)
	   {
		   availableTickets= availableTickets-nooftickets;
		   int TotalAmount=nooftickets+price;
		   return TotalAmount;
	   }
	   else
	   {
		   return -1;
	   }
   }

}

public class TicketCalculation {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Ticket ticket=new Ticket();
		 System.out.println("Enter no. of bookings:");
		 int booking=sc.nextInt();
		 System.out.println("Available Tickets:"+Ticket.availableTickets);
		 
		 System.out.println("Enter the TicketId:");
         int ticketId=sc.nextInt();
         System.out.println("Enter the price:");
         int price=sc.nextInt();
         System.out.println("Enter the no of tickets:");
         int nooftickets=sc.nextInt();
         
         if(nooftickets>Ticket.availableTickets)
         {
        	 System.out.println("Sorry no tickets available");
         }
         else
         {
        	System.out.println(); 
         }
	}

}
