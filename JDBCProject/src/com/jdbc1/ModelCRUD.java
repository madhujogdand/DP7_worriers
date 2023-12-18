package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCRUD {

	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;

	public ModelCRUD() {
		con = DBConnectBike.getConnect();
		System.out.println("Connection done....");
		try {
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchModelDetails() {
		try {
			rs = st.executeQuery("select * from model");
			System.out.println("-------Models------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertModel() {
		System.out.println("Enter model id");
		int model_id = sc.nextInt();

		System.out.println("Enter model name");
		String model_name = sc.next();

		System.out.println("Enter model cost");
		int cost = sc.nextInt();

		try {
			pst = con.prepareStatement("Insert into model values(?,?,?)");
			pst.setInt(1, model_id);
			pst.setString(2, model_name);
			pst.setInt(3, cost);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("New model added....");
			} else {
				System.out.println("Error in insertion...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// delete using prepared statement
	public void deleteModel() {
		System.out.println("Enter the model id to be deleted");
		int model_id = sc.nextInt();

		try {
			pst = con.prepareStatement("Delete from model where model_id=?");
			pst.setInt(1, model_id);

			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Model " + model_id + "is deleted");
				fetchModelDetails();
			} else {
				System.out.println("Error in deleting Model..........");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Statement
	public void deleteModel2() {
		System.out.println("Enter the model id to be deleted");
		int model_id = sc.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("Delete from model where model_id=" + model_id + ";");
			if (noOfRowsDeleted > 0) {
				System.out.println("Model " + model_id + " is deleted");
				fetchModelDetails();
			} else {
				System.out.println("Error in deleting Model..........");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// delete model by name
	public void deleteModelByName() {
		System.out.println("Enter the model name to be deleted");
		String model_name = sc.next();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from model where model_name='" +model_name+ "';");
			if (noOfRowsDeleted > 0) {
				System.out.println("Model " + model_name + " is deleted");
				fetchModelDetails();
			} else {
				System.out.println("Error in deleting Model..........");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// search model by id
	public boolean searchModelById(int model_id) {
		boolean isFound = false;
		try {
			pst = con.prepareStatement("select * from model where model_id=?");
			pst.setInt(1, model_id);

			rs = pst.executeQuery();
			while (rs.next()) {
				isFound = true;
				System.out.println("Model id: " + rs.getInt(1));
				System.out.println("Model name: " + rs.getString(2));
				System.out.println("Model fees: " + rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return isFound;
	}

	// update model cost
	public void updateModelCost() {
		System.out.println("Enter model id whose cost to be updated: ");
		int model_id = sc.nextInt();

		if (searchModelById(model_id)) {
			System.out.println("Enter new cost:");
			int cost = sc.nextInt();

			try {
				pst = con.prepareStatement("update model set cost=? where model_id=?");
				pst.setInt(1, cost);
				pst.setInt(2, model_id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Model cost updated.....");
					searchModelById(model_id);
				} else {
					System.out.println("Error in updating model cost....");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		} else {
			System.out.println("Model " + model_id + " not found.....");
		}

	}

	public static void main(String[] args) {
		ModelCRUD m = new ModelCRUD();
		// m.fetchModelDetails();
		// m.insertModel();
		// m.deleteModel();
		// m.deleteModel2();
		// m.deleteModelByName();
		// m.searchModelById(model_id);
		// m.updateModelCost();

		System.out.println("------------------------------------------");

		int choice;
		char ch;

		do {
			System.out.println("Which operation do you want to perform.....");
			System.out.println("1. Fetch model details");
			System.out.println("2. insert new model");
			System.out.println("3. Delete model by id");
			System.out.println("4. Delete model by name");
			System.out.println("5. Update model cost");
			System.out.println("6. Search model by id");
			System.out.println("7. Exit");

			System.out.println("============================================");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				m.fetchModelDetails();
				break;
			case 2:
				m.insertModel();
				break;
			case 3:
				m.deleteModel2();
				break;
			case 4:
				m.deleteModelByName();
				break;
			case 5:
				m.updateModelCost();
				break;
			case 6:
				System.out.println("Enter the model id to be searched: ");
				int model_id = sc.nextInt();
				m.searchModelById(model_id);
                break;
			case 7:
				System.out.println("------------Closing the model application-------------------");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
			}
			System.out.println("=======================================================");
			System.out.println("Do you want to perform more operations(y-yes/n-no)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y' || ch == 'N' || ch == 'n');

	}

}
