package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.feedback.UserDBUtil;


@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.updateuser(id, name, email, phone, username, password);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(isTrue == true) {
			
			//RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			//dis.forward(request, response);
			out.println("<script type ='text/javascript'>");
			out.println("alert('User updated successfully.');"); //Show what was update!!!
			out.println("location='useraccount.jsp'");
			out.println("</script>");
		}
		else {
			//RequestDispatcher dis = request.getRequestDispatcher("fail.jsp");
			//dis.forward(request, response);
			out.println("<script type ='text/javascript'>");
			out.println("alert('Error');");
			out.println("location='updateuser.jsp'");
			out.println("</script>");
			
	}

}
	}
