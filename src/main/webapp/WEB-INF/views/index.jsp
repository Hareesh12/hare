<!DOCTYPE html>
<html lang="en" >
<head>
  <title>BikeShow</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  <style>
  .
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
    
 ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: white;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}
  </style>
</head>
<body bacground="resources/images/37.jpg">
<nav class="navbar navbar-inverse navbar-bottom">
<div class="container-fluid">
<div class="navbar-header">
     <button type="button" class="navbar-toggle " data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">SportsBikes</a>
    </div>
    <div>
 <li class="active"><a class="navbar-brand" href="#">  <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
 </a>
 </li>
 
   <li class="nav navbar-nav navbar-right"><a class="navbar-brand" href="login.html"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   
   <li class="nav navbar-nav navbar-right"><a class="navbar-brand" href="signup.html"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    
  </div>
  </nav>
  <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/30.jpg" alt="bike" width="1280" height="200">
      </div>

      <div class="item">
        <img src="resources/images/113.jpg" alt="bike" width="1280" height="800">
      </div>
    
      <div class="item">
        <img src="resources/images/114.jpg" alt="bike" width="1280" height="145">
      </div>

      <div class="item">
        <img src="resources/images/20.jpg" alt="bike" width="1280" height="145">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div class="container">
           <div class="row">  
           <div class="col-md-12"> 
  <img src="resources/images/7.jpg" class="img-thumbnail" alt="bike" width="300" height="136">
  
   <img src="resources/images/11.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
    <img src="resources/images/15.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
    <img src="resources/images/16.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/17.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/18.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/20.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/22.jpg" class="img-thumbnail" alt="bike 3" width="300" height="200">
     <img src="resources/images/23.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/24.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/25.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/27.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
    <img src="resources/images/28.jpg" class="img-thumbnail" alt=" bike 4" width="300" height="200"> 
   <img src="resources/images/31.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
    <img src="resources/images/32.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
     <img src="resources/images/6.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
      <img src="resources/images/36.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
       <img src="resources/images/12.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
        <img src="resources/images/4.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
         <img src="resources/images/8.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
          <img src="resources/images/9.jpg" class="img-thumbnail" alt="bike 2" width="300" height="136">
          
  </div>
  </div>
  
  </div>
 <center> <a href="userproduct"><h3>ViewAllBikes </h3></a></center>
 
<!-- Footer -->
		

<%@include file="/WEB-INF/views/footer.jsp" %>
