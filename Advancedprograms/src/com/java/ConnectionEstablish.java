package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablish {
	
	public static void main(String[] args) throws SQLException {
		
		// Load and Register the Driver
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Geeta@999");
			System.out.println("Connected Successfully");
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
