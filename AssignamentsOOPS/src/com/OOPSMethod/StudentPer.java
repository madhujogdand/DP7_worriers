package com.OOPSMethod;
//7
class Stud
{
	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
	
	void setDetails(int id,String name,int sub1,int sub2,int sub3)
	{
		this.id=id;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}

	void displayStudentData()
	{
		System.out.println("Enter Student id:"+id);
		System.out.println("Enter Student name:"+name);
		System.out.println("Enter sub1 marks:"+sub1);
		System.out.println("Enter sub2 marks:"+sub2);
		System.out.println("Enter sub3 marks:"+sub3);
	}
	double calPercentage()
	{
		int total=sub1+sub2+sub3;
		double percentage=total/3;
	    return percentage;
	}
	
}
public class StudentPer {

	public static void main(String[] args) {
	    Stud s=new Stud();
	    s.setDetails(1,"Shivansh",90,99,95);
	    s.displayStudentData();
	  double percentage=s.calPercentage();
	  System.out.println("Percentage :"+percentage+"%");
	}

}
