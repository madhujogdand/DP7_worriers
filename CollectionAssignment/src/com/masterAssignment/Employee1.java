package com.masterAssignment;

import java.util.Objects;

public class Employee1 {
	private int emp_id;
	private String emp_name;
	private float emp_salary;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int emp_id, String emp_name, float emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public float getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		return "Employee1 [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_id, emp_name, emp_salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name)
				&& Float.floatToIntBits(emp_salary) == Float.floatToIntBits(other.emp_salary);
	}

}
