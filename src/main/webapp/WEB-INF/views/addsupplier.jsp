<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Supplier</title>
<%@include file="/WEB-INF/views/header.jsp" %>  
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<form:form method="POST" action="addsupplier">
<table>
<tr>
  <td>Supplier ID :</td>
           <td><form:input type="number" path="Supplierid"  required="true" palceholder="Enter Id Integer"/></td>
        </tr>
     <tr>
        <td>Supplier Name :</td>
           <td><form:input type="text" path="Suppliername" required="true" palceholder="Enter Name" /></td>
        </tr>
<tr>
        <td>Supplier Address :</td>
        <td><form:input type="text" path="Supplieraddress" palceholder="Enter Address" required="true"/></td>
    </tr>
    <tr>
        <td>Supplier Number:</td>
        <td><form:input type="number" path="Supplierphn"  palceholder="Enter Number" required="true"/></td>
    </tr>
    
    <tr>
  
        <td colspan="2"><input type="submit" value="Add Supplier"></td>
    </tr>
</table>
</form:form>
<br>
<br>
<br>
<br>
<br>
<br>
<%@include file="/WEB-INF/views/footer.jsp" %>  
