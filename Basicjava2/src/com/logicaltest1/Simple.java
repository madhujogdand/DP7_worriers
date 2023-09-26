package com.logicaltest1;

class Simple {
	public static void method(int i)
    {
        System.out.println(i);
           
    }

	public static void method(double d)
    {
      System.out.println(d);
    }

	public static void main(String[] args) {

		method('a');

		method(2);

		method(2.0f);

	}

}
