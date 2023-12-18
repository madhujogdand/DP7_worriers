package com.OOPSMethod;
//12
public class CubeCalulation {
   int a;
	void calCube()// using no return type
	{
		System.out.println("Cube using no return type is:"+(a*a*a));
	}
	int calCube1()//with return type
	{
		return (a*a*a);
	}
	void calCube2(int a)//with parameter passing
	{
		System.out.println("Cube with parameter passing is"+(a*a*a));
	}

	int calCube3(int a)// with parameter and return type
	{
		return (a*a*a);
	}
	public static void main(String[] args) {
		CubeCalulation c=new CubeCalulation();
		c.a=8;
		c.calCube();
		int cube=c.calCube1();
		System.out.println("Cube with return type is"+cube);
		c.calCube2(6);
		int cube2=c.calCube3(7);
		System.out.println("Cube with parameter and return type is"+cube2);
	}

}
