package com.factorymethodpattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FullStackDeveloper extends Developer {

	
	
	public FullStackDeveloper() {
		super();
		
	}

	public FullStackDeveloper(String name) {
		super(name);
		
	}

	@Override
	public void salaryPaid()
	{
		salary=105000f;
	}

	@Override
	public void skillset() {
		
		String skills[]= {"java","Angular","Aws","SQL","Hibernate","React"};
		System.out.println(Arrays.toString(skills));
	}

}
