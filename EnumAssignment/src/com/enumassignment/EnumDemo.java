package com.enumassignment;



public class EnumDemo {
	static void enumSwitch(Level l) {
		switch (l) {
		case LOW:
			System.out.println("Low");
			break;
		case MEDIUM:
			System.out.println("Medium");
			break;
		case HIGH:
			System.out.println("High");
			break;
		default:
			System.out.println("incorrect level");
		}
	}

	public static void main(String[] args) {
		Level l1 = Level.MEDIUM;
		System.out.println(l1.value);

		Level l2 = Level.LOW;
		Level l3 = Level.HIGH;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));

		System.out.println("value of high is: " + Level.HIGH.getValue());
		
		enumSwitch(l1);
		
		//Level l4 = new Level();//not possible
		Maths m1 = Maths.ADD;
		System.out.println(m1+" : "+m1.calculate(10, 20));
		Maths m2 = Maths.SUBTRACT;
		System.out.println(m2+" : "+m2.calculate(20, 10));
		
		Level[] levarr= Level.values();
		for(int i=0; i<levarr.length;i++) {
			System.out.println("level array is: "+levarr[i]);
		}
	}

}
