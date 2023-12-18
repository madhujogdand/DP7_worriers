package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedureCall {
	static Scanner sc = new Scanner(System.in);
	public Connection con = null;
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	public StoredProcedureCall() {
		con = DBConnectCompany.getConnect();
		System.out.println("Connection done....");
		try {
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void getEmployeeDetails()
	{
		try
		{
			cst=con.prepareCall("{call empDetails}");
			boolean status=cst.execute();
			
			if(status)
			{
				rs=cst.getResultSet();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" -- "+rs.getString(2)+" -- "+rs.getString(3)+" -- "+rs.getFloat(4));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getEmployeeDetailsById()
	{
		System.out.println("Enter employee Id: ");
		int id=sc.nextInt();
		
		try
		{
		  cst=con.prepareCall("{call employeeDetails(?,?,?,?)}");
		  cst.setInt(1, id);
		  cst.registerOutParameter(1, Types.INTEGER);
		  cst.registerOutParameter(2, Types.VARCHAR);
		  cst.registerOutParameter(3, Types.FLOAT);
		  cst.registerOutParameter(4, Types.DATE);
		  
		  boolean status=cst.execute();
		  
		  if(status)
		  {
			  rs=cst.getResultSet();
			  while(rs.next())
			  {
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getDate(4));
			  }

		  }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	StoredProcedureCall s=new StoredProcedureCall();
        s.getEmployeeDetails();
        s.getEmployeeDetailsById();
  
	}

}
