package com.user;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            List<User> cusDetails = UserDBUtil.validate(username, password);
            if (cusDetails != null && !cusDetails.isEmpty()) {
                // If validation is successful, redirect to RiservationHome.jsp
                response.sendRedirect("http://localhost:8090/Main/RiservationHome.jsp");
            } else {
            	 response.setContentType("text/html");
                 response.getWriter().println("<script type='text/javascript'>");
                 response.getWriter().println("alert('Invalid username or password');");
                 response.getWriter().println("location='Login.jsp';");
                 response.getWriter().println("</script>");
             
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
