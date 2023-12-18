package com.assignment;
/*5.Change priorities of thread. Check what are values for MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY.*/

public class ThreadQ5 extends Thread  {


		
		public void run()
		{
			System.out.println("Thread Name: "+Thread.currentThread().getName());
			System.out.println("Priority: "+Thread.currentThread().getPriority());
		
		    System.out.println("------------------------------");
		}
		public static void main(String[] args) {
		
			ThreadQ5 t1=new ThreadQ5();//thread=0
			ThreadQ5 t2=new ThreadQ5();
			ThreadQ5 t3=new ThreadQ5();
			

			t1.setName("Thread1");//thread-0
			t2.setName("Thread2");
			t3.setName("Thread3");
		
			t3.setPriority(MAX_PRIORITY);
			t1.setPriority(MIN_PRIORITY);
			t1.setPriority(1);
			
			
			t1.start();
			t2.start();
			t3.start();
			
		}
	

}
