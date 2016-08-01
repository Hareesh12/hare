<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isELIgnored="false" %>
<html>
<head>
 <title>My Book World</title>
  <%@include file="/WEB-INF/views/header.jsp" %>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  
 
</head>
<body>
<form:form method="POST" action="updatesupplier">
<table>
<tr>
  <td>Supplier ID :</td>
           <td><form:input path="Supplierid" readonly="true" /></td>
        </tr>
     <tr>
        <td>Name :</td>
           <td><form:input path="Suppliername" required="true"/></td>
        </tr>
<tr>
        <td>Address :</td>
        <td><form:input path="Supplieraddress" required="true"/></td>
    </tr>
    <tr>
        <td>Number:</td>
        <td><form:input path="Supplierphn" required="true"/></td>
    </tr>
    <tr>
  
    
    <tr>
        <td colspan="2"><input type="submit" value="Update Supplier"></td>
    </tr>
</table>
</form:form>


         <%@include file="/WEB-INF/views/footer.jsp" %>
    </body>
</html>