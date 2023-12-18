package com.ArrayListPractice;
/*Q1. Create an arraylist of Float and iterate the arraylist using
   1. normal for loop
   2. enhanced for loop
   3. iterator
   4. list iterator- forward
   5. list iterator- backward*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateFloatArray {

	public static void main(String[] args) {
		ArrayList<Float> al=new ArrayList<>();
		al.add(58.6f);
		al.add(33.4f);
		al.add(52.9f);
		al.add(34.7f);
		al.add(46.2f);
		
		System.out.println(al);
		System.out.println("======================================");
		
		//1.normal for loop
		System.out.println("1.normal for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al);
		}
		System.out.println("======================================");
		
		//2.enhanced for loop
		System.out.println("2.enhanced for loop");
		for(Float f:al)
		{
			System.out.println(f);
		}
		System.out.println("======================================");
		
		//3.iterator
		System.out.println("3.iterator");
		Iterator<Float> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("======================================");
		
		//4.list iterator-forward
		System.out.println("4.list iterator-forward");
		ListIterator<Float> litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
        System.out.println("======================================");
		
		//5.list iterator-backward
        System.out.println("5.list iterator-backward");
        ListIterator<Float> litr1=al.listIterator(al.size());
        while(litr1.hasPrevious())
        {
        	System.out.println(litr1.previous());
        }

	}

}
