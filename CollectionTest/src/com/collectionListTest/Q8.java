package com.collectionListTest;

import java.util.ArrayList;
import java.util.Collections;

/*8.Create List<Shipment>in which sorting is done according cities and if two order have same cities than according to shipment date(Ascending)
Shipment class (int shipId, String Cust_name, Address addr, MyDate shipDate)
Address class (String addr, String City, String State)
MyDate class  (int dd,mm,yy)
*/
public class Q8 {

	public static void main(String[] args) {
	
		ArrayList<Shipment> al=new ArrayList<Shipment>();
	
		al.add(new Shipment(1,"Neha",new Address("Hadapsar","pune","India"),new MyDate(15,9,2023)));
		al.add(new Shipment(2,"Madhu",new Address("AanandNagar","pune","India"),new MyDate(20,10,2023)));
		al.add(new Shipment(3,"Neha",new Address("Thane","Mumbai","India"),new MyDate(15,11,2023)));
		al.add(new Shipment(2,"Radha",new Address("WestSide","Hyderabad","India"),new MyDate(12,11,2023)));

		System.out.println(al);
		
		for(Shipment s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("==========================================================================");
		
		Collections.sort(al);
		
		for(Shipment s:al)
		{
			System.out.println(s);
		}
		
		
		
	}

}
