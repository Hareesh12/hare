<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@include file="/WEB-INF/views/header.jsp" %>  

<title>Add Product</title>

<body>

<br>
<br>
<br>
<br>
<form:form method="POST" action="addproduct">
<table>
<tr>
  <td>Product ID :</td>
           <td><form:input type="number" path="ProductId"  required="true" palceholder="Enter Id "/></td>
        </tr>
     <tr>
        <td>Product Name :</td>
           <td><form:input type="text" path="ProductName" required="true" palceholder="Enter Name" /></td>
        </tr>
<tr>
        <td>Product Details:</td>
        <td><form:input type="text" path="ProductDetails" palceholder="Enter Details" required="true"/></td>
    </tr>
    <tr>
        <td>Product Price:</td>
        <td><form:input type="number" path="ProductPrice"  palceholder="Enter price" required="true"/></td>
    </tr>
    <tr>
        <td>IMAGE:</td>
        <td><form:input type="text" path="ProductURL"  palceholder="Add Image" required="true"/></td>
    </tr>
    <tr>
  
        <td colspan="2"><input type="submit" value="Add Product"></td>
    </tr>
</table>
</form:form>
<br>
<br>
<br>
<%@include file="/WEB-INF/views/footer.jsp" %>  
</body>
</html>