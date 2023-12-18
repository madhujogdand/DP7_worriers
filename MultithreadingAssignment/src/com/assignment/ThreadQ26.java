package com.assignment;

public class ThreadQ26 extends Thread {
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("Interrupt: "+i);
			}
			else
			{
				System.out.println("Normal: "+i);
			}
		}
	}
	
	
	public static void main(String[] args) {
	
        ThreadQ26 t1=new ThreadQ26();
        t1.start();
        t1.interrupt();
	}

}
