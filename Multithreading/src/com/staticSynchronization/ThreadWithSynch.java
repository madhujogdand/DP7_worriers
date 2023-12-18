package com.staticSynchronization;

//resource
class MyTable {
	public static synchronized void printTable(int n) {
		//System.out.println(Thread.currentThread().getName()+" is started");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		//System.out.println(Thread.currentThread().getName()+" has  finished");
	}
}

public class ThreadWithSynch {

	public static void main(String[] args) {
		MyTable obj1 = new MyTable();
		MyTable obj2 = new MyTable();

		Thread t1 = new Thread() {
			public void run() {
				obj1.printTable(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj1.printTable(3);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				obj2.printTable(5);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				obj2.printTable(10);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

