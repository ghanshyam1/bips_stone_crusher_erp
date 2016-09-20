package com.bips.minning.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bips.minning.services.MinningService;
import com.bips.minning.services.MinningServiceImpl;

@WebServlet("/MinningController")
public class MinningController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		
		int noOfHoles = Integer.parseInt(request.getParameter("no_of_holes"));
		int feet = Integer.parseInt(request.getParameter("feet"));
		float rate = Float.parseFloat(request.getParameter("onefeetrate"));
		String date = request.getParameter("date");

		MinningService ms = new MinningServiceImpl();
		try {

			String msg = ms.insertData(noOfHoles, feet, rate, date);

			request.setAttribute("msg", msg);
			request.getRequestDispatcher("success.jsp").forward(request,
					response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
