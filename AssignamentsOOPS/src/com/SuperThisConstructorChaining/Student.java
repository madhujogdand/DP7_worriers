package com.SuperThisConstructorChaining;
//1,2,3,4,5,6
public class Student {//1
	private int id;
	private String name;
    Student()
    {
    	
    }
	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public int getId() {//2
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
	
	public String toString() {
		return "Student Details:\nid:" + id + "\nName:" + name;
	}
	public static void main(String[] args) {
     Student s=new Student();//4
     s.setId(11);//5
     s.setName("Priti");
     System.out.println(s);
     Student s1=new Student();//4
     s1.setId(21);//5
     s1.setName("Aarya");
     System.out.println(s1);
     //3:in the setter method if you remove ‘this.’ when assigning the parameter
    // value?
     //there wont be any distinction betn instance variable and parameter.

     //6: can use ‘this’ in main method: because this reffers to the current instance of class
     //main method is static
	}

}
