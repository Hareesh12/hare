
<head>
<title>
 LOGIN
</title>
<%@include file="/WEB-INF/views/header.jsp" %>  
</head>

<center><h3><b><font size="6">Show Bikes</font></b></h3></center>
<body background= "resources/images/44.jpg">
<div class="container">
<form action="isValidUser" method="post"><br>
<form class="form-inline" role="form">
 <div class="form-group">
      <label for="username">UserName:</label>
      <input type="text" class="form-control" name="username" placeholder="Enter UserName" required/>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" class="form-control" name="password" placeholder="Enter Password" required/>
    </div>
 <input type="submit" class="btn btn-lg btn-primary btn-block" value="Login"><br>
<button type="reset" class="btn btn-default">Reset</button>
</form>
  </form>
  <div class="panel-footer ">
			Don't have an account! <a href="signup" onClick=""> Sign Up Here </a>
</div>
</div>
<br>
<br>
<br>
<%@include file="/WEB-INF/views/footer.jsp" %>
