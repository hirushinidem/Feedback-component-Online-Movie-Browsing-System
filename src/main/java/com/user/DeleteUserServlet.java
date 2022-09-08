package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.feedback.UserDBUtil;


@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		boolean isTrue;
		
		isTrue = UserDBUtil.deleteUser(id);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(isTrue == true) {
			out.println("<script type ='text/javascript'>");
			out.println("alert('User deleted successfully.');");
			out.println("location='userLogin.jsp'");
			out.println("</script>");
		}
		else {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Deleting your account was not successful.');");
			out.println("location='useraccount.jsp'");
			out.println("</script>");
			
		}
	
	}

}
