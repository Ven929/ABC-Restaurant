package com.queries;

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

    	String queryCategory = request.getParameter("queryCategory");
        String queryText = request.getParameter("queryText");
        String submittedAt = request.getParameter("submittedAt");
        String respondedAt = request.getParameter("respondedAt");
        String responseText = request.getParameter("responseText");

        boolean isSuccess;

        isSuccess = UserDBUtil.insertCustomer(queryCategory, queryText, submittedAt, respondedAt, responseText);

        if (isSuccess) {
         
            
            
            response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Query inserted successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Main/RiservationHome.jsp';");
            response.getWriter().println("</script>");
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
            dis2.forward(request, response);
        }
    }
}
