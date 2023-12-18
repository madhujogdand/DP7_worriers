package com.lambda1;

interface LengthNmae
{
	int findLength(String name);
	
	default void printName(String name)
	{
		System.out.println("Welcome "+name);
	}
}
public class LambdaWithReturn {

	public static void main(String[] args) {
	     String n="Madhu";
	     
	     LengthNmae l1=(name)->{
	    	 System.out.println("Hello"+name);
	    	 return(name.length());
	     };
	     
	     //l1.findLength(n);
	     System.out.println("Length:"+l1.findLength(n));
	
	     LengthNmae l2=name->{return(name.length());};
	
	     System.out.println("Length:"+l2.findLength("Neha"));
	     
	     //omit: return to omit{}
	     LengthNmae l3=name->name.length();
	     
	     System.out.println("Length:"+l3.findLength("shivansh"));
	}

}
