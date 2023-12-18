package com.ArrayList;

import java.util.ArrayList;

public class frequencyArrayList {

	static void calFreq(ArrayList<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++)
		{
			count = 1;
			if (list.get(i).equals("Visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++)
			{
				if (list.get(i).equals(list.get(j)))
				{
					count++;
					list.set(j, "Visited");
				}
			}

			System.out.println(list.get(i) + "---->" + count);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("A");
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("D");

		
		calFreq(al);
	}

}
