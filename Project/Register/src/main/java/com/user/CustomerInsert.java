package com.user;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String email = request.getParameter("email");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.insertcustomer(username, email, password);
		
		if (isTrue) {
			
			response.setContentType("text/html");
            response.getWriter().println("<script type='text/javascript'>");
            response.getWriter().println("alert('Registered successfully!');");
            response.getWriter().println("window.location.href = 'http://localhost:8090/Main/Home.jsp';");
            response.getWriter().println("</script>");
			
		   
		} else {
		    RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
		    dis2.forward(request, response);
		}

		
		
	}

}
