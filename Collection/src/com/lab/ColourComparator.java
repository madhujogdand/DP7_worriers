package com.lab;

import java.util.Comparator;

public class ColourComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		
	   return c1.getColor().compareTo(c2.getColor());
	}


		

	

}
