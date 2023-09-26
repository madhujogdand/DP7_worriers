package com.labcodes;

class Menu
{
  String type;
  
  Menu()
  {
	  
  }
  Menu(String type)
  {
	  this.type=type;
  }
  
  public String toString()
  {
	  return "\nMenu Details: \nMenu Type:"+type;
  }
 
}

