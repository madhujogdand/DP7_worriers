package com.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc1.DBConnect;

public class ResultSetDemo {

	static Scanner sc=new Scanner(System.in);
	Statement st;
	ResultSet rs;
	
	Connection con=null;
	
	ResultSetDemo()
	{
		con=DBConnect.getConnect();
		try
		{
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE );
			rs=st.executeQuery("select * from course");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void fetchAllCourses()
	{
		try
		{
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void fetchAllCoursesReverse()
	{
		try
		{
			rs.afterLast();
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertCourse()
	{
		try
		{
			rs.moveToInsertRow();
			
			System.out.println("Enter course id:");
			int cid = sc.nextInt();

			System.out.println("Enter the course name:");
			String cname = sc.next();

			System.out.println("Enter duration(in months):");
			String duration = sc.next();

			System.out.println("Enter fees:");
			float fees = sc.nextFloat();
			
			rs.updateInt(1, cid);
			rs.updateString(2, cname);
			rs.updateString(3, duration);
			rs.updateFloat(4, fees);
			
			rs.insertRow();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void deleteCourseByName()
	{
		System.out.println("Enter course id to be deleted");
		int id=sc.nextInt();
		
		try
		{
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					rs.deleteRow();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void updateCourseFees()
	{
		System.out.println("Enter course name to be updated");
		String cname=sc.next();
		
		try
		{
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getString(2).equals(cname))
				{
					System.out.println("Old fees: "+rs.getFloat(4));
					System.out.println("Enter new fees");
					float fees=sc.nextFloat();
					
					rs.updateFloat(4, fees);
					rs.updateRow();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	  ResultSetDemo r=new ResultSetDemo();
	  System.out.println("---------------------------------------------");
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Fetch Course data");
			System.out.println("2. Insert new Course");
			System.out.println("3. Update Course fees");
			System.out.println("4. Fetch all courses reverse");
			System.out.println("5. Delete course by name");
			System.out.println("6. Exit");

			System.out.println("===========================================");

			System.out.println("Enetr your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				 r.fetchAllCourses();
				break;
			case 2:
				r.insertCourse();
				break;
			case 3:
				r.updateCourseFees();
				break;
			case 4:
				r.fetchAllCoursesReverse();
				break;
			case 5:
				r.deleteCourseByName();
				break;			
			case 6:
				System.out.println("------Closing the course application-----");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
			System.out.println("Do you want to perform more operatrions (Y - yes/ N - No)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'N' || ch == 'y' || ch == 'n');
	}

}
