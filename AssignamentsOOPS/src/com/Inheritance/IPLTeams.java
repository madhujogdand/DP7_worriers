package com.Inheritance;

class IPLTeam
{
	void play()
	{
		System.out.println("This is IPL Team");
	}
}
class CSK extends IPLTeam
{
	void play()
	{
		System.out.println("CSK is a team of IPL");
	}
}
class RCB extends IPLTeam
{
	void play()
	{
		System.out.println("RCB is a team of IPL");
	}
}
public class IPLTeams {

	public static void main(String[] args) {
		RCB r=new RCB();
		r.play();
		CSK c=new CSK();
		c.play();

	}

}
