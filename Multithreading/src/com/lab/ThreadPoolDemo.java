package com.lab;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyJob implements Runnable
{
	String name;
	
	MyJob()
	{
		
	}
	MyJob(String name)
	{
		this.name=name;
	}
	@Override
	public void run()
	{
		System.out.println("Strating job by"+Thread.currentThread().getName());
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending job by"+Thread.currentThread().getName());
	}
}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		
          MyJob[] mj= {new MyJob("add"),new MyJob("Print"),new MyJob("Delete"),new MyJob("Update"),new MyJob("Replace")};
          
          ExecutorService es=Executors.newFixedThreadPool(5);
          
          MyJob m;
          for(int i=1;i<10;i++)
          {
        	  m=new MyJob("MyJob_"+1);
        	  es.execute(m);
          }
          es.shutdown();
          
	}

}
