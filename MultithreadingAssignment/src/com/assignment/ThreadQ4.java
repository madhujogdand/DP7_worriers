package com.assignment;

public class ThreadQ4 implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() + " is daemon thread");
		} else {
			System.out.println(Thread.currentThread().getName() + " is user thread");
		}
	}

	public static void main(String[] args) {

		ThreadQ4 r1 = new ThreadQ4();
		ThreadQ4 r2 = new ThreadQ4();

		Thread t;
		t = new Thread(r1, "First");
		t.start();

		t = new Thread(r2, "Service");
		t.setDaemon(true);
		t.start();
		// t.setDaemon(true);
	}

}
