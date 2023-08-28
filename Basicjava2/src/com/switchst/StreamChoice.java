package com.switchst;
import java.util.Scanner;
public class StreamChoice {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("Enter stream:");
	   String stream=sc.next();
	   System.out.println("Enter Passing_Criteria:");
	   int passing_criteria=sc.nextInt();
	   
	   switch(stream)
	   {
	   case "MBA": System.out.println("you are choosing MBA");
	           
	   switch(passing_criteria)
	   {
	   case 75: System.out.println("You got admission for MBA");
              break;
       //case 70: System.out.println("You got admission for MCA");
       //break;
       default:System.out.println("Enter correct passing_criteria");
       
	   }
	   break;
	   case "MCA":  System.out.println("you are choosing MCA");     
	           
	   switch(passing_criteria)
	   {
	  // case 75: System.out.println("You got admission for MBA");
	       //  break;
	   case 70: System.out.println("You got admission for MCA");
	         break;
	   default:System.out.println("Enter correct passing_criteria");
	   }
	   break;
	   
	   default: System.out.println("Enter correct stream");
       }
	   
	  sc.close();
   }
}
