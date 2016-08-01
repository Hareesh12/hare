<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false" %>
<html>
<head>
 <title>user list</title>
   <%@include file="/WEB-INF/views/header.jsp" %>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  
  <!-- <link href=”resources/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
<script type=”text/javascript” src=”resources/js/bootstrap.min.js”></script>
<script src="<c:url value="/resources/angular-1.5.5/angular.min.js"/>" ></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>">-->
</head>
<body>






  <div>

<h2><p style="float:left;">List Of Categories!</p></h2><h3><p align="center">${message}</p></h3>
 
 <p style="text-align: justify;">
  		<div ng-app="myApp" ng-controller="namesCtrl">
	
	<table class="table table-striped">
	<tr>		
		<th>ID</th>
		<th>NAME</th>
		<th>DESCRIPTION</th>
		
	</tr>
	<tr ng-repeat="resource in names | filter:search">		
			<td>{{ resource.id }}</td> 
		<td>{{ resource.name}}</td>
		<td>{{ resource.description}}</td>
   	</tr>
	</table>    
	<script>
	angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = ${data};
    $scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
	});
	</script>
	</div>
  	
	
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

      <%@include file="/WEB-INF/views/footer.jsp" %>   
    </body>
</html>