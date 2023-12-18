package com.ArrayListHw;
/*1.WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and
 see both variable memory space is printed. This is because toString is not overriden 
 but if you would have done this for Integer then beautiful output would have been printed.
2.Now override toString for earlier assignment and now sysout and see values are printed
3.WAP to print Emp whose salary is > 10000
4.WAP to print Emp who have name "Harshada"
5.WAP to print Emp who have highest number of salary
*/
import java.util.ArrayList;

class Emp
{
	private int id;
	private String name;
	private double sal;
	
	public Emp()
	{
		super();
		
	}

	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {//1
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		//System.out.println(e1);//2
		//System.out.println(e2);
		
		//Emp e1=new Emp(1,"Neha",45000);
	    //Emp e2=new Emp(2,"Shivani",60000);
	    
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(1,"Neha",45000));
		al.add(new Emp(2,"Shivani",60000));
		al.add(new Emp(3,"Sushma",10000));
		al.add(new Emp(4,"Priyanka",35000));
		al.add(new Emp(5,"Harshada",8000));
		
		System.out.println(al);
		System.out.println("==============================================");
		for(int i=0;i<al.size();i++)//3
		{			
		  if(al.get(i).getSal()>10000)
		  {
			  System.out.println(al.get(i).getName());
		  }
		}
        System.out.println("==============================================");
		System.out.println("Employee who have name harshada");
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).getName().equals("Harshada"))
				System.out.println(al.get(i));
		}
		System.out.println("==============================================");
		System.out.println("Employee who have highest salary");
		int maxSal=Integer.MIN_VALUE;
		for(int i=0;i<al.size();i++)
		{			
			if(al.get(i).getSal()>maxSal)
			{
				maxSal=(int) al.get(i).getSal();
				System.out.println(al.get(i));
			}
			
		}
		
	}

}
