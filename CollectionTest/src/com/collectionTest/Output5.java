package com.collectionTest;

import java.util.HashSet;
import java.util.Iterator;

/*5. What will be output of following code. [1M]*/
public class Output5 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Rose");
		hashSet.add("Lotus");
		hashSet.add("Lavender");
		Iterator itr = hashSet.iterator();
		hashSet.add("Tulip");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/*o/p-Exception in thread "main" java.util.ConcurrentModificationException
at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597)
at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620)
at CollectionTest/com.collectionTest.Output5.main(Output5.java:16)*/
