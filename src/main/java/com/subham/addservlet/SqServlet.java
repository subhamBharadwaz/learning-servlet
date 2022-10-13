package com.subham.addservlet;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int result = 0;

        Cookie[] cookies = req.getCookies();

        for(Cookie c: cookies){
            if(c.getName().equals("result"))
               result =  Integer.parseInt( c.getValue());
        }

        result *= result;
        PrintWriter out = res.getWriter();
        out.println("result is "+ result);

    }
}
