package com.basics;

public class ThreadStatesDemo {

	public static void main(String[] args) {
		Thread.State[] states=Thread.State.values();
		
		for(Thread.State s:states)
		{
			System.out.println(s);
		}

	}

}
