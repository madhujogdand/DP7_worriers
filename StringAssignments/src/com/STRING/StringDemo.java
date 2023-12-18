package com.STRING;

public class StringDemo {
	/*1.	String create with “” and with new operator
	2.	Compare string using == when “” is present see same reference is there
	3.	Compare string using new operator when new is present see different reference is there
	*/
	

		public static void main(String[] args) {
			String str1 = "Hello";//1
			System.out.println(str1.hashCode());//same hashcode
			String str2="Hello";
			System.out.println(str2.hashCode());//same hashcode
			//using == operator
			System.out.println(str1==str2);//2
			String str3=new String("World");//3
			System.out.println(str3.hashCode());//diff hashcode

		}
}
