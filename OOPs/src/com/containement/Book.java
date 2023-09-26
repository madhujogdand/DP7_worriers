package com.containement;

public class Book {
      private int bId;
      private String bname;
      private float price;
      private Author author;
      
      public Book()
      {
    	  
      }
      
      public Book(int id, String bname,float price,Author author)
      {
    	  this.bId=bId;
    	  this.bname=bname;
    	  this.price=price;
    	  this.author=author;
      }
      
      public int getBId()
      {
    	  return bId;
      }
      public void setBId(int bId)
      {
    	  this.bId=bId;
      }
      public String getBname()
      {
    	  return bname;
      }
      public void setBname(String bname)
      {
    	  this.bname=bname;
      }
      public float getPrice()
      {
    	  return price;
      }
      public void setPrice(float price)
      {
    	  this.price=price;
      }
      public Author getAuthor()
      {
    	  return author;
      }
      public void setAuthor(Author author)
      {
    	  this.author=author;
      }
      public String toString()
      {
    	  return "Book Id:"+bId+"\nBook Name:"+bname+"\nBook Price:"+price+"\nBook Author:"+author;
      }
}

