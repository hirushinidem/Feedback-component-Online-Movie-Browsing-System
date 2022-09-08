package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			//String userID = request.getParameter("id");
			String username = request.getParameter("uid");
			String password = request.getParameter("pass");
			String type = request.getParameter("usertype");
			boolean isTrue;
			
			
			isTrue = UserDBUtil.validate(username, password, type);
			
			if (isTrue == true) {
				HttpSession session = request.getSession();
				User user = UserDBUtil.getSessionDetails(username, password, type);
				
				
				int id = user.getId();
				String name = user.getName();
				String email = user.getEmail();
				String phone = user.getPhone();

				//System.out.println("UserDetails");
				//session.setAttribute("user", "user");
				session.setAttribute("id", id);
				session.setAttribute("name", name);
				session.setAttribute("uid", username);
				session.setAttribute("email", email);
				session.setAttribute("phone", phone);
				session.setAttribute("usertype", type);
				session.setAttribute("pass", password);
				
				response.sendRedirect("addFeedback.jsp");
				
			}
			else {				
				out.println("<script type ='text/javascript'>");
				out.println("alert('Your username or password is incorrect!');");
				out.println("location='userLogin.jsp'");
				out.println("</script>");
				//response.sendRedirect("userLogin.jsp");
			}
			
		
		}
	
	
}
