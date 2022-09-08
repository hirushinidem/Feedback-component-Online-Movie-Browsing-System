<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">

	
<meta charset="ISO-8859-1">
<title>Post your feedback</title>
<script src="js/bootstrap.js"></script>
</head>
<body>

	<jsp:include page = "BLogHeader.jsp"/>

	
<div style ="text-align: center">
	<h2>Feedback / Rating</h2>
	

	<form action ="addFeedback" method ="post">
	
		<div>
			<label> Enter username</label> <br>
			<input type ="text" name = "username" placeholder="Enter username"  required><br><br>
		</div>
		
	
		<div>
			<label> Enter the movie/TV Series</label> <br>
			<input type ="text" name = "movieName" placeholder="Enter the movie"  required><br><br>
		</div>
	
		<div class = "slidecontainer">
			<label>How would you rate the movie/TV Series?</label><br>
			<input type="range" id="movieRating" name="movieRating" min="0" max="10" value="5" class="slider">  <p>Value: <span id="demo1"></span></p>
		</div>
		
		<div>
			<label>How would you rate our site?</label><br>
			<input type="range" id="siteRating" name="siteRating" min="0" max="10" value="5" class="slider"><p>Value: <span id="demo2"></span></p>
	 	</div>
	
		<div>
			<label for="comment">Do you have any other comments/recommendations?</label><br>
			<textarea id="comment" name="feedbackcol" rows="8" placeholder = "Enter  your feedback"></textarea>
		</div>
		<br><br>
	
	 	<div>        
	 		<button type="submit" name="submit">Submit</button>
		</div>
	</form>
</div>

<script>
		var slider = document.getElementById("movieRating");
		var output = document.getElementById("demo1");
		output.innerHTML = slider.value;

		slider.oninput = function() {
  		output.innerHTML =this.value;
	}
		var slider2 = document.getElementById("siteRating");
		var output2 = document.getElementById("demo2");
		output2.innerHTML = slider.value;

		slider2.oninput = function() {
  		output2.innerHTML =this.value;
	}
	</script>

</body>
</html>