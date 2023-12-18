package com.Comparable;

/*3. WAP to create a class Employee with (name, designation and age).Now create and add Employee 
objects elements to Arraylist. Print ArrayList.
4. Now modify Employee class so that it implements Comparable interface’s compareTo 
method.Sorting should be done based on id in which use < , > & == technique.
5. Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions
6. Now do descending sort of Employee.id in Employee arraylist using < , > & == technique.
7. Now do descending sort of Employee.id in Employee arraylist using inbuilt compareTo technique.
8. Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using 
Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.
9. Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis*/
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String designation;
	private int age;
	private Profile profile;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, int age,Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.profile=profile;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", profile="
				+ profile + "]";
	}

	

	// Q4-On basis of id-ascending
//	@Override
//	public int compareTo(Employee o) {
//		if (this.id == o.id)
//			return 1;
//		else if (this.id < o.id)
//			return -1;
//		else
//			return 1;
//	}
//	//Q5-on basis of id-inbuilt compareToMethod
//	@Override
//	public int compareTo(Employee o) {
//		Integer id1=this.id;
//		Integer id2=o.id;
//		
//		return id1.compareTo(id2);
//	}
	// Q6-On basis of id-descending
//		@Override
//		public int compareTo(Employee o) {
//			if (this.id == o.id)
//				return 1;
//			else if (this.id > o.id)
//				return -1;
//			else
//				return 1;
//		}
   //Q7-on basis of id-inbuilt compareToMethod-descending order
//		@Override
//		public int compareTo(Employee o) {
//			Integer id1=this.id;
//			Integer id2=o.id;
//			
//			return id2.compareTo(id1);
//		}
	//Q8-on basis of id-inbuilt compareToMethod-descending order
//	@Override
//	public int compareTo(Employee o) {
//		if(this.name.compareTo(o.name)==0) {
//			if(this.getId()==o.getId())
//			return 0;
//			else if(this.getId()<o.getId())
//				return -1;
//		return 1;
//	}
//		else return this.getName().compareTo(o.getName());
//		   
//		
//  }
	//Q9-sorting of employees on basis of country
	@Override
	public int compareTo(Employee o) {
		
		return this.profile.getCountry().compareTo(o.profile.getCountry());
	}
}
