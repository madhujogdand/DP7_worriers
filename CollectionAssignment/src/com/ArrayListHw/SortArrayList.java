package com.ArrayListHw;
/*7.WAP to sort a given ArrayList*/
import java.util.ArrayList;

public class SortArrayList {

	public static void main(String[] args) {
       ArrayList<Integer> al=new ArrayList<>();
       
       al.add(67);
       al.add(23);
       al.add(98);
       al.add(56);
       al.add(17);
       
       System.out.println("Before sorting:"+al);
       
       for(int i=0;i<al.size();i++)
       {
    	   for(int j=i+1;j<al.size();j++)
    	   {
    		   if(al.get(i)>al.get(j))
    		   {
    			   int temp=al.get(i);
    			   al.set(i, al.get(j));
    			   al.set(j, temp);
    		   }
    	   }
       }
       
       System.out.println("After sorting:"+al);
       

	}

}
