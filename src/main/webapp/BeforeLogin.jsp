<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">



<title>Box Movies</title>


<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500&display=swap" rel="stylesheet">

    <link href="https://fonts.googleapis.com/css?family=Arbutus+Slab&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <link rel="stylesheet" href="css/animate.css">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <link rel="stylesheet" href="css/style2.css">
    
    <link rel="stylesheet" href="css/style.css">
  </head>
<body>

<jsp:include page = "BLogHeader.jsp"/>





  <div class="content">


    <div class="site-blocks-cover">
      <div class="img-wrap">
        <div class="owl-carousel slide-one-item hero-slider">
          <div class="slide">
            <img src="images/film1.jpg" alt="Img">  
          </div>
          <div class="slide">
            <img src="images/film2.jpg" alt="Img">  
          </div>
          <div class="slide">
            <img src="images/film3.jpg" alt="Img">  
          </div>
           <div class="slide">
            <img src="images/film4.jpg" alt="Img">  
          </div>
           <div class="slide">
            <img src="images/film5.jpg" alt="Img">  
          </div>
           <div class="slide">
            <img src="images/film6.jpg" alt="Img">  
          </div>
         
        </div>
      </div>
      
      
        
      <div class="container">
    
       <div class="row">
        
          <div class="col-md-6 ml-auto align-self-center">
            <div class="intro">
              <div class="heading">
                <h1 class="text-white font-weight-bold">Box Movies</h1>
              </div>
              <div class="text sub-text">
                <p>Movies move us like nothing else can, whether they are scary, funny, dramatic,
romantic or anywhere in-between. So many titles, so much to experience.</p>
                <p><a href="userLogin.jsp" target="_blank" class="btn btn-danger">Sign In</a>  <a href="userRegister.jsp" target="_blank" class="btn btn-danger">Sign Up</a></p>
                
              </div>
            
          </div>
          </div>
        </div>
      </div>
    </div>
  </div>
    <div>
    
 
    
<div class="carousel slide carousel-fade" id="carouselExampleIndicators"  data-ride="carousel">
  
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
  </ol>
  <div class="carousel-inner">
  
    <div class="carousel-item active" data-interval="1000">
    
      <img class="d-block w-100" src="images/film12.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="images/film13.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="images/film14.jpg" alt="Third slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="images/film15.jpg" alt="Third slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="images/film16.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators"  data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators"  data-slide="next">
    <span class="carousel-control-next-icon" ></span>
  
  </a>
</div>
    
    
    
    
    
    </div>
    
    
    
    
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
    
    
    
    <jsp:include page = "Footer.jsp"/>
    
    

</body>
</html>