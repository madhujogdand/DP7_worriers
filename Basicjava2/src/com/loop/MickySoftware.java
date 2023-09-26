package com.loop;
import java.util.Scanner;
public class MickySoftware {
 public static void main (String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int pay=100;
	 System.out.println("Enter working hours: ");
	 int part_time=sc.nextInt();
	 if(part_time>0 && part_time<=24)
	 {
	 double total=part_time*pay*365;
	 System.out.println("Total salary in 365 days: "+total);
	 }
	sc.close();
	 }
}
