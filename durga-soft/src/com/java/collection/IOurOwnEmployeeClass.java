package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class IOurOwnEmployeeClass implements Comparator<Object>{
	

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Vigensh");
		Employee e2 = new Employee(2, "Kamal");
		Employee e3 = new Employee(31, "Makesh");
		Employee e4 = new Employee(4, "Muni");
		Employee e5 = new Employee(5, "Ram");
		Employee e6 = new Employee(6, "Mani");
		
		TreeSet t = new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		
		TreeSet t2 = new TreeSet<>(new IOurOwnEmployeeClass());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		t2.add(e6);
		
		//Sorting by employeeId, Creator defined
		System.out.println(t);
		//Sorting by name, user defined
		System.out.println(t2);
	}


	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		String s1= e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}

class Employee implements Comparable<Object>{
	
	int employeeId;
	String name;
	
	public Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public String toString() {
		return employeeId + "----" + name;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		int employeeId = this.employeeId;
		int eid = e.employeeId;
		
		if(employeeId <eid) return -1;
		else if(employeeId > eid) return 1;
		return 0;
	}

}
