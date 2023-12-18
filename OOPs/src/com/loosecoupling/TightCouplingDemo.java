package com.loosecoupling;

interface Messages {
	void sendMessage(String msg);
}

class Whatsapp implements Messages {
	String type;

	public void sendMessage(String msg) {
		this.type = "Whatsapp";
		System.out.println(type + ": " + msg);
	}

}

class Telegram implements Messages {
	String type;

	public void sendMessage(String msg) {
		this.type = "Telegram";
		System.out.println(type + ": " + msg);
	}

}

public class TightCouplingDemo {
	public void messagetype(Whatsapp w)
	{
		w.sendMessage("Welcome");
	}
	public static void main(String[] args) {
		TightCouplingDemo obj=new TightCouplingDemo();
         Whatsapp w1=new Whatsapp();
         obj.messagetype(w1);
         
//        Telegram t1=new Telegram();
//         obj.messagetype(t1);
         
         
         
	}
}
