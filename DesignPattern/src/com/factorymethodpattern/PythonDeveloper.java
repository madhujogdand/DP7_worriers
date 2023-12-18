package com.factorymethodpattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PythonDeveloper extends Developer {

	
	
	public PythonDeveloper() {
		super();
		
	}

	public PythonDeveloper(String name) {
		super(name);
		
	}

	@Override
	public void salaryPaid()
	{
		salary=45000f;
	}

	@Override
	public void skillset() {
		
		String skills[]= {"Basic python","Numpy","Machine Learning"};
		System.out.println(Arrays.toString(skills));
	}

}
