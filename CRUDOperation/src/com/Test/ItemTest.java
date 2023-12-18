package com.Test;

import java.util.Scanner;

import com.Dao.itemDetails;
import com.DaoImpl.ItemImplementation;

public class ItemTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		itemDetails id=new ItemImplementation();
		
		do
		{
			System.out.println("1 Add Item");
			System.out.println("2 Update Item");
			System.out.println("3 Show Item Information");
			System.out.println("4 Delete Item");
			System.out.println("5 Search Item");
			System.out.println("6 Exit");
			
			System.out.println("-----------------------------------------");
			System.out.println("Welcome to the store");
			
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				id.addItem();
				break;
			case 2:
				id.updateItem();
				break;
			case 3:
				id.showItem();
				break;
			case 4:
				id.deleteItem();
				break;
			case 5:
				id.searchItem();
				break;
			case 6:
				System.exit(0);
			}
			
		}while(true);
		
    
	}

}
