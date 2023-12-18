package com.collectionTest;

import java.util.HashMap;

/*7. What will be output of following code. [1M]*/
public class Output7 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "India");
		map.put(2, "Ausralia");
		System.out.println(map.put(1, "London"));
	}
}


//o/p-India