package com.labcodes;
import java.util.Scanner;
class Student
{
	private int id;
    private String name;
    private String address;
    private String collegeName="TQ";
    
    Student(int id,String name,String address)
    {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	
    }
    Student(int id,String name,String address,String collegeName)
    {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.collegeName=collegeName;
    }
    public int getId()
    {
    	return id;
    }
    public String getName()
    {
    	return name;
    }
    public String getAddress()
    {
    	return address;
    }
    public String getCollegeName()
    {
    	return collegeName;
    }
    public String toString()
    {
    	return "\nStudent Id:"+id+"\nStudent Name: "+name+"\nStudent Address: "+address+"\nCollehe Name: "+collegeName;
    }
}
public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("is student belongs to TQ...y or n");
		char ch=sc.next().charAt(0);
		do
		{
		if(ch=='y')
		{
			Student s1=new Student(111,"Neha","Nanded");
			System.out.println(s1);
			break;
		}
		else if(ch=='n')
		{
			System.out.println("enter the college name: ");
			String cName=sc.next();
			Student s2=new Student(112,"Aashu","Mumbai",cName);
			System.out.println(s2);
			break;
		}
		else
		{
			System.out.println("Wrong choice.... please enter y or n");
			ch=sc.next().charAt(0);
		}
		}while(ch=='y' || ch=='n');
	}

}
