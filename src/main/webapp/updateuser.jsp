<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update your profile</title>

</head>
<body>
<%String id = request.getParameter("id"); %>

<div>
<h1>
	<%out.print((String) session.getAttribute("uid"));%>'s profile</h1>
	<ul>
		<li ><a href="home.jsp">Home</a></li>
		<li><a href="#">Logout</a></li>
	</ul>
</div>
<div>

	<form action="update" method="post">
	
		<label>UserID </label>
			<input type="text" name ="id" value ="<%=id%>" readonly> <br>
	
		<label>Name</label>
			<input type="text" name ="name" value ="<%out.print((String) session.getAttribute("name")); %>"> <br>
	
		<label>Email </label>
			<input type="text" name="email" value =" <%out.print((String) session.getAttribute("email")); %>"> <br>

		<label>Phone </label>
			<input type="text" name="phone" value ="<%out.print((String) session.getAttribute("phone")); %>"> <br>

		<label>User name </label>
			<input type="text" name="uname" value ="<%out.print((String) session.getAttribute("uid")); %>"> <br>
 
		<label>Password </label>
			<input type="password" name="pass" value ="<%out.print((String) session.getAttribute("pass")); %>"><br>
		
		<button type="submit" name="submit"> Update</button>
	</form>
	
</div>

</body>
</html>