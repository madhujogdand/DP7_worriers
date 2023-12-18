package com.stringLogical;
// string=Hello, o/p=Hel$o
public class ReplaceDuplicateLetter {

	static String checkDouble(String st) {
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println(j);
					ch[j] = '$';
				}

			}
		}
		st=new String(ch);
		return st;
	}

	public static void main(String[] args) {

		String str = "Hello";
		System.out.println("Before String:" + str);
		
		System.out.println("After:"+checkDouble(str));
		
	}

}
