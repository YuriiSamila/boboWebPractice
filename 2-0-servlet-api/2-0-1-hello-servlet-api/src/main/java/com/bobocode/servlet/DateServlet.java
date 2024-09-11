package com.bobocode.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import static java.lang.String.format;

@WebServlet("/date")
public class DateServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body align=\"center\">");
        writer.println(format("%s", LocalDate.now()));
        writer.println(format("%s", request.getMethod()));
        writer.println("</body></html>");
    }

}
