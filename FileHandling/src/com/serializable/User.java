package com.serializable;

import java.io.Serializable;

public class User implements Serializable {
  
	private int id;
	private String uname;
	private transient String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uname, String password) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
	
	
	
	
	
}
