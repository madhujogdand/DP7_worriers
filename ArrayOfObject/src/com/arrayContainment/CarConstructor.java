package com.arrayContainment;

public class CarConstructor {

	static void countCarDiverwise( Car cr[],Driver dv[])
	{
		int count;
		for(Driver d:dv)
		{
			count=0;
			for(Car c:cr)
			{
				if(c.getD().equals(d))
				{
					count++;
				}
			}
			System.out.println(d+": "+count);
		}
	}
	static void showCarName(Car cr[])
	{
		for(Car c:cr)
		{
			System.out.println(c.getName());
		}
	}
	public static void main(String[] args) {
		Driver dv[]=new Driver[2];
		dv[0]=new Driver(101,"Sagar",27,20000);
		dv[1]=new Driver(102,"Satish",29,15000);
		
		Car cr[]=new Car[5];
		cr[0]=new Car("Creta",1500000,dv[0]);
		cr[1]=new Car("Swift DZire",700000,dv[1]);
		cr[2]=new Car("Wagnor",800000,dv[0]);
		cr[3]=new Car("Scorpio",1800000,dv[0]);
		
		cr[4]=new Car();
		cr[4].setName("Bolero");
		cr[4].setPrice(1300000);
		cr[4].setD(dv[1]);
		
		for(Car c:cr)
		{
			System.out.println(c);
		}
		System.out.println("-----------------------------------------------");
		countCarDiverwise(cr,dv);
		System.out.println("-----------------------------------------------");
		showCarName(cr);
	}

}
