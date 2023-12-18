package com.ArrayListCW;

import java.util.ArrayList;

/*8.WAP to remove element from ArrayList
9.WAP to remove all elements from ArrayList
10.WAP to retain all elements from ArrayList
11.WAP to know how many elements in ArrayList
12.WAP to test an ArrayList is empty or not
13.WAP to empty ArrayList
14.	WAP to search an element from ArrayList
15.WAP to search the specified collection in this collection
17.	WAP to insert an element into the ArrayList at the first position
23.	WAP to replace the second element of an ArrayList with the specified element
*/
public class MethodsOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		 
		System.out.println(al);//13
		  System.out.println("-------------------------");
        
		  System.out.println(al.isEmpty());//12
         System.out.println("-------------------------");
         
         al.add("Java");
         al.add("C++");
         al.add("SpringBoot");
         al.add(".net");
         al.add("Html");
         
         System.out.println(al);
         System.out.println("-------------------------");
         
         ArrayList<String> al2=new ArrayList<>();
 		
         al2.add("Java");
         al2.add("C");
         al2.add("SpringBoot");
                
         System.out.println(al2);
         System.out.println("-------------------------");
        
         System.out.println(al.contains(".net"));//14
         System.out.println("----------------------------");
         
         System.out.println(al2.set(1, "Python"));//17
         System.out.println(al2);
         System.out.println("--------------------------------------");
        
         System.out.println(al.size());//11
         System.out.println("-------------------------");
         
         System.out.println(al2.set(2, "C"));//23
         System.out.println(al);
         System.out.println("---------------------------------");
        
         System.out.println(al.containsAll(al2));//15
         System.out.println(al);
         System.out.println("-------------------------");
       
         System.out.println(al.remove(1));//8
         System.out.println(al);
         System.out.println("-------------------------");
        
         System.out.println(al.removeAll(al2));//9
         System.out.println(al);
         System.out.println("-------------------------");
        
         System.out.println(al.retainAll(al2));//10
	     System.out.println(al);
	     System.out.println("-------------------------");
	     
	}

}
