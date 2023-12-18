package com.lab;

import com.basics.RunnableDemo;

public class ThreadRunnablePrintNUm implements Runnable {


	@Override
	public void run()
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}

		for (int i = 100; i <= 200; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		ThreadRunnablePrintNUm t1=new ThreadRunnablePrintNUm();	
		ThreadRunnablePrintNUm t2=new ThreadRunnablePrintNUm();	
           
		Thread t;
		t = new Thread(t1);
		t.start();

		t = new Thread(t2);
		t.start();

		t = new Thread(new RunnableDemo());
		t.start();
	}
}
