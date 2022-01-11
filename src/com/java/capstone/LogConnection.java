package com.java.capstone;



import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class LogConnection {protected static Connection initializeDatabase() 
		throws SQLException, ClassNotFoundException 
	{ 
		//  
		// Address Information
		String dbDriver = "com.mysql.cj.jdbc.Driver"; 
		String dbURL = "jdbc:mysql:// localhost:3306/"; 
		// Credentials for Database Connection 
		String dbName = "PPEWATCHDOG"; 
		String dbUsername = "root"; 
		String dbPassword = "Meshwar5er"; 

		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL + dbName,
													dbUsername, 
													dbPassword); 
		
		return con; 
	} 
	
	

}








