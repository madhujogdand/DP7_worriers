package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDelete {

	public void writeData(File f)
	{
		try
		{
			if(f.exists())
			{
			   if(f.delete())
			   {
				   System.out.println(f.getName()+" is Deleted");
			   }
			   else
			   {
				   System.out.println("Error....");
			   }
			}
			else
			{
				System.out.println("file not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
	   
		FileDelete obj=new FileDelete();
	
	     File f1=new File("D:\\DP7 Worriers_2023\\MyFiles\\fileio1.txt");
	     obj.writeData(f1);     
	         
	
	}

}
