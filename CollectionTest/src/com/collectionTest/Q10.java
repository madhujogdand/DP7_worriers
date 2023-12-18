package com.collectionTest;
/*10. Sort arraylist of integers in reverse order of its natural 
sorting. [1M]
*/

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
public static void main(String[] args) {
	

	ArrayList<Integer> al=new ArrayList<>();
	
    al.add(4);
    al.add(5);
    al.add(2);
    al.add(3);
    al.add(1);
    
    System.out.println(al);
    
    Collections.sort(al, Collections.reverseOrder());
    
    System.out.println(al);
    
	
}	
	
}
