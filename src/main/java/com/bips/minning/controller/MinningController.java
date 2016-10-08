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
package com.bips.minning.controller;

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

@WebServlet(value={"/MinningController"})
public class MinningController
extends HttpServlet {
    private static final long serialVersionUID = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int noOfHoles = Integer.parseInt(request.getParameter("no_of_holes"));
        int feet = Integer.parseInt(request.getParameter("feet"));
        float rate = Float.parseFloat(request.getParameter("onefeetrate"));
        String date = request.getParameter("date");
        MinningServiceImpl ms = new MinningServiceImpl();
        try {
            String msg = ms.insertData(noOfHoles, feet, rate, date);
            request.setAttribute("msg", (Object)msg);
            request.getRequestDispatcher("minning/success.jsp").forward((ServletRequest)request, (ServletResponse)response);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
