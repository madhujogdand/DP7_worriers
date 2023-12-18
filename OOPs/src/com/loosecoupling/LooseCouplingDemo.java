package com.loosecoupling;



interface MessageSer {
	void sendMessage(String msg);
}

class Whatsapp1 implements MessageSer {
	String type;

	public void sendMessage(String msg) {
		this.type = "Whatsapp";
		System.out.println(type + ": " + msg);
	}

}

class Telegram1 implements MessageSer {
	String type;

	public void sendMessage(String msg) {
		this.type = "Telegram";
		System.out.println(type + ": " + msg);
	}

}

public class LooseCouplingDemo {
	public void messagetype(MessageSer m)
	{
		m.sendMessage("Welcome");
	}
	public static void main(String[] args) {
		LooseCouplingDemo obj=new LooseCouplingDemo();
         Whatsapp1 w1=new Whatsapp1();
         obj.messagetype(w1);
         
         Telegram1 t1=new Telegram1();
         obj.messagetype(t1);
         
         
         
	}
}



