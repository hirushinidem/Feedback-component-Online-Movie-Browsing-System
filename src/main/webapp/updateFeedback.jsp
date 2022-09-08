<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<title>Update Feedback/Rating</title>
</head>
<body>
	<script src="js/bootstrap.js"></script>

	<jsp:include page = "BLogHeader.jsp"/>


	<%session.getAttribute("username");%>
	
	<% String id = request.getParameter("id");
		String username = request.getParameter("username");
		String movieName = request.getParameter("movieName");
		String movieRating = request.getParameter("movieRating");
		String siteRating = request.getParameter("siteRating");
		String feedbackcol = request.getParameter("feedbackcol");
	%>
	<h2>Update feedback</h2>
	
	<%--Update feedback --%>
	<form action = "updateFeedback" method = "post">
	
		FeedbackID	<input type="text" name="id" value="<%=id%>" readonly>	<br>
 		User name	<input type="text" name="username" value="<%=username%>" readonly> <br>
		Movie Name	<input type="text" name="movieName" value="<%=movieName%>"> <br>
		Movie Rating <input type="text" name="movieRating" value="<%=movieRating%>"><br>
		Site Rating <input type="text" name="siteRating" value="<%=siteRating%>"><br>
		Feedback/comments <input type="text" name="feedbackcol" value="<%=feedbackcol%>"><br>
		
		<input type="submit" name="submit" value="Update Feedback/Rating">
		
	</form>	
	

		
</body>
</html>