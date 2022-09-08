<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Profile</title>
</head>
<body>

<h2><%out.print((String) session.getAttribute("name")); %>'s profile</h2>

		<a href="home.jsp">Home</a> <br><br>
<div>
	<%--Display user data --%>
	<form>
	 	<label>Name </label>
	 		<input type =text value= "<%out.print((String) session.getAttribute("name")); %>" readonly> <br>
		
	 	<label> Email </label>
	 		<input type =text value= "<%out.print((String) session.getAttribute("email")); %>" readonly> <br>
		
    	<label> Phone</label>
    		<input type =text value= "<%out.print((String) session.getAttribute("phone")); %>" readonly> <br>
	
	 	<label> User name </label>
	 		<input type =text value= "<%out.print((String) session.getAttribute("uid")); %>" readonly> <br>
	
	 	<label> Password </label>
	 		<input type =text value= "<%out.print((String) session.getAttribute("pass")); %>"readonly> <br> <br>
	 </form>
</div>	

	<%--Update profile --%>
	<c:url value="updateuser.jsp" var="userupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href="${userupdate}">	
		<button type="submit" name="submit">Update My Profile</button>
	</a>
		<br><br>
	
	<%--Logout --%>
	<form action="logout">
		<input type="submit" value="Logout">
	</form>
		<br>
	
	<%--Delete Profile--%>
	<c:url value="deleteuser.jsp" var="userdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="pass" value="${password}"/>
	</c:url>
	
	<a href ="${userdelete}">
		<button type="submit" name="delete">Delete My Account</button>
	</a>

</body>
</html>