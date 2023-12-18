package com.day1n2;

public class ShowNullPointerException {
	public static void main(String[] args) {
		//1st scenario	
		try {
		String s1 =null;
		s1.substring(4);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		//2nd scenario
		try {
			int arr[]=null;
			System.out.println(arr[0]);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		//3rd scenario
		try {
			Student s1= null;
			System.out.println(s1.name);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
	}
}
class Student {
	String name;
	String address;
}