package com.bips.employee.services;

import java.util.LinkedList;
import java.util.List;

import com.bips.employee.DAO.EmployeeExpenditureDAO;
import com.bips.employee.DAO.EmployeePresentDAO;
import com.bips.employee.beans.EmployeeMoneyBean;
import com.bips.employee.beans.EmployeePresentBean;

public class EmployeePresentServiceImpl implements EmployeePresentService {

	public String insert(String employee_name,String address,String date,String present)
	{
		EmployeePresentDAO employeePresentDAO=new EmployeePresentDAO();
		
		employeePresentDAO.insert(employee_name,address,date,present);
		return "record successfully inserted";
	}
	
	public List findRecord(String fromdate,String todate){
		List mainList=new LinkedList();
		EmployeePresentDAO md=new EmployeePresentDAO();
	List<EmployeePresentBean> list=	md.findRecord(fromdate,todate);
	 List totalList= total(fromdate,todate);
		System.out.println(totalList +"ghanshyam");
		mainList.add(list);
		mainList.add(totalList);
		return mainList;
	}
	
	public List total(String fromdate,String todate){
		
		EmployeePresentDAO md=new EmployeePresentDAO();
		List totallist=md.total(fromdate,todate);
		return totallist;
	}
}
