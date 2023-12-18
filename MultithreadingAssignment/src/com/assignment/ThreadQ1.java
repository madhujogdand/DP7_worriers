package com.assignment;
//1.Create thread by extending Thread class.
public class ThreadQ1 extends Thread {
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" value"+i);
		}
	}
	public static void main(String[] args)
	{	
		ThreadQ1 t=new ThreadQ1();
		t.start();
	

	}

}
