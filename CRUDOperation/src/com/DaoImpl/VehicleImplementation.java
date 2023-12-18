package com.DaoImpl;

import java.util.Scanner;

import com.Dao.vehicleDetails;
import com.pojo.Vehicle;

public class VehicleImplementation implements vehicleDetails {

	Scanner sc = new Scanner(System.in);
	Vehicle v[] = new Vehicle[10];
	int id;
	String name;
	float price;
	int count = 0;

	@Override
	public void addVehicle() {
		System.out.println("Add Vehicle");
		System.out.println("Enter number of vehicles you want to add");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("Enter vehicle id:");
			id = sc.nextInt();
			System.out.println("Enter vehicle name:");
			name = sc.next();
			System.out.println("Enter vehicle price:");
			price = sc.nextFloat();
			v[count] = new Vehicle(id, name, price);
			count++;
		}
	}

	@Override
	public void updateVehicle() {
		System.out.println("Update Vehicle");
		System.out.println("Enter the vehicle id you want to update:");
		int id = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (id == v[i].getId() && v[i] != null) {
				System.out.println("Enter the price of vehicle");
				price = sc.nextFloat();
				v[i].setPrice(price);
			}
		}
		System.out.println("Vehicle updated succesfully");
		System.out.println("===================================================");
	}

	@Override
	public void showVehicle() {
		for (int i = 0; i < count; i++) {
			if (v[i] != null) {
				System.out.println(v[i]);
			}
		}
	}

	@Override
	public void deleteVehicle() {
		System.out.println("Delete vehicle");
		System.out.println("Enter vehicle id you want to delete");
		int id = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (id == v[i].getId()) {
				v[i] = null;
			}
		}
		System.out.println("Deleted vehicle succesfully");
		System.out.println("===================================================");

	}

	@Override
	public boolean searchVehicle() {
		System.out.println("Search vehicle");
		System.out.println("Enter vehicle id you want to search");
		int id = sc.nextInt();
		int i;
		boolean flag = false;
		for (i = 0; i < count; i++) {

			if (v[i] != null && v[i].getId() == id) {

				flag = true;
				break;

			}
		}

		return flag;

	}
}
