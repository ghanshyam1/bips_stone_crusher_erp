package com.bips.minning.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bips.minning.beans.MinningBean;
import com.bips.minning.services.MinningService;
import com.bips.minning.services.MinningServiceImpl;

@WebServlet("/RecordFindingController")
public class RecordFindingController extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		
		
		String fromdate = request.getParameter("fromdate");
		String todate = request.getParameter("todate");
		MinningService ms = new MinningServiceImpl();
	    List<MinningBean> record=ms.findRecord(fromdate, todate);
		
	    request.setAttribute("record", record);
		request.getRequestDispatcher("record.jsp").forward(request,
				response);

	}

}
