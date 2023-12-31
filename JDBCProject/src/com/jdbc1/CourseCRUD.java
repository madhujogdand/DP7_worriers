package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCRUD {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc = new Scanner(System.in);

	public CourseCRUD() {
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from course");

			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertCourse() {
		System.out.println("Enter course id:");
		int cid = sc.nextInt();

		System.out.println("Enter the course name:");
		String cname = sc.next();

		System.out.println("Enter duration(in months):");
		String duration = sc.next();

		System.out.println("Enter fees:");
		float fees = sc.nextFloat();

		try {
			pst = con.prepareStatement("insert into course values(?,?,?,?,?)");
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setString(3, duration);
			pst.setFloat(4, fees);
			pst.setInt(5, 0);

			int noOfRowsInserted = pst.executeUpdate();

			if (noOfRowsInserted > 0) {
				System.out.println("Course added.....");
			} else {
				System.out.println("Error in course....");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// delete using prepared statement
	public void deleteCourse() {
		System.out.println("Enter the course id to be deleted:");
		int cid = sc.nextInt();

		try {
			pst = con.prepareStatement("delete from course where cid=?");
			pst.setInt(1, cid);

			int noOfRowsDeleted = pst.executeUpdate();

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + cid + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Statement
	public void deleteCourse2() {
		System.out.println("Enter the course id to be deleted:");
		int cid = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where cid=" + cid + ";");

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + cid + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteCourseByName() {
		System.out.println("Enter the course name to be deleted:");
		String cname = sc.next();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where cname='" + cname + "';");

			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + cname + " is deleted");
				fetchCourseDetails();
			} else {
				System.out.println("Error in deleting course...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public boolean searchCourseById(int cid) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from course where cid=?");
			pst.setInt(1, cid);

			rs = pst.executeQuery();

			while (rs.next()) {
				isFound = true;
				System.out.println("Course id :" + rs.getInt(1));
				System.out.println("Course name:" + rs.getString(2));
				System.out.println("Duration:" + rs.getString(3));
				System.out.println("Fees:" + rs.getInt(4));
				System.out.println("Number of students:" + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;

	}

	public void updateCourseFees() {
		System.out.println("Enter course id whose fees is to updated:");
		int cid = sc.nextInt();

		if (searchCourseById(cid)) {
			System.out.println("Ente the new fees:");
			float fees = sc.nextFloat();

			try {
				pst = con.prepareStatement("update course set fees=? where cid=?");
				pst.setFloat(1, fees);
				pst.setInt(2, cid);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Course updated .....");
					searchCourseById(cid);
				} else {
					System.out.println("Error in updating course.........");
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			System.out.println("Course " + cid + " not found..");
		}

	}

	public static void main(String[] args) {

		CourseCRUD f1 = new CourseCRUD();
		// f1.fetchCourseDetails();
		// f1.insertCourse();
		// f1.deleteCourse();
		// f1.deleteCourse2();
		// f1.deleteCourseByName();
		// f1.searchCourseById
		// f1.updateCourseFees();
		System.out.println("---------------------------------------------");
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Fetch Course data");
			System.out.println("2. Insert new Course");
			System.out.println("3. Update Course fees");
			System.out.println("4. Delete courseby id");
			System.out.println("5. Delete course by name");
			System.out.println("6. search course by id");
			System.out.println("7. Exit");

			System.out.println("===========================================");

			System.out.println("Enetr your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				 f1.fetchCourseDetails();
				break;
			case 2:
				f1.insertCourse();
				break;
			case 3:
				f1.updateCourseFees();
				break;
			case 4:
				f1.deleteCourse2();
				break;
			case 5:
				f1.deleteCourseByName();
				break;
			case 6:
				System.out.println("Enter the course id to be searched: ");
				int id = sc.nextInt();
				f1.searchCourseById(id);
				break;
			case 7:
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
