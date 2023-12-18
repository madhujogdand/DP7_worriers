package com.files;

import java.io.File;
import java.io.IOException;

public class FileProperties {

	public static void main(String[] args) throws IOException {
	
		File f1=new File("D:\\DP7 Worriers_2023\\MyFiles\\first.txt");
		f1.createNewFile();
		
		//File f1=new File("D:\\DP7 Worriers_2023\\MyFiles");
		if(f1.exists())
		{
			if(f1.isFile())
			{
				System.out.println("Path: "+f1.getAbsolutePath());
				System.out.println("Length: "+f1.length());
				System.out.println("File Name: "+f1.getName());
				System.out.println("Write: "+f1.canWrite());
			}
			else if(f1.isDirectory())
			{
				System.out.println("It is a directory");
			}
			else
			{
				System.out.println("Unknown");
			}
		}
	}

}
