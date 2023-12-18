package com.StringBufferBuilder;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
         
		// append
		sb1.append("java programs");
		//reverse
		System.out.println(sb1.reverse());
        //replace()
		sb1.reverse();
		sb1.replace(0, 1, "p");//pava programs
		System.out.println(sb1);
		
		sb1.replace(1, 4, "p");//pp programs
		System.out.println(sb1);
		
		sb1.replace(0, 1, "java");//javap programs
		System.out.println(sb1);
		//insert()
		sb1.insert(6,"Developer");//javap Developersprogram
		System.out.println(sb1);
		//length()
		System.out.println(sb1.length());//23
		//charAt()
		System.out.println(sb1.charAt(0));//j
	    //deleteCharAt()
		sb1.deleteCharAt(4);//java Developersprogram
		System.out.println(sb1);
		//indexOf()
		System.out.println(sb1.indexOf("Programs"));//
	    //setCharAt()
		sb1.setCharAt(1,'b');//jbva Developersprogram
		System.out.println(sb1);
		//subString()
		System.out.println(sb1.substring(3));//a Developersprogram
		System.out.println(sb1.substring(3,6));//a D
		
		
	}

}
