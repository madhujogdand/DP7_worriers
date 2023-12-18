package com.interthreadcomm;

class SharedR {
	public synchronized void methodOne() {
		System.out.println(Thread.currentThread().getName() + "has locked method one");
		System.out.println(Thread.currentThread().getName() + "has released method one");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName() + "has finished the task");
	}

	public synchronized void methodTwo() {

	   try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {		
		System.out.println(e);
	}
		notify();
		System.out.println(Thread.currentThread().getName() + "has notified");
	}
}

public class InterThreadComm2 {

	public static void main(String[] args) {
		SharedR obj = new SharedR();

		Thread t1 = new Thread() {
			public void run() {
               obj.methodOne();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
              obj.methodTwo();
			}
		};
		
		t1.start();
		t2.start();

	}

}
