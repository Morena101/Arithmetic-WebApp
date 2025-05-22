/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;
import za.ac.tut.model.NumbersException;

/**
 *
 * @author moren
 */
public class AddNumbersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));

            ArithmeticManager am = new ArithmeticManager();
            int sum = am.add(num1, num2);

            request.setAttribute("sum", sum);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);

            RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
            disp.forward(request, response);
        } catch (NumbersException ex) {
            String errorMsg = ex.getLocalizedMessage();
            
            request.setAttribute("errorMsg", errorMsg);
            RequestDispatcher disp = request.getRequestDispatcher("negative_numbers_error.jsp");
            disp.forward(request, response);
        }
    }

}
