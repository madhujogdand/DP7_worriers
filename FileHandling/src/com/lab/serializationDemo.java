package com.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.serializable.student;

public class serializationDemo {

	public static void main(String[] args) {
		student stud=new student(1,"Radha",78);
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\DP7 Worriers_2023\\MyFiles\\student.txt");
		    ObjectOutputStream oos=new ObjectOutputStream(fos);
		    oos.writeObject(stud);
		    System.out.print(stud);
		    oos.close();
		    fos.close();
		    System.out.println("Serialization complete");
		
		}
		catch (Exception e) {
			System.out.println("Error occurred");
		}
		try
		{
			FileInputStream fis=new FileInputStream("D:\\DP7 Worriers_2023\\MyFiles\\student.txt");
		    ObjectInputStream ois=new ObjectInputStream(fis);
		    student stud1=(student)ois.readObject();
		    System.out.print(stud1);
		    ois.close();
		    fis.close();
		    System.out.println("DeSerialization complete");
		
		}
		catch (Exception e) {
			System.out.println("Error occurred");
		}

	}

}
