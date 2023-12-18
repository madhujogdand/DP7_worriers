package com.MapAdditional;

import java.util.Objects;

public class Department
{
  private int id;
  private String name;
  private Student stud;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Department(int id, String name, Student stud) {
	super();
	this.id = id;
	this.name = name;
	this.stud = stud;
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
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", stud=" + stud + "]";
}
@Override
public int hashCode() {
	return Objects.hash(id, name, stud);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Department other = (Department) obj;
	return id == other.id && Objects.equals(name, other.name) && Objects.equals(stud, other.stud);
}
  
  
}
