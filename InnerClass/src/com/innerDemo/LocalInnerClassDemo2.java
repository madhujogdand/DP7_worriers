package com.innerDemo;

class Mall
{
	private String mallName="Pacific";
	private String loc="pune";
	
	void Shopping()
	{
		class Cart
		{
			String item;
			float price;
			static double bill=0;
			
			public void addItem(String item,float price)
			{
				this.item=item;
				this.price=price;
				
				System.out.println(this.item+" "+this.price);
				bill+=price;
			}
			public void displayBill()
			{
				System.out.println("---------------------------------------");
				System.out.println("Total Bill:"+bill);
				System.out.println("---------------------------------------");
                System.out.println("Thanks for shopping at:"+mallName+" "+loc);
			}
		}
		Cart c1=new Cart();
		c1.addItem("Laptop",35000);
		c1.addItem("Mobile",23000);
		c1.addItem("Pendrive",450.8f);
		
		c1.displayBill();
	}
}

public class LocalInnerClassDemo2 {

	public static void main(String[] args) {
		Mall cust1=new Mall();
		cust1.Shopping();

	}

}
