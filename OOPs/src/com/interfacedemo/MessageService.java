package com.interfacedemo;

interface Message
{
  public void sendMessage(String msg);

}
class Whatsapp implements Message
{
	public void sendMessage(String msg)
	{
		System.out.println("Whatsapp send:"+msg);
	}

}
class Insta implements Message
{
	public void sendMessage(String msg)
	{
		System.out.println("Instagramdm send:"+msg);
	}
}
class Facebook implements Message
{
	public void sendMessage(String msg)
	{
		System.out.println("Facebook send:"+msg);
	}
}

public class MessageService {

	public static void main(String[] args) {
		Whatsapp w=new Whatsapp();
		w.sendMessage("hi");
		
		Insta i=new Insta();
		i.sendMessage("Hello");
		
		Facebook f=new Facebook();
		f.sendMessage("welcome");

	}

}
