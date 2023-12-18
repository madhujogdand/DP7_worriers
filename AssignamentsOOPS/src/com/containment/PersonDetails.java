package com.containment;


class Address {
	 private String city;
    private String state;
    private String country;
    
    Address()
    {
   	 
    }
     
    Address(String city,String state,String country)
    {
   	 this.city=city;
   	 this.state=state;
   	 this.country=country;
    }
    
    public String getCity()
    {
  	  return city;
    }
    public void setCity(String city)
    {
  	  this.city=city;
    }
    public String getState()
    {
  	  return state;
    }
  	 public void setState(String state)
    {
  	  this.state=state;
    }
  	 public String getCountry()
    {
  	  return country;
    }
  	 public void setCountry(String country)
    {
  	  this.country=country;
    }
  	 public String toString()
  	 {
  		 return "\nCirty name:"+city+"\nState name:"+state+"\nCountry name:"+country;
  	 }
}
class Person {
	 private String name;
    private String gender;
    private int age;
    private Address address;
    
    public Person()
    {
  	  
    }
    
    public Person(String name,String gender,int age,Address address)
    {
  	  this.name=name;
  	  this.gender=gender;
  	  this.age=age;
  	  this.address=address;
    }
    
    public String getName()
    {
  	  return name;
    }
    public void setName(String name)
    {
  	  this.name=name;
    }
    public String getGender()
    {
  	  return gender;
    }
    public void setGender(String gender)
    {
  	  this.gender=gender;
    }
    public int getAge()
    {
  	  return age;
    }
    public void setAge(int age)
    {
  	  this.age=age;
    }
    public Address getAddress()
    {
  	  return address;
    }
    public void setAddress(Address address)
    {
  	  this.address=address;
    }
    public String toString()
    {
  	  return "Person name:"+name+"\nGender:"+gender+"\nAge:"+age+"\nAddress:"+address;
    }
}

public class PersonDetails {

	public static void main(String[] args) {
		Address a=new Address("Nanded","Maharashta","India");
		Address a1=new Address("Pune","Maharashta","India");
		Address a2=new Address("Mumbai","Maharashta","India");
		
		Person p1=new Person("Radha","female",29,a1);
		Person p2=new Person("Neha","female",30,a1);
		Person p3=new Person("Parth","male",20,a2);
		Person p4=new Person("Madhur","male",21,a);
		
		System.out.println(p1);
		System.out.println("---------------------");
		
		System.out.println(p2);
		System.out.println("---------------------");

		System.out.println(p3);
		System.out.println("---------------------");

		System.out.println(p4);
		System.out.println("---------------------");


	


	}

}
