package com.enumdemo;

public enum MovieSeats {
	
	STANDARD(300),PREMIUN(450),RECLINER(600);
	int price;

	private MovieSeats(int price)
	{
		this.price=price;
	}
}
