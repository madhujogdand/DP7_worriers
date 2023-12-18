package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public void copyContents(File s, File d)
	{
		try
		{
			if(s.exists())
			{
				d.createNewFile();
				FileInputStream fin=new FileInputStream(s);
				FileOutputStream fout=new FileOutputStream(d);
				
				int i=0;
				while((i=fin.read())!=-1)
				{
					fout.write(i);
				}
				System.out.println("File Copied...");
				fin.close();
				fout.close();
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	CopyFile f1=new CopyFile();
	
	File sf=new File("D:\\DP7 Worriers_2023\\MyFiles\\Bufferio.txt");
	File df=new File("D:\\DP7 Worriers_2023\\MyFiles\\CopyBuff.txt");
	
	f1.copyContents(sf, df);

	}

}
