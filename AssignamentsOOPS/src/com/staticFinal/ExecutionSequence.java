package com.staticFinal;

/*
12.WAP which contain default constructor, parameterized constructor, 
      one static method, one instance method, one static block and show the execution sequence
*/
public class ExecutionSequence
{
	private static String staticVariable = "Static variable";
    private String instanceVariable;
    
    static
    {
        System.out.println("Static block executed.");
    }
     ExecutionSequence()
    {
        System.out.println("Default constructor called.");
        instanceVariable = "Default instance value";
    }
     ExecutionSequence(String value)
    {
        System.out.println("Parameterized constructor called.");
        instanceVariable = value;
    }
    public static void staticMethod()
    {
        System.out.println("Static method called.");
    }
    public void instanceMethod()
    {
        System.out.println("Instance method called.");
    }

    public static void main(String[] args)
    {
        System.out.println("Creating object without parameters:");
        ExecutionSequence e1 = new ExecutionSequence();

        System.out.println("\nCreating object with parameter:");
        ExecutionSequence e2 = new ExecutionSequence("Custom instance value");

        System.out.println("\nCalling static method:");
        staticMethod();

        System.out.println("\nCalling instance method:");
        e1.instanceMethod();

        System.out.println("\nAccessing static variable:");
        System.out.println(staticVariable);

        System.out.println("\nAccessing instance variable:");
        System.out.println(e1.instanceVariable);
        System.out.println(e2.instanceVariable);
    }
}
/*
 Static block executed.
Creating object without parameters:
Default constructor called.

Creating object with parameter:
Parameterized constructor called.

Calling static method:
Static method called.

Calling instance method:
Instance method called.

Accessing static variable:
Static variable

Accessing instance variable:
Default instance value
Custom instance value
 */

