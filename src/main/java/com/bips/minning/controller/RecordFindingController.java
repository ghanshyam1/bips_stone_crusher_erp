
package com.bips.minning.controller;

import com.bips.minning.services.MinningServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value={"/RecordFindingController"})
public class RecordFindingController
extends HttpServlet {
    private static final long serialVersionUID = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromdate = request.getParameter("fromdate");
        String todate = request.getParameter("todate");
        MinningServiceImpl ms = new MinningServiceImpl();
        List record = ms.findRecord(fromdate, todate);
        request.setAttribute("record", (Object)record);
        request.getRequestDispatcher("minning/record.jsp").forward((ServletRequest)request, (ServletResponse)response);
    }
}
