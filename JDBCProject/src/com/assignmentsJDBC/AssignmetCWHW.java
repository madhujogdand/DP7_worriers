package com.assignmentsJDBC;

import java.sql.CallableStatement;
/*Assignments CW
1.	WAP using JDBC to select and print all country names.
2.	WAP using JDBC to select and print employee names along with their manager names.
3.	WAP using JDBC to execute Stored Procedure using Callable Statement.
4.	Write a program to execute update queries in a batch using commit and rollback.
Assignments HW
1.	WAP using JDBC to delete employees if their salaries are equal to 0.
2.	WAP using JDBC to transfer employees from manager with id 10 to manager with id 1. Delete employee with id 10. Do all using commit and rollback.
*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.jdbcStory.Assignment.DBConnectCompany;

public class AssignmetCWHW {
	static Connection conn = null;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	CallableStatement cst;

	public AssignmetCWHW() {
		conn = DBConnectCompany.getConnect();
		System.out.println("Connection done...");
	}

	public static void question1() {
		System.out.println("Q.1 WAP using JDBC to select and print all country names.");
		try {
			pstmt = conn.prepareStatement("select country_name from countries;");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("country name: " + rs.getString(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void question2() {
		System.out.println("Q.2 WAP using JDBC to select and print employee names along with their manager names.");
		try {
			pstmt = conn.prepareStatement(
					" select m.first_name, e.first_name\r\n" + "            from employees e join employees m\r\n"
							+ "            on m.MANAGER_ID=e.EMPLOYEE_ID;");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("Manager name: " + rs.getString(1) + "--->" + " Employee name: " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getEmployeeDetailsById() {
		System.out.println("Q.3 WAP using JDBC to execute Stored Procedure using Callable Statement.");
		System.out.println("Enter employee Id: ");
		int id = sc.nextInt();

		try {
			cst = conn.prepareCall("{call employeeDetails(?,?,?,?)}");
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
		AssignmetCWHW a1 = new AssignmetCWHW();
		a1.question1();
		System.out.println("--------------------------------------------");
		a1.question2();
		System.out.println("--------------------------------------------");
		a1.getEmployeeDetailsById();
		System.out.println("--------------------------------------------");
		
	}

}
