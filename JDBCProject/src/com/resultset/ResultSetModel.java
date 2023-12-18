package com.resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import com.jdbc1.DBConnectBike;

public class ResultSetModel {

	static Scanner sc = new Scanner(System.in);
	Statement st;
	ResultSet rs;
	Connection con = null;

	ResultSetModel()
	{
		con = DBConnectBike.getConnect();
		System.out.println("----Connectin done-------");
		try
		{
          st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
          rs=st.executeQuery("select * from model");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
    public void fetchAllModels()
    {
    	try
    	{
    		rs.beforeFirst();
    		while(rs.next())
    		{
    			System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3));
    		}
    	}
    	catch (Exception e)
    	{
		  System.out.println(e);
		}
    }
    public void fetchAllModelsReverse()
    {
    	try
    	{
    		rs.afterLast();
    		while(rs.previous())
    		{
    			System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getInt(3));
    		}
    	}
    	catch (Exception e)
    	{
		  System.out.println(e);
		}
    }
    public void insertModel()
    {
    	try
    	{
    		rs.moveToInsertRow();

			System.out.println("Enter model id:");
			int mid = sc.nextInt();

			System.out.println("Enter the model name:");
			String mname = sc.next();

			System.out.println("Enter cost:");
			float cost = sc.nextFloat();
			
			rs.updateInt(1, mid);
			rs.updateString(2, mname);	
			rs.updateFloat(3, cost);
			
			rs.insertRow();
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    public void deleteModelById()
    {
    	System.out.println("Enter model id to be deleted:");
    	int mid=sc.nextInt();
    	
    	try
    	{
    		rs.beforeFirst();
    		while(rs.next())
    		{
    			if(rs.getInt(1)==mid)
    			{
    				rs.deleteRow();
    			}
    		}

    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    public void UpdateCostOfModel()
    {
    	System.out.println("Enter model name to be updated:");
    	String mname=sc.next();
    	
    	try
    	{
    		rs.beforeFirst();
    		while(rs.next())
    		{
    			if(rs.getString(2).equals(mname))
    			{
    				System.out.println("Old cost: "+rs.getFloat(3));
    				System.out.println("Enter new cost: ");
    				float cost=sc.nextFloat();
    				
    				rs.updateFloat(3, cost);
    				rs.updateRow();
    			}
    		}

    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) {
      ResultSetModel rs=new ResultSetModel();
      System.out.println("---------------------------------------------");
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Fetch Model data");
			System.out.println("2. Insert new Course");
			System.out.println("3. Update cost of model");
			System.out.println("4. Fetch all model reverse");
			System.out.println("5. Delete course by name");
			System.out.println("6. Exit");

			System.out.println("===========================================");

			System.out.println("Enetr your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				 rs.fetchAllModels();
				break;
			case 2:
				rs.insertModel();
				break;
			case 3:
				rs.UpdateCostOfModel();
				break;
			case 4:
				rs.fetchAllModelsReverse();
				break;
			case 5:
				rs.deleteModelById();
				break;			
			case 6:
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
