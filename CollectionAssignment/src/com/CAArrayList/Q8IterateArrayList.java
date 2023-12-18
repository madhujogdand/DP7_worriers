package com.CAArrayList;
/*8. Let employee class has a department object. Iterate through a 
arraylist of employees. Show all details including department 
name.
12. Sort arraylist of employees on employee names using 
comparable interface. 
14. Sort arraylist of employees on department names using 
comparator interface. 
16. Iterate through arraylist using foreach .
17. What is difference between array and arraylist.
18. Traverse arraylist in reverse direction using list iterator. 
28. Sort arraylist of employees in ascending order of their 
salaries. If salary is same , list should be in descending order of 
name.
31. What will happen if compare method returns only +1. Show 
example.
32. What will happen if compare method always returns -1. 
Show example
33. What will happen if compare method always returns 0; Show 
example.
39. Iterate through linked list using descending iterator.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Q8IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList <Employee> al=new ArrayList<>();
	      
		al.add(new Employee(1,"Priti",34000,new Department(101,"HR")));
		al.add(new Employee(2,"Shruti",45000,new Department(102,"Finance")));
		al.add(new Employee(3,"Radha",38000,new Department(103,"Marketing")));
		al.add(new Employee(4,"Dhruti",32000,new Department(104,"HR")));
		al.add(new Employee(5,"Neha",32000,new Department(105,"HR")));
	
		//1st way
		
		System.out.println(al);
		
		System.out.println("=======================================================");
		
		//2nd way-using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
        System.out.println("=======================================================");
		
		//2nd way-using enhanced for loop
        for(Employee e:al)
		{
			System.out.println(e);
		}
        System.out.println("=======================================================");
		
		//3rd way-using Iterator
        
        Iterator <Employee> itr=al.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("=======================================================");
		
		//4th way-using ListIterator
        ListIterator<Employee> litr=al.listIterator();
        while(litr.hasNext())
        {
        	System.out.println(litr.next());
        }
         System.out.println("=======================================================");
		
		//5th way-using ListIterator-backward//Q39
         ListIterator<Employee> litr1=al.listIterator(al.size());
         while(litr1.hasPrevious())
         {
         	System.out.println(litr1.previous());
         }
         
         System.out.println("=======================================================");
 		
         Collections.sort(al);//Q12/Q28
         for(Employee e:al)
 		{
 			System.out.println(e);
 		}
         System.out.println("=======================================================");
  		
         Collections.sort(al,new DepartmentComparator());//Q14
         for(Employee e:al)
 		{
 			System.out.println(e);
 		}
         System.out.println("=======================================================");
   		
         Collections.sort(al,new PositiveComparator());//Q31
         for(Employee e:al)
 		{
 			System.out.println(e);
 		}
         System.out.println("=======================================================");
    		
         Collections.sort(al,new NegativeComparator());//Q32
         for(Employee e:al)
 		{
 			System.out.println(e);
 		}
         System.out.println("=======================================================");
 		
         Collections.sort(al,new ZeroComparator());//Q33
         for(Employee e:al)
 		{
 			System.out.println(e);
 		}
	}

}
