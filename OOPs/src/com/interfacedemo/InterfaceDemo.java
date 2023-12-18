package com.interfacedemo;

interface Bakery {
	public static final String bname = "LetsBake";// variables should be public static final

	void bake();//public abstract

}
class Cake implements Bakery
{
	public void bake()
	{
		System.out.println("we bake cakes:Butterscotch,pineapple,truffle");
	}

}
class Biscuits implements Bakery
{
	public void bake()
	{
		System.out.println("we bake biscuits:Almond, Chocochips");
	}
    void minOrder()
    {
    	System.out.println("Min packing is 250g");
    }
}
public class InterfaceDemo {
	public static void main(String[] args) {
        Cake c=new Cake();
        c.bake();
        
        Biscuits b=new Biscuits();
        b.bake();
        b.minOrder();
        
        Bakery b1;
        
        b1=new Biscuits();
        b1.bake();
        //b1.minOrder();
	}
}
