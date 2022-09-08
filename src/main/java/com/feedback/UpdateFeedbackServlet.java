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


@WebServlet("/UpdateFeedbackServlet")
public class UpdateFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String movieName = request.getParameter("movieName");
		String movieRating = request.getParameter("movieRating");
		String siteRating = request.getParameter("siteRating");
		String feedbackcol = request.getParameter("feedbackcol");
		
		boolean isTrue;
		
		isTrue = FeedbackDBU.updatefeedback(id, username, movieName, movieRating, siteRating, feedbackcol);
		
		if(isTrue == true) {
			
			List<Feedback> displayFeedback= FeedbackDBU.getFeedbackDetails(id); //display updated feedback
			request.setAttribute("displayFeedback", displayFeedback);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
			dis.forward(request, response);
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Update unsuccessful!');");
			//out.println("location='viewFeedback.jsp'");
			out.println("</script>");
			
		}
		else {
			List<Feedback> displayFeedback= FeedbackDBU.getFeedbackDetails(id); //display updated feedback
			request.setAttribute("displayFeedback", displayFeedback);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
			dis.forward(request, response);
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Update unsuccessful!');");
			//out.println("location='viewFeedback.jsp'");
			out.println("</script>");
		}
		
//		RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
//		dis.forward(request, response);
	}

}
