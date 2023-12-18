package com.CAArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*34. Reverse an arraylist of 10 integers.
 * 39. Iterate through linked list using descending iterator.
 * 40. Create linked list of 10 integers. Add a new element at 4th
position.
*/
public class Q34 {

	public static void main(String[] args) {
		
      ArrayList<Integer> al=new ArrayList<>();
    
      for(int i=0;i<=10;i++)
      {
    	  al.add(i);
      }
      System.out.println(al);
      
      Collections.reverse(al);
      
      System.out.println(al);
     
      System.out.println("==========================================");
      
      //Q40
      LinkedList<Integer> lst=new LinkedList<Integer>();
	
      for(int i=0;i<=10;i++)
      {
    	  lst.add(i);
      }
	  System.out.println(lst);
	  
	  lst.add(3, 11);
	  
	  System.out.println(lst);
	  
	  
	
	  
	  
	}

}
