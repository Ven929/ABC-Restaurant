package com.payment;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerInsert")
public class InsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String payerName = request.getParameter("payerName");
        String paymentType = request.getParameter("paymentType");
        String paymentMethod = request.getParameter("paymentMethod");
        String paymentAmount = request.getParameter("paymentAmount");

        boolean isSuccess;

        isSuccess = UserDBUtil.insertCustomer(payerName, paymentType, paymentMethod, paymentAmount);
        if (isSuccess) {
            // Display an alert and redirect using JavaScript
            response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Payment inserted successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Main/RiservationHome.jsp';");
            response.getWriter().println("</script>");
        } else {
            RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsuccess.jsp");
            dispatcher2.forward(request, response);
        }
    }
}
