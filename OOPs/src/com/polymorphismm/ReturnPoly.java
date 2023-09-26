package com.polymorphismm;


		class Shape2
		{
		   int area(int side)
		   {
			   return (side*side);
		   }
		   
		   int area(int len,int br)
		   {
			   return(len*br);
		   }
		   // no effect if we change the return type if the method is overloaded
		   float area(float radius)
		   {
			   float pi=3.14f;
			   return (pi*radius*radius);
		   }
		}
		
		//we can not overload a method only by changing return type
          
//		   float area(int len,int br)
//		   {
//			   return(len*br);
//		   }
		public class ReturnPoly {

			public static void main(String[] args) {

		
			{
		        Shape2 square=new Shape2();
		        System.out.println("area of square is:"+square.area(7));
		         
		         
		         Shape2 rectangle=new Shape2();
		         int ar=rectangle.area(12,14);
		         System.out.println("Area of rectangle is:"+ar);
		       
		         
		         Shape2 circle=new Shape2();
		         System.out.println("Area of circle is:"+ circle.area(4.5f));
		        
			}


	}

}
