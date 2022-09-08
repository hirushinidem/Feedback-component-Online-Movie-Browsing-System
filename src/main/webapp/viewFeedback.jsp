<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>All feedback</title>
</head>
<body>
	<script src="js/bootstrap.js"></script>

	<jsp:include page = "BLogHeader.jsp"/>
	
	<table border = "1">
	<tr>
		<th> FeedbackID </th> 
		<th> User name</th> 
		<th> Movie Name</th>
		<th> Movie Rating</th>
		<th> Site Rating </th>
		<th> Feedback/Comments</th>
		<th> Update</th>
		<th> Delete</th>
	</tr>
	

<c:forEach var ="fb" items="${displayFeedback}">
	
	<c:set var="id" value="${fb.id}"/>
	<c:set var="username" value="${fb.username}"/>
	<c:set var="movieName" value="${fb.movieName}"/>
	<c:set var="movieRating" value="${fb.movieRating}"/>
	<c:set var="siteRating" value="${fb.siteRating}"/>
	<c:set var="feedbackcol" value="${fb.feedbackcol}"/>
	
	<%--Display feedback details --%>
	<tr>
		<td><c:out value="${fb.id}"/> </td>
		<td><c:out value="${fb.username}"/></td>
		<td><c:out value="${fb.movieName}"/></td>
		<td><c:out value="${fb.movieRating}"/></td>
		<td><c:out value="${fb.siteRating}"/></td>
		<td><c:out value="${fb.feedbackcol}"/></td>
		
		<td> <%--Update button --%>
			<c:url value="updateFeedback.jsp" var="fbupdate">
				<c:param name="id" value="${id}"/>
				<c:param name="username" value="${username}"/>
				<c:param name="movieName" value="${movieName}"/>
				<c:param name="movieRating" value="${movieRating}"/>
				<c:param name="siteRating" value="${siteRating}"/>
				<c:param name="feedbackcol" value="${feedbackcol}"/>
			</c:url>
	
			<a href ="${fbupdate}">
				<input type ="button" name="update" value="Update my feedback">
			</a>
		</td>
		
		<td>
			<c:url value="deleteFeedback.jsp" var="fbdelete">
				<c:param name="id" value="${id}"/>
				<c:param name="username" value="${username}"/>
				<c:param name="movieName" value="${movieName}"/>
				<c:param name="movieRating" value="${movieRating}"/>
				<c:param name="siteRating" value="${siteRating}"/>
				<c:param name="feedbackcol" value="${feedbackcol}"/>
			</c:url>
			
			<a href ="${fbdelete}">
	 			<input type = "button" name="delete" value="Delete Feedback">
   			</a>	
		</td>
 	</tr>
	
	</c:forEach>
		
	</table>
	

</body>
</html>