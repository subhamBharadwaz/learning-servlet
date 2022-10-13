package com.subham.addservlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int result = (int)req.getAttribute("result");
        result *= result;
       PrintWriter out = res.getWriter();
       out.println("result is "+ result);
    }
}
