<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete your profile</title>

</head>
<body>
	<script src="js/bootstrap.js"></script>

	<jsp:include page = "BLogHeader.jsp"/>
	
	
<% 		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
%>
	<h1>Customer Account Delete</h1>

	<form action="delete" method="post">
	<table>
		<tr>
			<td>User ID</td>
			<td><input type="text" name="id" value="<%=id%>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%=name%>" readonly></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=email%>" readonly></td>
		</tr>
		<tr>
			<td>Phone number</td>
			<td><input type="text" name="phone" value="<%=phone%>" readonly></td>
		</tr>
		<tr>
			<td>User name</td>
			<td><input type="text" name="uname" value="<%=username%>" readonly></td>
		</tr>		
		</table>
		<br>
		<input type="submit" name="submit" value="Delete Confirmation">
	</form>
	
	<jsp:include page = "Footer.jsp"/>

</body>
</html>