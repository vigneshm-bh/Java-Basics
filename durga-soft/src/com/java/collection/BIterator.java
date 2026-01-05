package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BIterator {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++) list.add(i);
		
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			if(i%2==0) {
				System.out.println(i);
			}else {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
