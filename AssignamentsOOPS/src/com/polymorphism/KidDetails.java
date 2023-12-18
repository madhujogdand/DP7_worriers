package com.polymorphism;
//1
class Kid
{
	void readBook()
	{
		System.out.println("Kid is reading book");
	}
	
	void readBook(String bookName,int pageNo)
	{
		System.out.println("Book name:"+bookName+"\nPage number:"+pageNo);
	}
}
class BigKid extends Kid
{
	void readBook()
	{
		System.out.println("Big Kid is reading book");
	}	

}
public class KidDetails {

	public static void main(String[] args) {
	   Kid k=new Kid();
	   k.readBook();
	   k.readBook("Shyam chi Aai",8);
       BigKid b=new BigKid();
       b.readBook();
	}

}
