package com.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamDemo {

	public void writeData(File f) {
		try
		{
          if(!f.exists())
          {
        	  f.createNewFile();
          }
          
          DataOutputStream dout=new DataOutputStream(new FileOutputStream(f));
          dout.writeInt(23);
          dout.writeUTF("Madhulika Gore");
          dout.writeFloat(90.5f);
          
          System.out.println("Student added....");
          dout.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void readData(File f) {
		try
		{
          if(f.exists())
          {
        	  DataInputStream din=new DataInputStream(new FileInputStream(f));
        	  System.out.println("Roll No: "+din.readInt());
        	  System.out.println("Name: "+din.readUTF());
        	  System.out.println("Marks: "+din.readFloat());
        	  
        	  din.close();
         
          }
          else
          {
        	  System.out.println("File does not exist");
          }
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {

		DataInputOutputStreamDemo obj = new DataInputOutputStreamDemo();

		File f1 = new File("D:\\DP7 Worriers_2023\\MyFiles\\Dataio.txt");
         obj.writeData(f1);
         obj.readData(f1);
	}

}
