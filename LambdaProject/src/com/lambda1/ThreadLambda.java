package com.lambda1;

public class ThreadLambda {

	public static void main(String[] args) {
		Runnable r1=()->System.out.println(Thread.currentThread().getName());
		
		Thread t1=new Thread(r1,"First");
		t1.start();
		
		
		Runnable r2=()->{System.out.println(Thread.currentThread().getName());
		                  for(int i=0;i<5;i++)
		                  {
		                	  System.out.println(i);
		                  }
		                  };
		                  
		  t1=new Thread(r2);
		  t1.start();

	}

}
