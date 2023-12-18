package com.customException;

public class InvalidMarksEXception extends RuntimeException {

	public InvalidMarksEXception()
	{
		super();
	}
	public InvalidMarksEXception(String message)
	{
		super(message);
	}
}
