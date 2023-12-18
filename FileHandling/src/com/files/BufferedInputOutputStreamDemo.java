package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputOutputStreamDemo {

	public void writeData(File f)
	{
		try
		{
			if (!f.exists())
			{
				f.createNewFile();
			}
			String data = "Welcome to java learning";
			FileOutputStream fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			byte[] arr = data.getBytes();
			fout.write(arr);
			System.out.println("Data added........");
			fout.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public void readData(File f)
	{
		try
		{
			if (f.exists())
			{

				//BufferedInputStream bin = new BufferedInputStream(new FileinputStream(fin));
				FileInputStream fin = new FileInputStream(f);
				BufferedInputStream bin = new BufferedInputStream(fin);
				int i = 0;
				while ((i = fin.read()) != -1) {
					System.out.print((char) i);
				}
				fin.close();
			}
			else
			{
				System.out.println("File doesnot exist....");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		BufferedInputOutputStreamDemo obj = new BufferedInputOutputStreamDemo();

		File f1 = new File("D:\\DP7 Worriers_2023\\MyFiles\\Bufferio.txt");
		obj.writeData(f1);
		obj.readData(f1);

	}

}
