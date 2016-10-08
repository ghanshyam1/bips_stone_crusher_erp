package com.bips.employee.services;

import java.util.List;

public interface EmployeeMoneyService {

	public String insert(String employee_name,String address,String paymentrs,String date,String owner);
	public List findRecord(String fromdate,String todate);
	}
 

