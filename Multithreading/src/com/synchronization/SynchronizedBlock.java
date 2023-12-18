package com.synchronization;

class Message {
	public void processMessage(String msg) {
		System.out.println("Sending: " + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Received: " + msg);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Message m = new Message();
		Thread t1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("---------------------------------------");
				System.out.println("Welcome: " + Thread.currentThread().getName());
				synchronized (m) {
					m.processMessage("please pay the fees");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("---------------------------------------");
				System.out.println("Welcome: " + Thread.currentThread().getName());
				synchronized (m) {
					m.processMessage("Welcome to cultural fest");
				}
			}
		};

		t1.start();
		t2.start();

	}

}
