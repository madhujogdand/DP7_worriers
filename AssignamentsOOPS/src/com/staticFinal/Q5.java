package com.staticFinal;
/*5.See if you can overload static method, by using static keyword for 2nd overloaded method and without using static keyword.*/
public class Q5 {

	// Overloaded static method without the 'static' keyword
    public static void myMethod(int x)
    {
        System.out.println("Static method without 'static' keyword: " + x);
    }

    // Overloaded static method with the 'static' keyword
    public void myMethod(String str)
    {
        System.out.println("Static method with 'static' keyword: " + str);
    }

    public static void main(String[] args)
    {
    	Q5 s1 = new Q5();

        // Call the static method without 'static' keyword
    	
    	Q5.myMethod(10);

        // Call the static method with 'static' keyword
    	
        s1.myMethod("Hello");
    }


}
