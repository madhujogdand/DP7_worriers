package com.string;


public class StringMethods {

	public static void main(String[] args) {
		
		
	String str="java is fun.";
	//length()
	System.out.println(str.length());
	
	//charAt
	System.out.println(str.charAt(1));//first character
	
	System.out.println(str.charAt(str.length()-1));//last character

	//concat,+
	String s1="Hello";
	String s2="World";
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2)); 
	
	//substring
	
	System.out.println(str.substring(1));
	System.out.println(str.substring(1,6));
	
	//contains
	System.out.println(str.contains("ava"));
	System.out.println(str.contains("orl"));
	
	String w1="hi";
	String w2="Hi";
	
	System.out.println(w1==w2);//false
	System.out.println(w1.equals(w2));//false
	
	//equalsIgnorecase
	
	System.out.println(w1.equalsIgnoreCase(w2));
	
	//upper&lower
	
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	//indexOf,lastIndexOf
	
	System.out.println(str.indexOf('a'));
	System.out.println(str.lastIndexOf('a'));
	
	System.out.println(str.lastIndexOf("fun"));
	
	
	// is Empty/is blank
	
	System.out.println(str.isEmpty());
	
	String s="";
	System.out.println(s.isEmpty());
	
	//trim
	
	String st=" java    ";
	System.out.println(st.length());
	
	st=st.trim();
	System.out.println(st+st.length());
	
	//compareTo
	
	System.out.println("Shivani".compareTo("Shivani"));//returns 0
	System.out.println("Megha".compareTo("Neetu"));//M<N by 1 value -1
	System.out.println("Neetu".compareTo("Megha"));
	 System.out.println("Megha".compareTo("Parul"));
	 
	 // postive if 1st ascii char is greater
	 // negative if 1st  ascii is smaller
	 // same- 0
	 
	 
	 // lexographical comparison
	 
	 String a1="Java";
	 String a2= "Python";
	 
	 System.out.println(a1.length()>a2.length());
	 
	 System.out.println(a1.compareTo(a2));
	 
	 System.out.println(a1.compareTo(a2)>0);
	
	}
}
