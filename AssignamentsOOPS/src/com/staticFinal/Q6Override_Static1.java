/*package com.staticAssignment;*/
//6.	See if you can override static method
package com.staticFinal;

class Override_Static
{
	public static void staticMethod()
	{
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Q6Override_Static1
{
    public static void staticMethod()
    {
        System.out.println("Static method in Subclass");
    }
}

public class Q6Override_Static1
{
    public static void main(String[] args)
    {
    	Override_Static s1 = new Override_Static();
    	Override_Static s2 = new Override_Static();

        // Calls the static method in Superclass (compile-time binding)
        s1.staticMethod();

        // Calls the static method in Superclass (compile-time binding)
        s2.staticMethod();
    }

}
