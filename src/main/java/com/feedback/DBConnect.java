package com.feedback;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/filmbrowsingdb?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String pass = "pass272";		
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e){
			System.out.println("DB connection was not successful...");
			
		}
		return con;
	}
}
