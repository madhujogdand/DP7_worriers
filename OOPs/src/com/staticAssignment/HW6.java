
package com.staticAssignment;

class Employ
{
	int id;
	String name;

    Employ()
    {
    	
    }
    Employ(int id,String name)
    {
    	this.id=id;
    	this.name=name;
    }
    void show()
    {
    	System.out.println("Show Details of employee");
        this.display();
    }
    void display()
    {
    	System.out.println("Employee ID:"+this.id+"\nEmployee Name:"+this.name);
    }
    Employ changeName()
    {
    	name=name+" Yuga"; 
    	return this;
    }
}
public class HW6 {
	public static void main(String[] args) {
		
	
	Employ e1=new Employ(1,"Pinky");
	e1.show();
	System.out.println();
	
	Employ e2=new Employ(2,"Aaru");
	e2.changeName();
	 System.out.println(e2.name);
	}
}
