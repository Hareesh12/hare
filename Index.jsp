<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Sports Bikes</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Login</a></li>
      <li><a href="#">Password</a></li>
      <li><a href="#">Submit</a></li>
    </ul>
  </div>
</nav>

  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>

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
        <img src="E:\Bikes\Yamaha YZF-R1 2016.jpg" alt="Yamaha YZF-R1" width="460" height="345">
      </div>

      <div class="item">
        <img src="E:\Bikes\Ducati 848 EVO Corse SE.jpg" alt=" Ducati 848 EVO Corse SE" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="E:\Bikes\Suzuki GSX-R750.jpg" alt="Suzuki GSX-R750" width="460" height="345">
      </div>

      <div class="item">
        <img src="E:\Bikes\MV Agusta F3 675.jpg" alt="MV Agusta F3 675" width="460" height="345">
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
  <img src="E:\Bikes\Triumph Daytona 675R.jpg"  width="250" height="236"> 
   <img src="E:\Bikes\honda2012CBR1000RR-3.jpg"  width="250" height="236"> 
    <img src="E:\Bikes\2013-kawasaki-zx-6r-i1jpg.jpg"  width="250" height="236">
     <img src="E:\Bikes\2015TriumphStreet_Triple_R_ABS_4289014.jpg"  width="250" height="236"> 
</div>
</body>
</html>