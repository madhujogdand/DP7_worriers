package com.loop;
import java.util.Scanner;
public class MagicBoard {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number :");
	   int num=sc.nextInt();
	   char ch;
	   for(int i=65;i<=num;i++)
	   {
		   ch=(char)i;
		   System.out.println(i+" = "+ch);
	   }
	   sc.close();
   }
}
