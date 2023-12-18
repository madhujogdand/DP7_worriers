package com.enumassignment;

public enum Level{ LOW(1),MEDIUM(5),HIGH(10);
	public int value;
	Level(int value){//constructor
		this.value =value;
	}
	
	public int getValue() {
		return value;
	}
}

