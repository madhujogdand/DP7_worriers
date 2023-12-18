package com.WrapperClass;


class Boxing {
	int a = 10;
	byte b = 20;
	long c = 30l;
	short d = 5;
	double e = 15d;
	float f = 25f;
	boolean g = true;
	char h = 'A';

	// boxing
	Integer i = a;
	Byte j = b;
	Long k = c;
	Short l = d;
	Double m = e;
	Float n = f;
	Boolean o = g;
	Character p = h;
}
class Unboxing{
	Integer i = 50;
	Byte j = 55;
	Long k = 15l;
	Short l = 14;
	Double m = 22d;
	Float n = 32f;
	Boolean o = false;
	Character p = 'B';
	
	//unboxing
	int a = i;
	byte b = j;
	long c = k;
	short d = l;
	double e = m;
	float f = n;
	boolean g = o;
	char h = p;
}
public class BoxingUnboxin {

	public static void main(String[] args) {
		
		Boxing b1 = new Boxing();
		System.out.println(b1.i+", "+b1.j+", "+b1.k+", "+b1.l+", "+b1.m+", "+b1.n+", "+b1.o+", "+b1.p);
		
		Unboxing u1 = new Unboxing();
		System.out.println(u1.a+", "+u1.b+", "+u1.c+", "+u1.d+", "+u1.e+", "+u1.f+", "+u1.g+", "+u1.h);

	}

}
