package com.collectionTest;

import java.util.HashSet;

/*4. What will be output of following code. [1M]*/
public class Output4 {
public static void main(String[] args)
 {
 HashSet<String> hashSet = new HashSet<>();
 hashSet.add("Rose");
 hashSet.add("Lotus");
 hashSet.add("Lavender");
 System.out.println(hashSet.add("Rose"));
 System.out.println(hashSet);
 }
}

//o/p-false
//[Lavender, Rose, Lotus]
