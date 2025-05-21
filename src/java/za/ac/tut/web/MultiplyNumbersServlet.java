/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.zc.tut.model.ArithmeticManager;

/**
 *
 * @author moren
 */
public class MultiplyNumbersServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        ArithmeticManager am = new ArithmeticManager();
        int product = am.multiply(num1, num2);
        
        request.setAttribute("product", product);
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        
        RequestDispatcher disp = request.getRequestDispatcher("multiply_outcome.jsp");
        disp.forward(request, response);
        
    }

}
