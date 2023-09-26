package com.containement;

public class MyLibraryGetterSetter {
	
	public static void main(String[] args) {
		
		Author a1=new Author();
		a1.setId(111);
		a1.setAname("Sudha Murthy");
		
		Book b1=new Book();
		b1.setBId(101);
		b1.setBname("Nidhi");
		b1.setPrice(800f);
		b1.setAuthor(a1);
		
		System.out.println(b1);
		
		Book s2=new Book();
		s2.setBId(101);
		s2.setBname("Nidhi");
		s2.setPrice(800f);
		s2.setAuthor(new Author());
		s2.getAuthor().setId(111);
		s2.getAuthor().setAname("APJ Abdul Kalam");
		
		System.out.println(s2);
		
		
	}

}
