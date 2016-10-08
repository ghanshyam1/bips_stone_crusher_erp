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

import com.bips.employee.services.EmployeeMoneyServiceImpl;
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

@WebServlet(value={"/EmployeeRecordFindingController"})
public class EmployeeRecordFindingController
extends HttpServlet {
    private static final long serialVersionUID = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromdate = request.getParameter("fromdate");
        String todate = request.getParameter("todate");
        EmployeeMoneyServiceImpl ms = new EmployeeMoneyServiceImpl();
        List record = ms.findRecord(fromdate, todate);
        request.setAttribute("record", (Object)record);
        request.getRequestDispatcher("emp/employeerecord.jsp").forward((ServletRequest)request, (ServletResponse)response);
    }
}
