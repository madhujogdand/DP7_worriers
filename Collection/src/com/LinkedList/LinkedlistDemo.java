package com.LinkedList;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<String> itcomp=new LinkedList<>();

		//System.out.println(itcomp.getFirst());//throws NoSuchElementException
	    System.out.println(itcomp.peek());//null
	    
	  //System.out.println(itcomp.remove());//throws NoSuchElementException
	    System.out.println(itcomp.poll());//null
	    
	    //add method
         itcomp.add("HCL");
         itcomp.add("TCS");//add at the last
         itcomp.add(null);
         itcomp.add("TCS");
        
	     System.out.println(itcomp);
	
	     itcomp.addFirst("infosys");
	     System.out.println(itcomp);
	     
	     itcomp.add(1, "dell");
	     System.out.println(itcomp);
	     
	     //retrieve
	     System.out.println("---------------");
	     System.out.println("element: "+itcomp.element());
	     System.out.println("element: "+itcomp.getFirst());
	     System.out.println("element: "+itcomp.peek());
	     System.out.println("element: "+itcomp.peekFirst());
	     
	     System.out.println(itcomp.get(2));
	     System.out.println("From last: "+itcomp.getLast());
	     System.out.println("From last: "+itcomp.peekLast());
	     
	     //deletion
	     System.out.println("-----------");
	     System.out.println(itcomp.poll());
	    
	     //pollfirst, remove, removefirst
	     System.out.println(itcomp);
	     System.out.println(itcomp.remove(2));
	     System.out.println(itcomp.remove("HCL"));
	     System.out.println(itcomp);
	     
	     System.out.println(itcomp.removeLast());
	     System.out.println(itcomp.removeLastOccurrence("HCL"));

	     System.out.println("---------------------------------");
	     
	     //pollLast
	     itcomp.addFirst("Capgemini");//return void
         System.out.println(itcomp.offerFirst("Genpact"));//return boolean
         System.out.println(itcomp);
	
	}

}
