package com.Inheritance;
//4
public class Laptop {

	int  noOfUSBPort; 
	int processorSpeed;
	
//	Laptop( int noOfUSBPort,int processorSpeed)
//	{
//		this.noOfUSBPort=noOfUSBPort;
//		this.processorSpeed=processorSpeed;
//	}
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
    

	public String toString() {
		return "Laptop [noOfUSBPort=" + noOfUSBPort + ", processorSpeed=" + processorSpeed + "]";
	}

	public static void main(String[] args) {
	   Laptop l=new Laptop();
	   l.setNoOfUSBPort(4);
	   l.setProcessorSpeed(8);
       System.out.println(l);
	}

}
