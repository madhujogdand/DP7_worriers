package com.labcodes;

public class Items {

	
		int ItemId;
		String ItemName;
		float Price;
		
		void display()
		{
			System.out.println(ItemId+" "+ItemName+" "+Price);
		}
		public static void main(String[] args) 
		{
			Items i1=new Items();
			i1.ItemId=101;
			i1.ItemName="Priyanka";
			i1.Price=89f;
			
			
			
			i1.display();
			


		}


	}


