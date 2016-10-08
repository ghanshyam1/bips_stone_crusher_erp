package com.bips.employee.services;

import java.util.LinkedList;
import java.util.List;

import com.bips.employee.DAO.EmployeeDailyExpenditureDAO;
import com.bips.employee.DAO.EmployeeExpenditureDAO;
import com.bips.employee.beans.EmployeeDailyExpBean;
import com.bips.employee.beans.EmployeeMoneyBean;

public class EmployeeDailyExpServiceImpl implements EmployeeDailyExpService{
	public String insert(String employee_name,String address,String rs,String date,String description)
	{
		EmployeeDailyExpenditureDAO employeeExpenditureDAO=new EmployeeDailyExpenditureDAO();
		
		employeeExpenditureDAO.insert(employee_name,address,rs,date,description);
		return "record successfully inserted";
	}
	
	
	public List findRecord(String fromdate,String todate){
		List mainList=new LinkedList();
		EmployeeDailyExpenditureDAO md=new EmployeeDailyExpenditureDAO();
	List<EmployeeDailyExpBean> list=	md.findRecord(fromdate,todate);
	 List totalList= total(fromdate,todate);
		System.out.println(totalList +"ghanshyam");
		mainList.add(list);
		mainList.add(totalList);
		return mainList;
	}
	
	public List total(String fromdate,String todate){
		
		EmployeeDailyExpenditureDAO md=new EmployeeDailyExpenditureDAO();
		List totallist=md.total(fromdate,todate);
		return totallist;
	}
}
