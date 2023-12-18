package com.DaoImpl;

import java.util.Scanner;

import com.Dao.itemDetails;
import com.pojo.Item;

public class ItemImplementation implements itemDetails {
	Scanner sc = new Scanner(System.in);
	Item i[] = new Item[10];
	int id;
	String name;
	float price;
	int count = 0;

	@Override
	public void addItem() {
		System.out.println("Add Item");
		System.out.println("Enter number of items you want to add:");
		int item = sc.nextInt();
		for (int j = 0; j < item; j++) {
			System.out.println("Enter item id:");
			id = sc.nextInt();
			System.out.println("Enter item name:");
			name = sc.next();
			System.out.println("Enter item price:");
			price = sc.nextFloat();
			i[count] = new Item(id, name, price);
			count++;
		}
		System.out.println("Item added successfully");
	}

	@Override
	public void updateItem() {
		System.out.println("Update Item");
		System.out.println("Enter item id you want to update:");
		int id = sc.nextInt();
		for (int j = 0; j < count; j++) {
			if (id == i[j].getId() && i[j] != null) {
				System.out.println("Enter Item price:");
				price = sc.nextFloat();
				i[j].setPrice(price);
			}
		}
		System.out.println("Item updated successfully");
	}

	@Override
	public void showItem() {
		for (int j = 0; j < count; j++) {
			if (i[j] != null) {
				System.out.println(i[j]);
			}
		}

	}

	@Override
	public void deleteItem() {
		System.out.println("Delete Item");
		System.out.println("Enter item id you want to delete:");
		int id = sc.nextInt();
		for (int j = 0; j < count; j++) {
			if (id == i[j].getId()) {
				i[j] = null;
			}
		}
		System.out.println("Item deleted Successfully");
	}

	@Override
	public void searchItem() {
		System.out.println("Search Item");
		System.out.println("Enter item id you want to search:");
		int id = sc.nextInt();
		int flag = 0;
		int j;
		for (j = 0; j < count; j++) {
			if (id == i[j].getId() && i[j] != null) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Given item available");
			System.out.println(i[j]);
		} else {
			System.out.println("Given item not available");
		}
	}

}
