package com.AccessModifiers;

public class TQPPStudent1 {
	
	
	public int rNo;
	protected int admNo;
	int age;
	private int cId;

	void show()
	{
		System.out.println("Roll no:"+rNo);
		System.out.println("Admission no:"+admNo);
		System.out.println("Age:"+age);
		System.out.println("Course Id:"+cId);
	}

	public void doPublic()
	{
		System.out.println("Public method");
	}
	void doDefault()
	{
		System.out.println("default method");
	}
	protected void doProtected()
	{
		System.out.println("Protected method");
	}
	private void doPrivate()
	{
		System.out.println("Private method");
	}
}
