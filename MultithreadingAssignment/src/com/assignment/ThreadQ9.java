package com.assignment;

/*9.Thread t1 prints numbers 1 to 10 . Thread t2 prints characters a to h.
 *  Ensure that always characters are printed first and then numbers using join method.*/
public class ThreadQ9 extends Thread {

	public static void main(String[] args) {
		ThreadQ9 t1 = new ThreadQ9() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Thread 1:" + i);
				}

			}
		};

		ThreadQ9 t2 = new ThreadQ9() {
			public void run() {
				for (char ch = 'a'; ch <= 'h'; ch++) {
					System.out.println("Thread 2:" + ch);
				}

			}
		};

		t2.start();
		try {
			t1.join();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();

	}

}
