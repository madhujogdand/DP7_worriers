package com.lambda1;

import java.util.ArrayList;

public class CollectionLambda {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Neha");
		a1.add("Priti");
		a1.add("Piu");
		
//		for(String s:a1)
//		{
//			System.out.println(s+"->"+s.length());
//		}
		
		a1.forEach(n->System.out.println(n+"->"+n.length()));
		a1.forEach((n)->System.out.println(n+"->"+n.toUpperCase()));
	}

}
