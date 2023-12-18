package com.collectionListTest;

import java.util.ArrayList;
import java.util.Arrays;

/*9.Consider an ArrayList of Movie  [2M]
Movie has (int movieid, String  moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies
*/
public class Q9 {

	public static void main(String[] args) {
		
		ArrayList<Movie> al=new ArrayList<>();
		
		al.add(new Movie(1,"Bagban",Arrays.asList("Amitabh Bachhan","Hema malini","Salman khan")));
		al.add(new Movie(2,"BAB",Arrays.asList("Amitabh Bachhan","Abhishekh bachhan","Aishwarya ray")));
		al.add(new Movie(3,"KKKG",Arrays.asList("Amitabh Bachhan","Jaya bachhan","Shahrukh khan")));
	
		System.out.println(al);
	    System.out.println("==================================================================================================");
	    int count=0;
	    for(Movie m:al)
		{
	    	if(m.getActors().contains("Amitabh Bachhan"))
	    	{
	    		count++;
	    	}
	       
		}
	    System.out.println("Movie count is:"+count);
		System.out.println("==================================================================================================");
		
      
        
		
		
	
	}

}
