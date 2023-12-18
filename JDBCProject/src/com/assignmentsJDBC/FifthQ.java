package com.assignmentsJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcStory.Assignment.DBConnectCompany;

//1. WAP using JDBC to delete employees if their salaries are equal to 0.
public class FifthQ {
	static Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public FifthQ() {
		con = DBConnectCompany.getConnect();
		System.out.println("Connection done.....");
		try {
			pst = con.prepareStatement("delete from employees where SALARY=0");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void deleteEmp() {
		try {
			int i = pst.executeUpdate();
			System.out.println(i);
			System.out.println("---------------------------------Employees----------------------------------");
			pst = con.prepareStatement("select * from employees");
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("empId:" + rs.getInt(1)+" -- " + "firstName: " +rs.getString(2)+" -- " + "lastName: "
						+ rs.getString(3)+" -- " + "email: " + rs.getString(4)+" -- " + "phoneNum: " + rs.getString(5)+" -- " + "hireDate: "
						+ rs.getDate(6)+" -- " + "job_id: " + rs.getString(7)+" -- " + "salary: " + rs.getDouble(8)+" -- "
						+ "commission_pct: " + rs.getDouble(9)+" -- " + "manager_id: " + rs.getDouble(10)+" -- " + "department_id: "
						+ rs.getDouble(11));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FifthQ f1 = new FifthQ();
		f1.deleteEmp();
	}

}
