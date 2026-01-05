package com.java.oops.instancecontrolflow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class ObjectCreationWays {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException {
		// Using new operator
		ObjectCreationWays ways = new ObjectCreationWays();
		
		// Using newInstance method
		ObjectCreationWays ways2 = (ObjectCreationWays) Class.forName("ObjectCreationWays").newInstance();
		
		//Using Factory method
		Runtime t = Runtime.getRuntime();
		DateFormat d = DateFormat.getInstance();
		
		//Using clone method
		ObjectCreationWays ways3 = (ObjectCreationWays) ways.clone();
		
		//Using Deserialization
		FileInputStream stream = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(stream);
		ObjectCreationWays ways4 = (ObjectCreationWays) ois.readObject();
	}

}
