package com.lab;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderUsingReader2  {
	
	public static void main(String[] args)throws IOException {
		FileReader fr=null;
		FileWriter fw=null;
		char ch;
		
			fr=new FileReader("D:\\DP7 Worriers_2023\\MyFiles\\first.txt");
			fw=new FileWriter("D:\\DP7 Worriers_2023\\MyFiles\\first1.txt");
			int temp;
			while((temp=fr.read())!=-1)
			{
				System.out.print((char)temp);
				fw.write(temp);
			}
		   if(fr!=null)
			   fr.close();
		   if(fw!=null)
			   fw.close();
          
		}

	}


