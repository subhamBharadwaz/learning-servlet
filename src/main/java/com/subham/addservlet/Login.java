package com.subham.addservlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Login extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Cookie cookie1 = new Cookie("email", email);
        res.addCookie(cookie1);
        Cookie cookie2 = new Cookie("password",password);
        res.addCookie(cookie2);


        res.sendRedirect("logininfo");
    }

}
