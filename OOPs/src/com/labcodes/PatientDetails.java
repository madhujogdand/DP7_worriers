package com.labcodes;

class Patient
{
	int pId;
	String pName;
	static String drName="Dr.Jayashree";
	static String hName="Aadhar";
	static int pCount=0;
	
	
	{
		pCount++;
	}
	
	Patient(int pId,String pName)
	{
		this.pId=pId;
		this.pName=pName;
	}
	
	public String toString()
	{
		return "Patient Id:"+pId+"\nPatient Name:"+pName;
	}
	
	
}
public class PatientDetails {

	public static void main(String[] args) {
		
		System.out.println("Hospital Name :"+Patient.hName);
		System.out.println("Doctor Name :"+Patient.drName);
		System.out.println();
		
		Patient p=new Patient(1,"Sushama");
	    System.out.println(p);
	    Patient p1=new Patient(2,"Priyanka");
	    System.out.println(p1);
	    Patient p2=new Patient(3,"Ashwini");
	    System.out.println(p2);
	    
	    System.out.println();
	    System.out.println("Patient visited:"+Patient.pCount);
		

	}

}
