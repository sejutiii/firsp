package com.yourname.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yourname.greeting.GreetingGenerator;

@WebServlet("/greet")
public class GreetingServelet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String greeting = GreetingGenerator.generateGreeting(name);
        
        request.setAttribute("greeting", greeting);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}