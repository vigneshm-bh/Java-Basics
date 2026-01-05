package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

//Write a program to insert String objects into the treeSet where all elements should be inserted according to 
//reverse of alphabetical order

public class GTreeComparatorWithString{

	public static void main(String[] args) {
		TreeSet t = new TreeSet<>(new MyComparator());
		
		t.add("Kamal");
		t.add("Dinesh");
		t.add("Ram");
		t.add("Makesh");
		t.add("Mani");
		t.add("Muni");
		t.add("Hari");

		System.out.println(t);
	}

}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		//return o1.compareTo(o2); //[Dinesh, Hari, Kamal, Makesh, Mani, Muni, Ram]  Ascending order 
		return -o1.compareTo(o2);  //Descending order
		//return 0;
	}
	
}