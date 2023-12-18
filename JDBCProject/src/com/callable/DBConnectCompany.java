package com.callable;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectCompany {
	
	
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/companydb";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	// Connection : interface
	static Connection conn=null;
	
	public static Connection getConnect()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded");
			conn= DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			//System.out.println("Connection done...");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	}

	
}
