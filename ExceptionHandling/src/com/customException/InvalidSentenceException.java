package com.customException;

public class InvalidSentenceException extends RuntimeException {

	public InvalidSentenceException()
	{
		super();
	}
	public InvalidSentenceException(String message)
	{
		super(message);
	}
	
}
