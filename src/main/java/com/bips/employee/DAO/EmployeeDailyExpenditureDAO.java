package com.bips.employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bips.employee.beans.EmployeeDailyExpBean;
import com.bips.employee.beans.EmployeeMoneyBean;
import com.bips.minning.beans.MinningBean;
import com.bips.minning.utility.DBConnection;

public class EmployeeDailyExpenditureDAO {

	public String insert(String employee_name,String address,String rs,String date,String description){
		
		
		DBConnection connection=new DBConnection();
		Connection con=connection.connection();
		
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into DailyExpenses values(?,?,?,?,?)");
			stmt.setString(1,employee_name);
			stmt.setString(2,address);
			stmt.setString(3,rs);
			stmt.setString(4, date);
			stmt.setString(5,description);
			
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			System.out.println(con); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  
	
		return "success";
	}
	
	public List<EmployeeDailyExpBean> findRecord(String fromdate,String todate){
		List list=new LinkedList();
		
		DBConnection connection=new DBConnection();
		Connection con=connection.connection();
		
		try {Statement stmt=con.createStatement();
			String query="select * from DailyExpenses where date between" +"'"+fromdate+"'"+"and"+"'"+todate+"'";
			//select * from minning where date between '09/18/2016' and '09/22/2016';
			System.out.println(query+"ghanshyam");
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()){
				EmployeeDailyExpBean mb=new EmployeeDailyExpBean();
				
				mb.setEmployee_name(rs.getString(1));
				mb.setAddress(rs.getString(2));
				mb.setRs(rs.getString(3));
				mb.setDate(rs.getString(4));
				mb.setDescription(rs.getString(5));
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
			String query="select sum(rs) from DailyExpenses where date between" +"'"+fromdate+"'"+"and"+"'"+todate+"'";
			
			System.out.println(query);
			ResultSet rs=stmt.executeQuery(query);
			
			
			while(rs.next()){
				list.add(rs.getString(1));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
}
