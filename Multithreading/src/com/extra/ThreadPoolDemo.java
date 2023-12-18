package com.extra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyGame implements Runnable {

	private String taskName;

	public MyGame() {
		super();

	}

	public MyGame(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public void run() {
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss");
		for (int i = 0; i <= 5; i++) {
			if (i == 0) {
				System.out.println("<<Initialized:+" + i + ">>" + taskName + " -->" + sf.format(d));
			} else {
				System.out.println("<<Executing task:" + i + ">>" + taskName + " -->" + sf.format(d));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("<<completedtask: >>" + taskName + " -->" + sf.format(d));
	}

}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		Runnable r1 = new MyGame("Play music");
		Runnable r2 = new MyGame("Score points");
		Runnable r3 = new MyGame("Move the car");
		Runnable r4 = new MyGame("Accelerate");
		Runnable r5 = new MyGame("Apply Bikes");

		ExecutorService ex = Executors.newFixedThreadPool(3);

		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		ex.execute(r5);
	}

}
