package com.subham.addservlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginInfo extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Cookie[] cookies = req.getCookies();

        String email = "";
        String password ="";

        for(Cookie c: cookies){
            if(c.getName().equals("email"))
                email = c.getValue();
            if(c.getName().equals("password"))
                password = c.getValue();
        }

        PrintWriter out = res.getWriter();
        out.println("Email " + email);
        out.println("Password " + password);
        System.out.println(password);
        System.out.println(email);
    }
}
