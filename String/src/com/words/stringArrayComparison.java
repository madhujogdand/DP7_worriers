package com.words;

public class stringArrayComparison {

	static void uniqueString(String str1[], String str2[]) {
		boolean found;
		for (String s : str2) {
			found = false;
			for (String s1 : str1) {
				if (s.equals(s1)) {
					found = true;
					break;
				}
			}

			if (!found)
				System.out.println(s);
		}
	}

	public static void main(String[] args) {
		String s[] = { "Neha", "Madhu", "Shraddha", "Shivani", "Harshada" };
		String s1[] = { "Neha", "Pratiksha", "dipti", "Shivani", "Priyanka" };
		uniqueString(s, s1);
	}

}
