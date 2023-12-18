package com.examples;

public class School {

	static void findTopper(Student stud[]) {
		float maxmarks = Float.MIN_VALUE;
		Student st = new Student();

		for (Student s : stud) {
			if (s.getMarks() > maxmarks) {
				maxmarks = s.getMarks();
				st = s;
			}
		}
		System.out.println(st);

	}
    static void sortMarks(Student stud[])
    {
    	Student st=new Student();//temp student
    	for(int i=0;i<stud.length;i++)
    	{
    		for(int j=i+1;j<stud.length;j++)
    		{
    			if(stud[i].getMarks()<stud[j].getMarks())
    			{
    				st=stud[i];
    				stud[i]=stud[j];
    				stud[j]=st;
    			}
    		}
    	}
    	
    }
	public static void main(String[] args) {

		
		Student st[] = new Student[5];
		

		st[0] = new Student(1, "Aarya", 78.5f);
		st[1] = new Student(2, "Neha", 88.5f);
		st[2] = new Student(3, "Priya", 89.5f);
		st[3] = new Student(4, "Aashu", 58.5f);
		st[4] = new Student(5, "priti", 67.5f);
		// st[5]=new Student(6,"Aditi",99.5f);ArrayIndexOutOfBound Exception

		for (Student S : st) {
			System.out.println(S);
		}

		System.out.println("-------------------------------------------");

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		System.out.println("---------------------------------");
		System.out.println("Topper of the school is:");
		findTopper(st);
		System.out.println("---------------------------------");
		sortMarks(st);
		for (Student S : st) {
			System.out.println(S);
		}
		
	}

}
