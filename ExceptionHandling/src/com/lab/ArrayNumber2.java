package com.lab;

import java.util.Arrays;

public class ArrayNumber2 {

	static void checkNumbers(String st[])
	{
		int i;
		for ( i = 0; i < st.length; i++) {
		

			for (int j = 0; j < st[i].length(); j++) {

				try {
					if (st[i].charAt(j) >= '0' && st[i].charAt(j) <= '9') {
						
						throw new InvalidStringException(st[i] + " contains number");

					}

					 
				}

				catch (InvalidStringException e) {
					//System.out.println(e);
					 System.out.println(e.getMessage());
					// e.printStackTrace();
					// System.out.println(e.toString());
					break;
				}
			}
			System.out.println(st[i] + " " + " does not contain number");
		}
		
	}
		
	public static void main(String[] args) {
		String sarr[] = { "c", "java1", "an5gular", "python" };
		System.out.println(Arrays.toString(sarr));
		checkNumbers(sarr);
		
		}
	}


