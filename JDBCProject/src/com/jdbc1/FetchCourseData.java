package com.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchCourseData {
	
	static Connection con=null;
	Statement st;
	ResultSet rs;
	
	
	public FetchCourseData() {
		con= DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st= con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	
	public void fetchCourseDetails()
	{
		try
		{
			rs= st.executeQuery("select * from course");
			
			System.out.println("--------------Courses---------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		
		FetchCourseData f1= new FetchCourseData();
		f1.fetchCourseDetails();
		
	}

}
