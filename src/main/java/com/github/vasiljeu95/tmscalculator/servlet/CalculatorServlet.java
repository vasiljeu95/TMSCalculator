package com.github.vasiljeu95.tmscalculator.servlet;

import com.github.vasiljeu95.tmscalculator.service.MathOperationFactory;
import com.github.vasiljeu95.tmscalculator.service.MathOperationMinus;
import com.github.vasiljeu95.tmscalculator.service.MathOperationSum;
import com.github.vasiljeu95.tmscalculator.service.MathService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstNumber = Double.parseDouble(req.getParameter("firstNumber"));
        double secondNumber = Double.parseDouble(req.getParameter("secondNumber"));
        String operation = req.getParameter("operation");

        MathService mathService = MathOperationFactory.getInstance(operation);

        req.setAttribute("result", mathService.mathCalculate(firstNumber, secondNumber));

        getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }


}
