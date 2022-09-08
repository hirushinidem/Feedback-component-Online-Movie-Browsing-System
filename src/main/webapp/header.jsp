<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href ="css/style.css">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200&family=Nunito+Sans&display=swap" rel="stylesheet">
<title>Movie Browsing</title>
</head>
<body>
<header>
	<div class = inner>
		<div class = "logo">
			<div>
				<h1>MY<span>SITE</span></h1>
			</div>
		</div>
		
	<nav >
		<li><span><a href="">Movies/TV Series</a></span></li>
         <li><span><a href="addFeedback.jsp">Feedback</a></span></li>
         <li><span><a href="useraccount.jsp">Your Profile</a></span></li>
         
       <%--  <li> <span><% if (session != null)%>
        	<a href="userLogin.jsp" class="button">Login</a>
        <%else
        	out.print((String) session.getAttribute("name"));%>--%>
        	
          <li><span><a href="userLogin.jsp" class="button">Login</a></span></span></li>
    </nav>
	</div>
</header>

</body>
</html>