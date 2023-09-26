package com.labContainment;

class Car{
	
	private int modelNo;
	private String carName;
	private Machine machine;
	
	Car()
	{
		
	}
	
	Car(int modelNo,String carName,Machine machine)
	{
		this.modelNo=modelNo;
		this.carName=carName;
		this.machine=machine;
	}

	public int getModelNo()
	{
		return modelNo;
	}
	public void setModelNo(int modelNo)
	{
		this.modelNo=modelNo;
	}
	public String getCarName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName=carName;
	}
	public Machine getMachine()
	{
		return machine;
	}
	public void setMachine(Machine machine)
	{
		this.machine=machine;
	}

	public String toString() {
		return "Car ModelNo:" + modelNo + "\nCarName:" + carName + "\nMachine:" + machine;
	}
	
	
}
public class CarDetails {

	public static void main(String[] args) {
		Car c=new Car();
		c.setModelNo(101);
		c.setCarName("Suzuki");
		c.setMachine(new Machine());
		c.getMachine().setMachineType("Mannual");
		c.getMachine().setEngine(new Engine());
		c.getMachine().getEngine().setEngineType("Diesel");
		c.getMachine().getEngine().setPrice(50000);
		
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Car Details:"+"\nCar Model no:"+c.getModelNo());
		System.out.println("Car Name:"+c.getCarName());
		System.out.println("Machine Details:"+c.getMachine());
		System.out.println("Engine Details:"+c.getMachine().getEngine());
		System.out.println(c.getMachine().getEngine());
		
	}

}

	
	
	
	
	
	








