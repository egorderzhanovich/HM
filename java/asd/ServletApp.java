package asd;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class ServletApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Calc calc = new Calc();
        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String operation = req.getParameter("operation");
        if(operation.equals("+")) {
            resp.getWriter().write("Result of addition operation: " + calc.addition(num1, num2));
        }
        else if(operation.equals("/")){
            resp.getWriter().write("Result of division operation: " + calc.division(num1, num2));
        }
        else if(operation.equals("*")){
            resp.getWriter().write("Result of multiplication operation: " + calc.multiplication(num1, num2));
        }
        else if(operation.equals("-")){
            resp.getWriter().write("Result of subtraction operation: " + calc.subtraction(num1, num2));
        }
        else{
            resp.getWriter().write("You wrote incorrect operation, you can only insert: \"/ , * , - , + \" operations");
        }



    }
}
