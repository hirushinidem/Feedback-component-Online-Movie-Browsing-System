<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script src="js/bootstrap.js"></script>

	<jsp:include page = "BLogHeader.jsp"/>

		<% String id = request.getParameter("id");
		String username = request.getParameter("username");
		String movieName = request.getParameter("movieName");
		String movieRating = request.getParameter("movieRating");
		String siteRating = request.getParameter("siteRating");
		String feedbackcol = request.getParameter("feedbackcol");
	%>
	<h2>Update feedback</h2>
	
	<form action = "deleteFeedback" method = "post">
	
		FeedbackID	<input type="text" name="id" value="<%=id%>" readonly>	<br>
 		User name	<input type="text" name="username" value="<%=username%>" readonly> <br>
		Movie Name	<input type="text" name="movieName" value="<%=movieName%>" readonly> <br>
		Movie Rating <input type="text" name="movieRating" value="<%=movieRating%>" readonly><br>
		Site Rating <input type="text" name="siteRating" value="<%=siteRating%>" readonly><br>
		Feedback/comments <input type="text" name="feedbackcol" value="<%=feedbackcol%>" readonly><br>
		
		<input type="submit" name="submit" value="Delete Confirmation">
		
	</form>	
	

</body>
</html>