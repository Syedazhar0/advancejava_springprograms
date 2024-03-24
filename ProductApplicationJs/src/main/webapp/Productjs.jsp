<%@ page import="java.beans.Statement" %>
<%@ page import="com.sathya.servlet.ProductjsDao" %>
<%@ page import="java.util.Base64" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <!-- Bootstrap CDN link for styling -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <meta charset="ISO-8859-1">
</head>
<body style="background-color:bisque;">
<h1 class="text-success text-center">List of Available Products....</h1>
<a href="ProductData.html"  class="btn btn-success">Save Product</a><br>
<input type="text" placeholder="search here...">
<div>
<c:if test="${saveResult==1 }">
<h1 class="text-success text-center">Data inserted successfully......</h1>
</c:if>
</div>

<div>
<c:if test="${deleteRequest==1 }">
<h1 class="text-success text-center">Data deleted successfully......</h1>
</c:if>
</div>

<div>
<c:if test="${deleteRequest==0 }">
<h1 class="text-danger text-center">Data deleted fail......</h1>
</c:if>
</div>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Product Cost</th>
                <th>Product Brand</th>
                <th>Product Made In</th>
                <th>Product Manufacture Date</th>
                <th>Product Expire Date</th>
                <th>Product Image</th>
                <th>Product Audio</th>
                <th>Product Video</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody style="font-family:algerian; color:black; font-style:italic;background-color:black;align-items:center;justify-content:center; text-transform:capitalize;">
            <c:forEach var="product1" items="<%= new ProductjsDao().findAll() %>">
                <tr>
                    <td class="bg-primary ">${product1.proid}</td>
                    <td class="bg-success">${product1.pname}</td>
                    <td class="bg-warning">${product1.pprice}</td>
                    <td class="bg-danger">${product1.pbrand}</td>
                    <td class="bg-info">${product1.pMadeIn}</td>
                    <td class="table-warning">${product1.pmfd}</td>
                    <td class="bg-success">${product1.pexpdate}</td>
                    <td  class="table-dark">
                        <img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product1.pimage)}" alt="product Image" style="max-width:100px; max-height:100px;">
                    </td>
                    
                  <td class="table-dark">
                  <!-- Output the Base64 encoded string -->
                  <audio controls style="width:140px;height:100px;">
                  <source src="data:audio/mpeg;base64, ${Base64.getEncoder().encodeToString(product1.proAudio)}" type="audio/mpeg" >  
                  </audio>
                  </td>
                  
                   <td class="table-dark" >
                 <video controls style="width:140px;height:100px;">
                 <source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product1.proVideo)}" type="video/mp4">
                 </video>
                 </td>
                  
                    <td >
                    <a href="./DeleteProductServlet?proid=${product1.proid }"   class="btn btn-primary">Delete</a>
                    <a href="./EditProductServlet?proid=${product1.proid }"   class="btn btn-primary">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>