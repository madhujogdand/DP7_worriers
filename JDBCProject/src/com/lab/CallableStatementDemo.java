package com.lab;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.callable.DBConnectCompany;

public class CallableStatementDemo {

	static Scanner sc = new Scanner(System.in);
	public Connection con = null;
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	public CallableStatementDemo() {
		con = DBConnectCompany.getConnect();
		System.out.println("Connection done....");
		try {
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getavgSalForEmp() {
		try {
			System.out.println("Enter department Id: ");
			int deptid = sc.nextInt();

			cst = con.prepareCall("{call avgSalForEmp(?)}");
			cst.setInt(1, deptid);

			boolean status = cst.execute();

			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getFloat(2));
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void getdeptWiseSalary() {
		System.out.println("Enter department Id: ");
		int id = sc.nextInt();
		try
		{

			cst = con.prepareCall("{call deptWiseSalary(?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.FLOAT);

			cst.execute();

			float f = cst.getFloat(2);
			System.out.println(f);

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
	public void getdeptWi() {
		System.out.println("Enter department Id: ");
		int id = sc.nextInt();
		try
		{

			cst = con.prepareCall("{call deptWiseSalary(?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(2, Types.FLOAT);

			cst.execute();

			float f = cst.getFloat(2);
			System.out.println(f);

		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
	public void getEmployeeDetailsById() {
		System.out.println("Enter employee Id: ");
		int id = sc.nextInt();

		try {
			cst = con.prepareCall("{call employeeDetails(?,?,?,?)}");
			cst.setInt(1, id);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.FLOAT);
			cst.registerOutParameter(4, Types.DATE);

			boolean status = cst.execute();

			if (status) {
				rs = cst.getResultSet();
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3) + " " + rs.getDate(4));
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CallableStatementDemo cs = new CallableStatementDemo();
		 cs.getavgSalForEmp();
		cs.getdeptWiseSalary();
		 cs.getEmployeeDetailsById();

	}

}
