package com.lab;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderUsingReader  {
	
	public static void main(String[] args)throws IOException {
		FileReader fr=null;
		char ch;
		
			fr=new FileReader("D:\\DP7 Worriers_2023\\MyFiles\\first.txt");
			int temp;
			while((temp=fr.read())!=-1)
			{
				System.out.print((char)temp);
			}
		
//			if(fr!=null)
//			{
//				fr.close;
//			}
		}

	}


