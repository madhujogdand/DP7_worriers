package com.covariant;

class Person {

	int id;
	String name;
	
	public Person() {
		super();
		
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	Person showDetails()//return type person
	{
		name=name+"India";
		return this;
	}

	
	public String display()
	{
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
class Employee extends Person
{
	float salary;
	Employee()
	{
		
	}
	public Employee(int id, String name,float salary)
	{
		super(id, name);
		this.salary=salary;
	}
//	Person showDetails()
//	{
//		name=name+"ThinkQ";
//		salary=salary+1000;
//		return this;
//	}
	Employee showDetails()
	{
		name=name+"ThinkQ";
		salary=salary+1000;
		return this;
	}
	public String show() {
		return "Id:"+id+"Name:"+name+"Salary:"+salary;
	}
	
}
public class CovarientDemo {

	public static void main(String[] args) {
		Person ref;
		Employee eref;
       Person p=new Person(101,"neha" );
       ref=p.showDetails();
       System.out.println(ref.display());
       
       Employee e=new Employee(101,"Radha",45000f);
       eref =e.showDetails();
       System.out.println(ref.display());
     //  System.out.println(ref.show());
//    		
//       Employee e=new Employee(101,"Shivansh",55000f);
//       eref =(Employee)e.showDetails();//casting
//       System.out.println(ref.show());
//       
       Employee e1=new Employee(101,"Aashu",55000f);
       eref =e1.showDetails();//no type casting required
       System.out.println(eref.show());
       
	}

}
