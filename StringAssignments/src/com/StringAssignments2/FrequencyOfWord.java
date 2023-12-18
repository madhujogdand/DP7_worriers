package com.StringAssignments2;

public class FrequencyOfWord {
	/*10. Count the words
	11. Duplicate words
	12. Unique words
	13. Frequency of words
	*/
	

		static void findFrequency(String st)
		{
			String starr[] = st.split("\\s");
			System.out.println("words:"+starr.length);
			int count;
			for (int i = 0; i < starr.length; i++)
			{
				
				if (starr[i].equals("visited"))
				{
					continue;
				}
				count = 1;
				for (int j = i + 1; j < starr.length; j++)
				{
					if (starr[i].equalsIgnoreCase(starr[j]))
					{
						count++;
						starr[j] = "visited";
					}
				}
				System.out.println(starr[i] + "--->" + count);
			    if(count>1)
			    {
			    	System.out.println("Duplicate word:"+starr[i]);
			    }
			}
		}

		public static void main(String[] args)
		{
			String str = "A big cat is rolling on a big mat";
			findFrequency(str);
		}

}
