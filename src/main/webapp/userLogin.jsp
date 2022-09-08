<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>

</head>
<body>
<div class = "dropdown-menu" style ="text-align: center">
	<h2>User Login</h2>
	
		<form action = "login" method = "post">
			
	 		<label> User Type</label>
	 			<select name=usertype>
					<option value = "Viewer">Viewer</option>
					<option value = "Contributor">Contributor</option>
				</select><br><br>
				
			<label> User name </label>
				<input type = "text" name="uid" placeholder="Enter your username"  required><br><br>
			
			<label>Password </label>
				<input type = "password" name="pass" placeholder="Enter your password"  required><br><br>
				
						
				<input type ="submit" name="submit" value ="Login">
				<input type="reset" value="Reset">
	</form>
	
	 </div>
</body>
</html>