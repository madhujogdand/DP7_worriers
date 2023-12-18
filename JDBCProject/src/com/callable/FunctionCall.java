package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.jdbc1.DBConnectBike;

public class FunctionCall {
	static Scanner sc = new Scanner(System.in);
	public Connection con = null;
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	public FunctionCall() {
		con = DBConnectCompany.getConnect();
		System.out.println("Connection done....");
		try {
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void callTotalSalaryDeptWise()
	{
		System.out.println("Enter department id");
		int id=sc.nextInt();
		try
		{
			cst=con.prepareCall("{?=call totalSalaryIntoDept(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			
			boolean status =cst.execute();
			if(!status)
			{
				System.out.println("Total salary of department"+id+" is: "+cst.getInt(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void callAverageSalary()
	{
		System.out.println("Enter department name: ");
		String dname=sc.next();
		try
		{
		cst=con.prepareCall("{?= call avgSalary(?)}");
		cst.registerOutParameter(1, Types.VARCHAR);
		cst.setString(2, dname);
		
		boolean status=cst.execute();
		if(!status)
		{
			System.out.println("Average salary of department"+dname+" is: "+cst.getString(1));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		FunctionCall f=new FunctionCall();
		//f.callTotalSalaryDeptWise();
		f.callAverageSalary();

	}

}
