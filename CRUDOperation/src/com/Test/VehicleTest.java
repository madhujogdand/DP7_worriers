package com.Test;

import java.util.Scanner;

import com.Dao.vehicleDetails;
import com.DaoImpl.VehicleImplementation;

public class VehicleTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		vehicleDetails vd=new VehicleImplementation();

	    do
	    {
	    	System.out.println("1 Add Vehicle");
	    	System.out.println("2 Update Vehicle");
	    	System.out.println("3 Show Vehicle information");
	    	System.out.println("4 Delete Vehicle");
	    	System.out.println("5 Search Vehicle");
	    	System.out.println("6 Exit");
	    	
	    	System.out.println("---------------------------------------------------");
	    	
	    	System.out.println("Enter your choice:");
	    	choice=sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    		vd.addVehicle();
	    		break;
	    	case 2:
	    		vd.updateVehicle();
	    		break;
	    	case 3:
	    		vd.showVehicle();
	    		break;
	    	case 4:
	    		vd.deleteVehicle();
	    		break;
	    	case 5:
	    		boolean flag=vd.searchVehicle();
	    		if (flag == true) {
					System.out.println("Given vehicle Available");
					
				} else {
					System.out.println("Given vehicle not available");
				}
	    		break;
	    	case 6:
	    		System.exit(0);
	    	
	    	}
	    	
	    }while(true);
	

	
	}

}
