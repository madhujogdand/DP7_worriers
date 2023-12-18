package com.containment;

class Institute
{
	int id;
	String name;
	Institute(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Institute:\nId:"+id+"\nName"+name);
	}
	
}
class Branch
{
	int id;
	String name;
	Branch(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Branch:\nId:"+id+"\nName"+name);
	}
	
}
class Subject
{
	int id;
	String name;
	Subject(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Subject:\nId:"+id+"\nName"+name);
	}
	
}
class Topic
{
	int id;
	String name;
	Topic(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Topic:\nId:"+id+"\nName"+name);
	}
	
}
class SubTopic
{
	int id;
	String name;
	SubTopic(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("SubTopic:\nId:"+id+"\nName"+name);
	}
	
}
class Question
{
	int id;
	String name;
	Question(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void print()
	{
		System.out.println("Question:\nId:"+id+"\nName"+name);
	}
	
}
public class HierarchyContainment {

	public static void main(String[] args) {
		Institute i=new Institute(1, "SRTMUN");
        Branch b=new Branch(1, "HR");
        Subject s=new Subject(1, "Human Resource");
        Topic t=new Topic(1, "Chapter 1");
        SubTopic st=new SubTopic(1, "HR details");
        Question q=new Question(1, "Que");
        
        
        i.print();
        System.out.println();
        b.print();
        System.out.println();
        s.print();
        System.out.println();
        t.print();
        System.out.println();
        st.print();
        System.out.println();
        q.print();
        
	}

}
