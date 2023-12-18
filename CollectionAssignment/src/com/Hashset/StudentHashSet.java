package com.Hashset;

import java.util.HashMap;

/*1Create a HashSet of student objects . { id , name , marks, course feespaid }

course { id name fees }

if student has paid complete fees , and his marks are more than 30 , give him grace marks so that he will pass by getting 35 marks . 
e.g student has 32 marks give him 3 marks more and make him pass 
Hashset must be updated with new marks
2.create a map in which coursename is a key and number of students in that course is value 
<"java" , 8>
<"angular" , 10>

3.create a map in which 
feespaid string will be key and number of students who paid fees is value 
and same for feesnotpaid
<"feespaid" , 5> 
<"feesnotpaid" , 12>
map will have only 2 entries 

4.create a map in which courseobject will be key and arraylist of studentnames will be value 
<course(1,java,9000) , arraylist{"suraj" , "kailash" }*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class StudentHashSet {

	static void creatHashSettoHashMap(HashSet<Student> st) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (Student s1 : st) {
			String course = s1.getCourse().getName();
			if (hm.containsKey(course)) {
				hm.put(course, hm.get(course) + 1);
			} else
				hm.put(course, 1);
		}

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

	// feesStatus
	public static void method(HashSet<Student> hset) {
		HashMap<String, Integer> newMap1 = new HashMap<String, Integer>();
		HashMap<String, Integer> newMap2 = new HashMap<String, Integer>();

		Iterator<Student> itr = hset.iterator();

		while (itr.hasNext()) {
			Student stud = itr.next();
			if (stud.getCourse().getFees() == stud.getFeespaid()) {
				String course = "feespaid";
				if (newMap1.containsKey(course)) {
					newMap1.put(course, (newMap1.get(course) + 1));
				} else {
					newMap1.put(course, 1);
				}
			} else {
				String course = "feesnotpaid";
				if (newMap2.containsKey(course)) {
					newMap2.put(course, (newMap2.get(course)) + 1);
				} else {
					newMap2.put(course, 1);
				}
			}
		}
		System.out.println(newMap1);
		System.out.println(newMap2);
	}

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();

		hs.add(new Student(1, "Neha", 34, 15000, new Course(101, "java", 15000)));
		hs.add(new Student(2, "Radha", 30, 16000, new Course(102, ".net", 18000)));
		hs.add(new Student(3, "Priti", 79, 15000, new Course(103, "java", 15000)));
		hs.add(new Student(4, "Shruti", 32, 20000, new Course(104, "python", 20000)));

		for (Student s : hs) {
			System.out.println(s);
		}
		System.out.println("========================================================================");
		for (Student s : hs) {
			if (s.getFeespaid() == s.getCourse().getFees()) {
				if (s.getMarks() > 30 && s.getMarks() < 35) {
					int diff = 35 - s.getMarks();
					int newMarks = s.getMarks() + diff;
					s.setMarks(newMarks);

					// s.sstMarks(35);
				}

			}
		}

		for (Student s : hs) {
			System.out.println(s);
		}

		System.out.println("==========================================================================");

		creatHashSettoHashMap(hs);

		System.out.println("==========================================================================");

		HashMap<String, Integer> newMap = new HashMap<>();
		Iterator<Student> itr = hs.iterator();
		int count;
		while (itr.hasNext()) {

			Student stud = (Student) itr.next();
			if (newMap.containsKey(stud.getCourse().getName())) {
				count = newMap.get(stud.getCourse().getName());
				count++;
			} else {
				count = 1;
			}
			newMap.put(stud.getCourse().getName(), count);
		}
		System.out.println(newMap);
		System.out.println("=========================================================");

		method(hs);
		System.out.println("=========================================================");

	}

}
