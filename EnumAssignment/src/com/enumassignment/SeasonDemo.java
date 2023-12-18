package com.enumassignment;
enum Season{ SPRING , SUMMER, AUTUMN 
}
public class SeasonDemo {
	public static void main(String[] args) {
		Season s1 = Season.SPRING;
		System.out.println(s1);
		System.out.println(s1.valueOf("SUMMER"));
	}

}
