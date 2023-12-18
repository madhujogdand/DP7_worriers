package com.polymorphism;

class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Q7 extends Derived 
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Test class " + temp); 
        //return 0; 
    } 
    public static void main(String[] args) 
    { 
        Q7 obj = new Q7(); 
        obj.getDetails("Hello"); 
    } 
} 

