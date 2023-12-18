package com.lab;

public class LengthLess {

	public static void main(String[] args) {
		String sarr[] = { "c", "java", "angular", "python" };

		for (int i = 0; i < sarr.length; i++)
		{
			try
			{
				if (sarr[i].length() < 3)
				{
					throw new InvalidStringException(sarr[i] + " String length is greater than 3");
				}
				System.out.println("String length: " + sarr[i]);
			}
			catch (InvalidStringException e)
			{
				//System.out.println(e);
				System.out.println(e.getMessage());
				//e.printStackTrace();
				//System.out.println(e.toString());
			}
		}
	}

}
