package com.singleton;

public class SingletonDemo {

	// rule1:static member to create instance

	private static SingletonDemo obj = new SingletonDemo();// early

	public String msg;

	// rule2:private constructor

	private SingletonDemo() {
		msg = "Welcome";
	}

	// rule3:public static method to return the instance

	public static SingletonDemo getInstance() {
		if (obj == null) {
			new SingletonDemo();// lazy
		}
		return obj;

	}

	public static void main(String[] args) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		SingletonDemo s3 = SingletonDemo.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		// DiverManager-singleton class
		// COnnection con=DriverManager.getConnection

		s1.msg = "Hello";

		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
	}
}
