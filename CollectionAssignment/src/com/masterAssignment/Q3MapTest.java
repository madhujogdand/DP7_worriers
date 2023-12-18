package com.masterAssignment;

import java.util.Iterator;
import java.util.TreeSet;

/*3. What will be output of following program.*/
public class Q3MapTest {
public static void main(String[] args) {
TreeSet map = new TreeSet();
map.add("C");
map.add("Java");
map.add("Collection");
map.add("AngularJs");
map.add("JQuery");
Iterator itr = map.iterator();
while (itr.hasNext() )
{
System.out.print( itr.next() + " " );
}} // Justify
}


//O/p--->AngularJs C Collection JQuery Java 