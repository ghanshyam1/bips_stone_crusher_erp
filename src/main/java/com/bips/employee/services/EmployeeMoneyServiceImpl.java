package com.bips.employee.services;

import java.util.LinkedList;
import java.util.List;

import com.bips.employee.DAO.EmployeeExpenditureDAO;
import com.bips.employee.beans.EmployeeMoneyBean;

public class EmployeeMoneyServiceImpl implements EmployeeMoneyService {

	public String insert(String employee_name,String address,String paymentrs,String date,String owner)
	{
		EmployeeExpenditureDAO employeeExpenditureDAO=new EmployeeExpenditureDAO();
		
		employeeExpenditureDAO.insert(employee_name,address,paymentrs,date,owner);
		return "record successfully inserted";
	}
	
	public List findRecord(String fromdate,String todate){
		List mainList=new LinkedList();
		EmployeeExpenditureDAO md=new EmployeeExpenditureDAO();
	List<EmployeeMoneyBean> list=	md.findRecord(fromdate,todate);
	 List totalList= total(fromdate,todate);
		System.out.println(totalList +"ghanshyam");
		mainList.add(list);
		mainList.add(totalList);
		return mainList;
	}
	
	public List total(String fromdate,String todate){
		
		EmployeeExpenditureDAO md=new EmployeeExpenditureDAO();
		List totallist=md.total(fromdate,todate);
		return totallist;
	}
}
