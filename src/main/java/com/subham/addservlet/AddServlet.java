package com.subham.addservlet;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));

        int result = a + b;

        Cookie cookie = new Cookie("result", result + "");
        res.addCookie(cookie);

        res.sendRedirect("sq");

//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req,res);

    }
}