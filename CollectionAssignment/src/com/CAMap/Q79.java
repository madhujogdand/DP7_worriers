package com.CAMap;
/*79. Create treemap using treemap(comparator) constructor. 
Create name comparater of employee class and pass it to 
constructor. */
import java.util.Map;
import java.util.TreeMap;

public class Q79 {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> tm=new TreeMap<Employee, String>(new NameComparator());
		
		tm.put(new Employee(1,"Neel",45000),"sales");
		tm.put(new Employee(2,"leela",65000),"HR");
		tm.put(new Employee(3,"tara",55000),"IT");
		tm.put(new Employee(4,"neha",48000),"Finance");
		tm.put(new Employee(5,"radha",46000),"marketing");
		tm.put(new Employee(5,"radha",46000),"marketing");

	    for(Map.Entry<Employee, String> entry:tm.entrySet())
	    {
	    	System.out.println(entry.getKey()+""+entry.getValue());
	    }
	}

}
