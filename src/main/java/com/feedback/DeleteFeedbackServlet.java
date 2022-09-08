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

@WebServlet("/DeleteFeedbackServlet")
public class DeleteFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = FeedbackDBU.deleteFeedback(id);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("addFeedback.jsp");
			dis.forward(request, response);
			
			out.println("<script type ='text/javascript'>");
			out.println("alert('Feedback deleted successfully!');");
			out.println("</script>");
		}
		else {
			List<Feedback> displayFeedback = FeedbackDBU.getFeedbackDetails(id);
			request.setAttribute("displayFeedback", displayFeedback);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
