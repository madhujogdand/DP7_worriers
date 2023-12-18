package com.hashset;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		HashSet<Item> hs=new HashSet<>();
		
		hs.add(new Item(1,"Sugar",34));
		hs.add(new Item(2,"Flour",120));
		hs.add(new Item(3,"Chocolate",50));
		hs.add(new Item(4,"Ghee",245));
		hs.add(new Item(5,"coldrink",25));
		hs.add(new Item(1,"Sugar",34));
		hs.add(new Item(7,"chips",75));
			
		for(Item i:hs)
		{
			System.out.println(i);
		}

	}

}
