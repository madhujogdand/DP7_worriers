package com.CAMap;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*74. Create linkedhashmap<String, int> Take 5 values from user. */
public class Q74 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String, Integer>();
		
        for(int i=1;i<=5;i++)
        {
        	
        	System.out.println("Enter key:"+i);
        	String key=sc.next();
        	

        	System.out.println("Enter value:"+i);
        	int value=sc.nextInt();
        	
        	lhm.put(key, value);
        }
        
        System.out.println(lhm);

	}

}
