package com.lab;

public class ArrayNumber {

	public static void main(String[] args) {
		String sarr[] = { "c", "java1", "an5gul6ar", "python" };

		for (int i = 0; i < sarr.length; i++) {
			boolean flag = true;

			for (int j = 0; j < sarr[i].length(); j++) {

				try {
					if (sarr[i].charAt(j) >= '0' && sarr[i].charAt(j) <= '9') {
						flag = false;
						throw new InvalidStringException(sarr[i] + " contains number");

					}

					// System.out.println(sarr[i] + " " + " does not contain number");
				}

				catch (InvalidStringException e) {
					//System.out.println(e);
				        System.out.println(e.getMessage());
					// e.printStackTrace();
					// System.out.println(e.toString());
					//break;
				}
			}
			if (flag) {
				System.out.println(sarr[i] + " " + " does not contain number");
			}
		}
	}

}
