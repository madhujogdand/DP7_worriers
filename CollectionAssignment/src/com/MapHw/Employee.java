package com.MapHw;

import java.util.Objects;

public class Employee 
{
   private int eid;
   private String ename;
  
   
public Employee() {
	super();
	
}

public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
	
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}




@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + "]";
}

@Override
public int hashCode() {
	return Objects.hash(eid, ename);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return eid == other.eid && Objects.equals(ename, other.ename);
}


   
   
}
