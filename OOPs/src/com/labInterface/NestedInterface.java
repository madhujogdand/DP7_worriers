package com.labInterface;

interface Bank {
	void show();

	interface locker {
		void showLocker();
	}
}

class HDFC implements Bank, Bank.locker {

	public void show() {
		System.out.println("Bank HDFC");
	}

	public void showLocker() {
		System.out.println("Bank providing locke facility");

	}

}

public class NestedInterface {

	public static void main(String[] args) {
		HDFC b = new HDFC();
		b.show();
		b.showLocker();

	}

}
