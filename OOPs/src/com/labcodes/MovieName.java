package com.labcodes;

class Movie
{
	int m_id;
	String m_name;
	float rating;

	Movie()
	{
		
	}
	
	Movie(int m_id,String m_name,float rating)
	{
		this.m_id=m_id;
		this.m_name=m_name;
		this.rating=rating;
		
	}
	
	public String getM_name()
	{
		return m_name;
	}
	public void setM_name(String m_name)
	{
		this.m_name=m_name;
	}
	
	public float getRating()
	{
		return rating;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}
	public String toString()
	{
		return m_id+" "+m_name+" "+rating;
	}
	
}

public class MovieName {
	static void checkRating(Movie m)
	{
		if(m.getRating()>7)
		{
			System.out.println("Rating greater than 7: "+"\n"+m);
		
		}
		
	}

     public static void main(String[] args) {
		
    	 Movie m1=new Movie(111,"RRR",8.2f);
    	 Movie m2=new Movie(112,"OMG2",7f);
    	 Movie m3=new Movie(113,"Gadar2",6f);
    	 Movie m4=new Movie(114,"DDLJ",9.5f);
    	 
    	 System.out.println(m1);
    	 System.out.println(m2);
    	 System.out.println(m3);
    	 System.out.println(m4);

    	 System.out.println("-------------------------");
    	 
    	 checkRating(m1);
    	 checkRating(m2);
    	 checkRating(m3);
    	 checkRating(m4);
    	 
    	
	}

}
