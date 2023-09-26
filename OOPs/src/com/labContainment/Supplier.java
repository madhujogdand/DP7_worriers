package com.labContainment;

public class Supplier {

	private int sId;
	private String name;
	private Item item;
	
	Supplier()
	{
		
	}
	
	Supplier(int sId, String name, Item item)
	{
		this.sId = sId;
		this.name = name;
		this.item = item;
	}

	public int getSId() {
		return sId;
	}

	public void setSId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Supplier sId=" + sId + "\nname=" + name + "\nitem=" + item;
	}
	
	
	
}
