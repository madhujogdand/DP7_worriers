package com.labContainment;

public class HiringEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Aarya");
		e1.setDesg("HR");
		e1.setSalary(28000);
		
		Date1 d=new Date1();
		e1.setHireDate(d);
		
		e1.getHiredate().setMm(1);
		e1.getHiredate().setDd(10);
		e1.getHiredate().setYy(1990);
		
		System.out.println(e1);

	}

}
