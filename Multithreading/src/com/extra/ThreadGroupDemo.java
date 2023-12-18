package com.extra;

public class ThreadGroupDemo extends Thread {

	public void run() {

	}

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("Parent group");
		Thread t1 = new Thread(tg1, "Child1");
		Thread t2 = new Thread(tg1, "Child2");

		t1.setPriority(MIN_PRIORITY);
		tg1.setMaxPriority(MAX_PRIORITY);

		System.out.println("Priority of thread 1:" + t1.getPriority());
		System.out.println("Parent of thread 1:" + t1.getThreadGroup());

		t1.start();
		t2.start();

		System.out.println("Active Thread:" + tg1.activeCount());

	}

}
