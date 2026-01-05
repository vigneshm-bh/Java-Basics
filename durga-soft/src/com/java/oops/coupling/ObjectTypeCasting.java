package com.java.oops.coupling;

public class ObjectTypeCasting {

	public static void main(String[] args) {
		Object o = new String("Vicky");
		
//		StringBuffer sb = (StringBuffer)o;
//		System.out.println(sb);   Runtime Exception || No compile time error
		
		Object obj = (String) o;
		System.out.println(obj);
		System.out.println(o);
		
		String s = "EXAMPLE";
		//StringBuffer sb = (StringBuffer)s;   compile error
		//StringBuffer sb = (String)o;   compile error
		
		obj = new StringBuffer(s);
		StringBuffer sb = (StringBuffer)obj;
		System.out.println(sb); 
		
	}

}
