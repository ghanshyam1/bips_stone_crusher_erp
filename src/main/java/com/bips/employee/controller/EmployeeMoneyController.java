package com.bips.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bips.employee.services.EmployeeMoneyService;
import com.bips.employee.services.EmployeeMoneyServiceImpl;


@WebServlet("/EmployeeMoneyController")
public class EmployeeMoneyController extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		String employee_name=request.getParameter("employee_name");
		String address=request.getParameter("address");
		String paymentrs=request.getParameter("paymentrs");
		String date=request.getParameter("date");
		String owner=request.getParameter("owner");
		EmployeeMoneyService employeeMoney=new EmployeeMoneyServiceImpl();
		
		
		try {

			String msg=employeeMoney.insert(employee_name,address,paymentrs,date,owner);

			request.setAttribute("msg", msg);
			request.getRequestDispatcher("emp/success.jsp").forward(request,
					response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
