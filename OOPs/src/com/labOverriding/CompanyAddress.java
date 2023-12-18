package com.labOverriding;

class Company
{
	void address()
	{
		System.out.println("Default address");
	}
}

class eBay extends Company
{
	void address()
	{
		System.out.println("eBay is a company");
	}
}
public class CompanyAddress {

	public static void main(String[] args) {
		Company c;
		c=new Company();
		c.address();
        
		System.out.println();
		
		c=new eBay();
		c.address();
		
		System.out.println();
		eBay e=new eBay();
		e.address();
				
	}

}
