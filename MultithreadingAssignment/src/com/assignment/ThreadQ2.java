package com.assignment;
//2.Create thread by implementing runnable interface.

public class ThreadQ2 implements Runnable {

	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}

		for (int i = 100; i <= 200; i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		
		ThreadQ2 t1=new ThreadQ2();
		ThreadQ2 t2=new ThreadQ2();
		
		Thread t;
		t = new Thread(t1);
		t.start();

		t = new Thread(t2);
		t.start();

		t = new Thread(new ThreadQ2());
		t.start();
	
	
	}

}
