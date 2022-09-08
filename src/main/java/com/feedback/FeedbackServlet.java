package com.feedback;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String movieName = request.getParameter("movieName");
		String movieRating = request.getParameter("movieRating");
		String siteRating  = request.getParameter("siteRating");
		String feedbackcol = request.getParameter("feedbackcol");
	
		try {
		
			boolean isTrue;
		
			isTrue = FeedbackDBU.insertFeedback(id,username, movieName, movieRating,  siteRating, feedbackcol);
	
				if (isTrue == true) {
					//show feedback with the username
					List<Feedback> displayFeedback = FeedbackDBU.showFeedback(username);
					request.setAttribute("displayFeedback", displayFeedback);

					out.println("<script type ='text/javascript'>");
					out.println("alert('Feedback sent successfully!');");
					out.println("</script>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
		dis.forward(request, response);

	}

}
