package com.labString;

public class RemoveDuplicates {

	static void checkDuplicates(String s)
	{
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] == '\0')
				continue;
			for (int j = i + 1; j < ch.length; j++)
			{
				if (ch[i] == ch[j])
				{
					ch[j] = '\0';
				}
			}
			System.out.print(ch[i]);
		}

	}

	public static void main(String[] args) {

		String str = "Hello Java";
		System.out.println("Before:" + str);
		checkDuplicates(str);

	}

}
