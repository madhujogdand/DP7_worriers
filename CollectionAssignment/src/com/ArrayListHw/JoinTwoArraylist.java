package com.ArrayListHw;
/*10.WAP to join two ArrayLists*/
import java.util.ArrayList;

public class JoinTwoArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(67);
		al.add(56);
		al.add(87);
		al.add(34);
		al.add(65);

		System.out.println(al);
		ArrayList<Integer> al1 = new ArrayList<>();

		al1.add(67);
		al1.add(65);
		al1.add(77);
		al1.add(90);
		al1.add(89);

		System.out.println(al1);
		
		for(int i=0;i<al1.size();i++)
		{
			al.add(al1.get(i));
		}
         System.out.println("After joining:"+al);
         ArrayList<String> al2 = new ArrayList<>();

 		al2.add("Jaya");
 		al2.add("Shraddha");
 		al2.add("Salony");
 		al2.add("Neha");
 		al2.add("Reva");

 		System.out.println(al2);
 		ArrayList<String> al3 = new ArrayList<>();

 		al3.add("Puja");
 		al3.add("Rani");
 		al3.add("Maya");
 		al3.add("Supriya");
 		al3.add("Vishakha");

 		System.out.println(al3);
 		
 		for(int i=0;i<al3.size();i++)
 		{
 			al2.add(al3.get(i));
 		}
          System.out.println("After joining:"+al2);
	}

}
