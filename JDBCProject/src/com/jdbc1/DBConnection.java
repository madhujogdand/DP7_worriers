package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	// Connection : interface
	static Connection conn=null;
	
	public static Connection getConnect()
	{
		try
		{
			// Load the driver
			// we dont know the class
			// load without creating the instance
			// creates auto
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			System.out.println("Connection done...");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}

	public static void main(String[] args) {
		
		getConnect();
		
	}
}
