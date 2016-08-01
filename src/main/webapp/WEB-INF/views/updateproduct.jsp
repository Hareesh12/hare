<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Add Product</title>
 <%@include file="/WEB-INF/views/header.jsp" %>  
</head>
<body>

<form:form method="POST" action="updateproduct">
<table>
<tr>
  <td>Product ID :</td>
           <td><form:input type="number" path="ProductId"  readonly="true" /></td>
        </tr>
     <tr>
        <td>Product Name :</td>
           <td><form:input type="text" path="ProductName" required="true"  /></td>
        </tr>
<tr>
        <td>Product Details:</td>
        <td><form:input type="text" path="ProductDetails"  required="true"/></td>
    </tr>
    <tr>
        <td>Product Price:</td>
        <td><form:input type="number" path="ProductPrice"  required="true"/></td>
    </tr>
    <tr>
        <td>IMAGE:</td>
        <td><form:input type="text" path="ProductURL"   required="true"/></td>
    </tr>
    <tr>
  
        <td colspan="2"><input type="submit" value="Update Product"></td>
    </tr>
</table>
</form:form>
 <%@include file="/WEB-INF/views/footer.jsp" %>  
</body>
</html>