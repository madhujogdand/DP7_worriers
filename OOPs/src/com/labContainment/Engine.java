package com.labContainment;

class Engine {
	
	private String engineType;
	private int price;
	
	Engine()
	{
		
	}

	public Engine(String engineType, int price)
	{
		this.engineType = engineType;
		this.price = price;
	}

	public String getEngineType()
	{
		return engineType;
	}

	public void setEngineType(String engineType)
	{
		this.engineType = engineType;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String toString() {
		return "EngineType=" + engineType + "\nprice=" + price;
	}

	
    
}
