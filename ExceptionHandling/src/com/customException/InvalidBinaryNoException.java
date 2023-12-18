package com.customException;

public class InvalidBinaryNoException extends RuntimeException {

	public InvalidBinaryNoException()
	{
		super();
	}
	public InvalidBinaryNoException(String message)
	{
		super(message);
	}
}
