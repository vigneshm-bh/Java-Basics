package com.java.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class NProperties {

	public static void main(String[] args) throws IOException, SQLException {
		Properties p = new Properties();
		FileInputStream fis = new 
		FileInputStream("D:/PROJECTS/CORE JAVA/Java-Basics\\DurgaSoft/src/com/resources/abc.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		
		System.out.println(url +" "+user+" "+password);
		//DriverManager.getConnection(url,user,password);
	}

}
