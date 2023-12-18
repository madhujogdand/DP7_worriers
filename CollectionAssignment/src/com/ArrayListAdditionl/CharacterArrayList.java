package com.ArrayListAdditionl;

import java.util.ArrayList;

/*5.Create arraylist of characters.
 *  Remove duplicate characters from the list.
 *   E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}*/
public class CharacterArrayList {

	public static void main(String[] args) {
	  ArrayList<Character> al=new ArrayList<>();
	  
	  al.add('d');
	  al.add('g');
	  al.add('h');
	  al.add('d');
	  al.add('d');
	  al.add('h');
	  al.add('g');
	  
	  System.out.println(al);
	  
	 // al.remove();

	}

}
