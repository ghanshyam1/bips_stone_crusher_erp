package com.bips.minning.utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnection {
	Connection con;
	public Connection connection(){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306","root","bips123");  
		System.out.println(con); 
		  
		}catch(Exception e){ System.out.println(e);}  
		
	return con;
	}  

}
