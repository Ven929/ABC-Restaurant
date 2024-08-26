package com.riservation;

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

        String reservationType = request.getParameter("reservationType");
        String reservationDate = request.getParameter("reservationDate");
        String contact = request.getParameter("contact");
        String reservationTime = request.getParameter("reservationTime");
        String location = request.getParameter("location");
        String tableType = request.getParameter("tableType");
        String specialRequests = request.getParameter("specialRequests");

        boolean isSuccess;

        isSuccess = UserDBUtil.insertCustomer(reservationType, reservationDate, contact, reservationTime, location, tableType, specialRequests);

        if (isSuccess) {
        	
        	
        	response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Added successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Payment/Insert.jsp';");
            response.getWriter().println("</script>");
            
           
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
            dis2.forward(request, response);
        }
    }
}
