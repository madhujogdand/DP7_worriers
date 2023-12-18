package com.factorymethodpattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaDeveloper extends Developer {

	public JavaDeveloper() {
		super();

	}

	public JavaDeveloper(String name) {
		super(name);

	}

	@Override
	public void salaryPaid() {
		salary = 75000f;
	}

	@Override
	public void skillset() {

		String skills[] = { "core java", "SQL", "JDBC" };
		System.out.println(Arrays.toString(skills));
	}

}
