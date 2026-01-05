package com.java.fundamentals;

public class Literals {

	public static void main(String[] args) {
		int x = 010; //base 8 prefixed with 0
		int y = 0X10; // base 16 prefixed with 0x
		int z = 10;
		System.out.println(x+y+z +" "+x+" "+y+" "+z);
		
		//floating
		
		float f = 123.456f; // f required else it consider as double
		double d = 123.456 +f; 
		double dou = 0123.456; // takes as decimal only
		//double doHexa = 0x123.456; invalid literal
		System.out.println(dou +" "+d);
		
		//d = 0786; // integer out of range
		d = 0x10;
		dou = 1.2e3;
		f = 1.2e3F;
		System.out.println(d+" "+dou+" "+f);
		
		int b = 0b111; //Binary 0b or 0B
		d = 123_234.2_3;
		dou = 1_2_3_4.123;
		double dd=1_____2_3;
		// d = _123___34;  invalid to start with underscore
		// d = 12_3_.2_3;  
		// d = 1_2_3.2_3_;
		System.out.println(b+" \n"+d+" \n"+dou+" \n"+dd);
		
		long l = 12342223123434L;
		f = l;
		l=(long) f;
		System.out.println(f+"\n"+l);
	}

}
