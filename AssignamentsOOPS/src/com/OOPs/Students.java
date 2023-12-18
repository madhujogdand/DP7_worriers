package com.OOPs;

class Student1
{
	int id;
	String name;
	
	Student1(int id, String name)
	{
		this.id=id;
		this.name=name;
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


	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}


	void display()
	{
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
	}
}
public class Students {

	public static void main(String[] args) {
		Student1 s=new Student1(2, "tyu");
		s.display();
		System.out.println();
		Student1 s1=new Student1(3, "cvb");
        s1.display();
        System.out.println();
        s.setId(4);
        s.setName("Nabha");
        s.display();
        System.out.println();
        s1.setId(5);
        s1.setName("Stavya");
        s1.display();
        
        
	}

}
