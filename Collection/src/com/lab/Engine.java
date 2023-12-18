package com.lab;

public class Engine {
	private int engineNo;
	private String engineType;

	public Engine() {

	}

	public Engine(int engineNo, String engineType) {
		this.engineNo = engineNo;
		this.engineType = engineType;
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", engineType=" + engineType + "]";
	}

}
