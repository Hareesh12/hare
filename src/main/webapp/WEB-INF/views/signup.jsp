<html lang="en">
<head>
  <title>SignUp Page</title>
  <%@include file="/WEB-INF/views/header.jsp" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<center><h3><b><font size="6">Show Bikes</font></b></h3></center>
<body background="resources/images/111.jpg">
<div class="container">
<form method="POST" action="addcustomer">
<table>
 <form class="form" role="form">
 <div class="form-group">
      <label for="FullName">FullName:</label>
      <input type="text" class="form-control" name="Fullname" placeholder="Enter FullName" required/>
    </div>
 <div class="form-group">
      <label for="username">UserName:</label>
      <input type="text" class="form-control" name="username" placeholder="Enter UserName" required/>
    </div>
    <div class="form-group">
      <label for="email">EmailId:</label>
      <input type="email" class="form-control" name="email" placeholder="Enter EmailId" required/>
    </div>
 <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="Enter Password" required/>
    </div>
     
      <input type="submit" class="btn btn-lg btn-primary btn-block" value="SignUp"><br>
    </form>
    </table>
    </form>
    </div>
    
    <%@include file="/WEB-INF/views/footer.jsp" %>



