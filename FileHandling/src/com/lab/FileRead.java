package com.lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		File f=new File("D:\\DP7 Worriers_2023\\MyFiles\\first.txt");
		
		char ch;
		int j;
		
		try
		{
			FileInputStream fis=new FileInputStream(f);
			while((j=fis.read())!=-1)
			{
				System.out.print((char)j);
			}
			fis.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
