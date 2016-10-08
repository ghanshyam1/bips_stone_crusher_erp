package com.bips.minning.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


import com.bips.minning.beans.MinningBean;
import com.bips.minning.utility.DBConnection;

public class MinningDao {

	public String insertDataInDB(int noOfHoles, int feet, float rate, String date,int totalFeet,float totalRS)throws Exception{
	
		DBConnection connection=new DBConnection();
		Connection con=connection.connection();
		
		PreparedStatement stmt=con.prepareStatement("insert into minning values(?,?,?,?,?,?)");
		stmt.setInt(1,noOfHoles);
		stmt.setInt(2,feet);
		stmt.setFloat(3,rate);
		stmt.setString(4, date);
		stmt.setInt(5,totalFeet);
		stmt.setFloat(6,totalRS);
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		System.out.println(con); 
		  
	return "data inserted";
}
	public List<MinningBean> findRecord(String fromdate,String todate){
		List list=new LinkedList();
		
		DBConnection connection=new DBConnection();
		Connection con=connection.connection();
		
		try {Statement stmt=con.createStatement();
			String query="select * from minning where date between" +"'"+fromdate+"'"+"and"+"'"+todate+"'";
			//select * from minning where date between '09/18/2016' and '09/22/2016';
			System.out.println(query);
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()){
				MinningBean mb=new MinningBean();
				mb.setNoOfHoles(Integer.parseInt(rs.getString(1)));
				mb.setFeet(Integer.parseInt(rs.getString(2)));
				mb.setOnefeetrate(Float.parseFloat(rs.getString(3)));
				mb.setDate(rs.getString(4));
				mb.setTotalfeet(Integer.parseInt(rs.getString(5)));
				mb.setTotal(Float.parseFloat(rs.getString(6)));
				
				
				list.add(mb);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	
	public List total(String fromdate,String todate){
		List list=new LinkedList();
		
		DBConnection connection=new DBConnection();
		Connection con=connection.connection();
		
		try {Statement stmt=con.createStatement();
			String query="select sum(noOfHoles),sum(totalFeet),sum(totalRS) from minning where date between" +"'"+fromdate+"'"+"and"+"'"+todate+"'";
			
			System.out.println(query);
			ResultSet rs=stmt.executeQuery(query);
			
			
			while(rs.next()){
				list.add(rs.getString(1));
				list.add(rs.getString(2));
				list.add(rs.getString(3));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
}
