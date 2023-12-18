package com.lablooseCoupling;

interface Keyboard {
	String display();
}

class Dell implements Keyboard {

	@Override
	public String display() {

		return "Dell Laptop";
	}

}

class HP implements Keyboard {

	@Override
	public String display() {

		return "HP laptop";
	}

}
class Key 
{
	public void display(Keyboard k)
	{
	
		System.out.println(k.display());
	}
	
}
public class KeyboardLC {

	public static void main(String[] args) {
		Keyboard k,k2;
		k2=new Dell();
		k2.display();
		
		k=new HP();
		k.display();
		
		Key k1=new Key();
		k1.display(k2);
		k1.display(k);


	}

}
