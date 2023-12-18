package com.lab;

public class ThreadGroupDemo implements Runnable{


	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) {
		
          ThreadGroupDemo tr=new ThreadGroupDemo();
          
          ThreadGroup tg1=new ThreadGroup("Parent threadGroup");
          Thread t1=new Thread(tg1,tr,"one");
          Thread t2=new Thread(tg1,tr,"two");
          Thread t3=new Thread(tg1,tr,"three");
          
          t1.start();
          t2.start();
          t3.start();
          
          System.out.println("Thread Group name:"+tg1.getName());
          tg1.list();
	}

}
