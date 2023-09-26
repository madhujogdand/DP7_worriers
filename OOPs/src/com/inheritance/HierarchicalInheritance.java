package com.inheritance;

class Student
{
	private int id;
	private String name;
	private int fees;

    Student()
    {
    	
    }
    
    Student(int id,String name,int fees)
    {
    	this.id=id;
    	this.name=name;
    	this.fees=fees;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String toString() {
		return "Student id:" + id + "\nname:" + name + "\nfees:" + fees ;
	}
}
class SchoolStudent extends Student
{
	private int sid;
	private String schoolName;
	
	SchoolStudent()
	{
		super();
	}
	
	SchoolStudent(int id,String name,int fees,int sid,String schoolName)
	{ 
		super(id,name,fees);
		this.sid=sid;
		this.schoolName=schoolName;
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String toString()
	{
		return super.toString()+ "\nsid:" + sid + "\nschoolName:" + schoolName;
	}
     
}

class CollegeStudent extends Student
{
	private String university;
	private String course;
	private int sem;

    CollegeStudent()
    {
    	super();
    }

    CollegeStudent(int id,String name,int fees,String university, String course,int sem)
    {
    	super(id, name, fees);
    	this.university=university;
    	this.course=course;
    	this.sem=sem;
    }

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String toString() {
		return super.toString()+"CollegeStudent \nuniversity:" + university + "\ncourse:" + course + "\nsem:" + sem;
	}
  }

public class HierarchicalInheritance {
	public static void main(String[] args) {
		SchoolStudent s1=new SchoolStudent(101, "radha", 25000, 11, "GH");
	     System.out.println(s1);
	     
	     System.out.println();
	     
	     CollegeStudent c1=new CollegeStudent(102,"Neha",29000,"SRTMUN","BCA",4);
	     System.out.println(c1);
	     
		
	}
}
