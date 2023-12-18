package com.collectionListTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*11)	Consider List of T20 Players. 
Player (playerid,Name,Country,team)
e.g.   (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players. 
*/
public class Q11 {

	public static void main(String[] args) {

		ArrayList<Player> al = new ArrayList<>();

		al.add(new Player(1, "MS Dhoni", "India", "Chennai super kings"));
		al.add(new Player(2, "David warner", "Austalia", "Sunrisers Hyderabad"));
		al.add(new Player(3, "Virat kohali", "India", "Royal challengers Banglore"));
		al.add(new Player(4, "Glenn Maxwell", "Australia", "Royal challengers Banglore"));
		al.add(new Player(5, "Rohit sharma", "India", "Mumbai Indians"));

		for (Player p : al) {
			System.out.println(p);
		}
		System.out.println("===========================================================================");
		HashMap<String, Integer> map = new HashMap<>();

		Iterator<Player> itr = al.iterator();
		while (itr.hasNext()) {
			Player p = itr.next();
			if (p.getCountry().equals("Australia")) {
				if (map.containsKey(p.getTeam())) {
					map.put(p.getTeam(), map.get(p.getTeam()) + 1);
				} else {
					map.put(p.getTeam(), 1);
				}
			}
		}
		int max = 0;
		String teamName = null;
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() > max) {
				max = m.getValue();
				teamName = m.getKey();
			}
		}
		System.out.println("Team name is: " + teamName);

	}

}
