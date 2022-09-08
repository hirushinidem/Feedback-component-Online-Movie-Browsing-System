package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserLogoutServlet")
public class UserLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session=request.getSession(false);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if (session != null) {
            session.invalidate(); //removes all session attributes bound to the session
            
            out.println("<script type ='text/javascript'>");
			out.println("alert('You are successfully logged out');"); //Show what was update!!!
			out.println("location='userLogin.jsp'");
			out.println("</script>");
           
        }
	}

}
