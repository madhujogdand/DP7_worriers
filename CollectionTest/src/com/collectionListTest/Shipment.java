package com.collectionListTest;

public class Shipment  {

	private int shipId;
	private String custName;
	private Address addr;
	private MyDate shipDate;
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shipment(int shipId, String custName, Address addr, MyDate shipDate) {
		super();
		this.shipId = shipId;
		this.custName = custName;
		this.addr = addr;
		this.shipDate = shipDate;
	}
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public MyDate getShipDate() {
		return shipDate;
	}
	public void setShipDate(MyDate shipDate) {
		this.shipDate = shipDate;
	}
	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", custName=" + custName + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}
//	@Override
//	public int compareTo(Shipment s) {
//		int cityComparison=(this.getAddr().getCity().compareTo(s.getAddr().getCity()));
//			if(cityComparison==0)
//			{
//				return this.getShipDate().comparTo(s.getShipDate())
//			}
//		return cityComparison;
//	}
	
	
}
