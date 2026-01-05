package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class FTreeSetComparator implements Comparator<Integer>{
	
	//Write a program to insert integer object into the treeset where sorting order is descending order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long st = System.currentTimeMillis();
		TreeSet<Integer> t = new TreeSet<>(new FTreeSetComparator());
		//TreeSet<Integer> t = new TreeSet<>(); if not passing default natural sorting order
		t.add(10);
		t.add(0);  // compare(0,10)
		t.add(5);
		t.add(15);
		t.add(7);
		t.add(7);
		
		System.out.println(t);
		
		System.out.println(System.currentTimeMillis() - st);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1<o2) return 1;
//		else if(o1==o2) return 0;         //Descending order
//		else return -1;
		
		
		//return o1.compareTo(o2);  //Ascending order
		
		//return -o1.compareTo(o2);   //Descending order
		
		//return o2.compareTo(o1);      //Descending order
		
		//return -o2.compareTo(o1);        //Ascending order
		 
		//return +1;                      //Insertion order, duplicates also stored
		
		//return -1;                      //Reverse insertion order with duplicates
		
		return 0;                       // Only first element will be inserted
	}

}
