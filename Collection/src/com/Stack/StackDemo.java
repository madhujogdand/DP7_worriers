package com.Stack;
//child class of vector
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> names=new Stack<>();
		
		names.push("Harshada");
		names.push("priyanka");
		
		System.out.println(names.push("Shraddha"));
		
		names.push("Maya");
		names.push("Gauri");
		
		System.out.println(names);
		
		System.out.println(names.pop());
		System.out.println(names);
	}

}
