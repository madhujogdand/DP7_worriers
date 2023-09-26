package com.constructorChainingRevision;

class Account
{
	int id;
	String name;
	int balance;
	
	//default constructor
	Account()
	{
		this(111,"Madhu");//3)constructor chaining
	}
	//1)differentiate between argument and instance variable
    Account(int id,String name)//Parameterized constructor
    {
    	this.id=id;
    	this.name=name;
    	
    }
  //2)differentiate between local variable and instance variable
	Account(int id, String name,int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
   //4)call one istance method in another method
	void display()
	{
		String name="Priya";
		System.out.println(name);
		this.show();
	}
    void show()
    {
    	System.out.println(this.id+" "+this.name+" "+this.balance);
    	
    }
   
    //5)return the current object
     Account changeName()
    {
    	name=name+" Aarya";
    	return this;
    }
    

}
public class Bank {

	public static void main(String[] args) {
		Account a=new Account(101,"geeta",5000);
		a.display();
		System.out.println();
		
		Account a1=new Account();
		a1.changeName();
		System.out.println(a1.name);
         
	}

}
