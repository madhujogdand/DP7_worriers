package com.lab;

public class MySinglton {

	private static MySinglton mysingle=new MySinglton();//early
	//private static MySinglton mysingle=new MySinglton();//lazy
	
	String str;
	private MySinglton()
	{
		
	}
	public static MySinglton getObject()
	{
//		if(mysingle==null)
//		return new mysingleton();//lazy
		return mysingle;
		
	}
	
	public static void main(String[] args) {
	  
		MySinglton ms1=MySinglton.getObject();
		ms1.str="java";
		MySinglton ms2=MySinglton.getObject();
		ms2.str="angular";
		MySinglton ms3=MySinglton.getObject();
		ms3.str="javaScript";
		
		System.out.println(ms2.str);

	}

}
