package com.lab;
//annonyms thread
//create a thread to print 1-10 num
public class ThreadPrintNum
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for (int i = 1; i <= 10; i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				for (int i = 100; i <= 200; i++)
				{
					System.out.println(i);
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
