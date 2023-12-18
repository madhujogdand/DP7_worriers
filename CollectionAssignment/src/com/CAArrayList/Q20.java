package com.CAArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q20 {
	// convert array to ArrayList

		public static void main(String[] args) {

			String colours[] = { "Red", "Blue", "Green", "Yellow" };
//					Arrays.sort(colours);
//					System.out.println(Arrays.toString(colours));

			// 1st way

			List<String> al = Arrays.asList(colours);
			System.out.println(al);

		   // 2nd way
			ArrayList<String> al2 = new ArrayList<>(Arrays.asList(colours));
			System.out.println(al2);

			// 3rd way
			ArrayList<String> al3 = new ArrayList<>();
			Collections.addAll(al3, colours);
			System.out.println(al3);

			System.out.println("=========================================");

			// convert ArrayList to array

			Object[] col = al2.toArray();
			System.out.println(Arrays.toString(col));

			for (int i = 0; i < col.length; i++) {
				col[i] = (((String) col[i]).concat("colours"));
			}
			System.out.println(Arrays.toString(col));

			String[] cols = new String[al2.size()];
			al2.toArray(cols);
			for (int i = 0; i < cols.length; i++) {
				cols[i] = ((String) cols[i].concat("colours"));
			}
			System.out.println(Arrays.toString(cols));

		}
}
