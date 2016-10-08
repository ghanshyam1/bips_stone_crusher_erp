package com.bips.employee.services;

import java.util.List;

public interface EmployeePresentService {
public String insert(String employee_name,String address,String date,String present)throws Exception;

public List findRecord(String fromdate,String todate);

}
