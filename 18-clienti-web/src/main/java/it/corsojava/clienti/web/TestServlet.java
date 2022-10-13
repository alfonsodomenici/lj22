/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.corsojava.clienti.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ospite
 */
@WebServlet(name = "test", urlPatterns = "/pippo")
public class TestServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();out.println("<h1>Ciao dalla servlet di test</h1>");
        out.flush();
        out.println("<ul>");
        for (int i = 0; i < 10; i++) {
            out.println("<li>" + "cliente" + i + "</li>");
        }
        out.println("</ul>");
    }
    
    
}
