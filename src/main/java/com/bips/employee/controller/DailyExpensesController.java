/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  com.bips.minning.services.MinningServiceImpl
 *  javax.servlet.RequestDispatcher
 *  javax.servlet.ServletException
 *  javax.servlet.ServletRequest
 *  javax.servlet.ServletResponse
 *  javax.servlet.annotation.WebServlet
 *  javax.servlet.http.HttpServlet
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 */
package com.bips.employee.controller;

import com.bips.employee.services.EmployeeDailyExpService;
import com.bips.employee.services.EmployeeDailyExpServiceImpl;
import com.bips.employee.services.EmployeeMoneyService;
import com.bips.employee.services.EmployeeMoneyServiceImpl;
import com.bips.minning.services.MinningServiceImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value={"/DailyExpensesController"})
public class DailyExpensesController
extends HttpServlet {
    private static final long serialVersionUID = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String employee_name=request.getParameter("employee_name");
		String address=request.getParameter("address");
		String rs=request.getParameter("rs");
		String date=request.getParameter("date");
		String description=request.getParameter("description");
		EmployeeDailyExpService employeeMoney=new EmployeeDailyExpServiceImpl();
		
		
		try {

			String msg=employeeMoney.insert(employee_name,address,rs,date,description);

			request.setAttribute("msg", msg);
			request.getRequestDispatcher("emp/success.jsp").forward(request,
					response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
