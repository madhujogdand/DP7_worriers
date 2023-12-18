package com.assignment;
/*10.Show use of all 3 join methods of thread class.*/
public class ThreadQ10 {

	public static void main(String[] args) throws InterruptedException {
	
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
		ThreadQ9 t3 = new ThreadQ9() {
			public void run() {
				for (int i = 21; i <=30; i++) {
					System.out.println("Thread 3:" + i);
				}

			}
		};
		
		t1.start();
		t1.join();
		t2.start();
		t2.join(500);
		t3.start();
		t3.join(100, 150);
		
	}

}
