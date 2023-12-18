package com.innerDemo;

class Bank {
	private String bname = "SBI Bank";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;

	{
		bankloc = "Delhi";
		ifscCode = "SBINDE1234";
	}

	Bank() {

	}

	Bank(int accNo, String aName) {
		this.accNo = accNo;
		this.aName = aName;
	}

	void displayBankDetails() {
		System.out.println(bname + " " + bankloc);
		System.out.println(ifscCode);
	}

	class Locker {
		int lockerId;
		String pass;
		static float LockerRent = 2000;

		Locker() {

		}

		public Locker(int lockerId, String pass) {
			super();
			this.lockerId = lockerId;
			this.pass = pass;

		}

		void displayLockerDetails() {
			System.out.println("This locker belongs to:" + aName + " with accNo:" + accNo);
			System.out.println("Locker Id:" + lockerId);
			System.out.println("rent to be paid:" + LockerRent);
		}

	}
}

public class SimpleInnerClass {

	public static void main(String[] args) {

		// Bank$Locker
		// 1st way
		Bank cust1 = new Bank(334455, "Radha");
		cust1.displayBankDetails();

		Bank.Locker locker1 = cust1.new Locker(101, "D1234");
		locker1.displayLockerDetails();

		// 2nd way
		System.out.println("==========================================");
		Bank.Locker cust2 = new Bank(127890, "Aashu").new Locker(103, "A344");
		cust2.displayLockerDetails();

		//Locker l1=new Locker();
	}

}
