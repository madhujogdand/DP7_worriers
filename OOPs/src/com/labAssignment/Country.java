 package com.labAssignment;

class Country {
	private int cId;
	private String cName;

	Country() {

	}

	Country(int cId, String cName) {
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String toString()
	{
		return "\nCountry Id:" + cId + "\nCountry Name:" + cName;
	}
	

}
