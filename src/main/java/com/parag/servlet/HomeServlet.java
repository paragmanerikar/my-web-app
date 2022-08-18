package com.parag.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Home Servlet initiated");
    }

    @Override
    public void destroy() {
        System.out.println("Home servlet destroyed");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setContentType("application/json");

        String json = "{\"name\": \"Parag M\",\"gender\" : \"M\",\"code\" : 265689}";
        resp.getWriter().println(json);
        resp.flushBuffer();
    }
}
