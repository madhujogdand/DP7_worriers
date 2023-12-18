package com.arrayContainment;

public class BookConstructor {

	static void countBookAythorWise(Book bk[], Author auth[]) {
		int count;
		for (Author a : auth)
		{
			count = 0;
			for (Book b : bk)
			{
				if (b.getA().equals(a))
				{
					count++;
				}
			}
			System.out.println(a + ": " + count);
		}

	}
	static void showBookName(Book bk[])
	{
		for(Book b:bk)
		{
			System.out.println(b.getName());
		}
	}

	public static void main(String[] args) {
		Author auth[] = new Author[3];
		auth[0] = new Author(1, "Balaguruswami");
		auth[1] = new Author(2, "P L Deshpande");
		auth[2] = new Author(3, "Chetan bhagat");

		Book bk[] = new Book[6];
		bk[0] = new Book(101, "C", 800, auth[0]);
		bk[1] = new Book(102, "Natsamrat", 850, auth[1]);
		bk[2] = new Book(103, "2 States", 890, auth[2]);
		bk[3] = new Book(104, "Half Girlfriend", 750, auth[2]);
		bk[4] = new Book(105, "Nasti uthathev", 670, auth[1]);
		bk[5] = new Book(106, "kai poche", 860, auth[2]);

		for (Book b : bk) {
			System.out.println(b);
		}
		
		System.out.println("-------------------------------------------------------");
		countBookAythorWise(bk,auth);
		System.out.println("-------------------------------------------------------");
		showBookName(bk);
	}

}
