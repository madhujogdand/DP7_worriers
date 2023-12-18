package com.CASet;

import java.util.HashSet;

/*47. Convert hashset of strings to string array.
 * 52. Convert set to array.
*/
public class Q47 {

	public static void main(String[] args) {
	
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("pear");
		hs.add("apple");
		hs.add("banana");
		
		System.out.println(hs);
		
		String[] st=new String[hs.size()];
		
		hs.toArray(st);
		
		for(String s:st)
		{
			System.out.println(s);
		}

	}

}
