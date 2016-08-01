<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false" %>
<html>
<head>
 <title>add category</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <%@include file="/WEB-INF/views/header.jsp" %>  
 
</head>
<body>
<br>
<br>
<form method="POST" action="addcategory">
<table>
<tr>
  <td>Category ID :</td>
           <td><input type="number" name="id" placeholder="Enter Id AS Integer" required /></td>
        </tr>
     <tr>
        <td>Name :</td>
           <td><input type="text" name="name"  placeholder="Enter Category Name" required/></td>
        </tr>
<tr>
        <td>Description :</td>
        <td><input type="text" name="description" placeholder="Enter Catgeory Description" required/></td>
    </tr>
    
  <br>
    
    <tr>
        <td colspan="2"><input type="submit" value="Add Category"></td>
    </tr>
</table>
</form>

<br>

<br>

<br>

<br>

<br>

<br>

<%@include file="/WEB-INF/views/footer.jsp" %>         
  