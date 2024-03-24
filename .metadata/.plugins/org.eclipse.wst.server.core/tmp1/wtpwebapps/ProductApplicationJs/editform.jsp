<%@page import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script>
        // JavaScript function for form validation
        function validation() {
            // Add your validation logic here if needed
            return true; // Returning true for now, you can modify this as per your validation needs
        }
    </script>
</head>
<body>
    <div class="container mt-5 text-center">
        <h2 class="text-center font-italic mb-1">Edit Product Data</h2>
        <form method="post" action="./UpdateProductServlet" onsubmit="return validation()" enctype="multipart/form-data">
            <div class="form-group">
                <label class="font-italic font-weight-bold" for="proid">Product id :</label>
                <input type="text" name="proid" id="proid" class="form-control-sm" placeholder="Enter product id" value="${editproduct.proid}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pname">Product Name :</label>
                <input type="text" name="pname" id="pname" class="form-control-sm" placeholder="Enter product name" value="${editproduct.pname}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pprice">Product Price :</label>
                <input type="number" name="pprice" id="pprice" class="form-control-sm" placeholder="Enter product price" value="${editproduct.pprice}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pbrand">Product Brand :</label>
                <input type="text" name="pbrand" id="pbrand" class="form-control-sm" placeholder="Enter product Brand" value="${editproduct.pbrand}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pMadeIn">Product madeIn :</label>
                <input type="text" name="pMadeIn" id="pMadeIn" class="form-control-sm" placeholder="Enter product madeIn" value="${editproduct.pMadeIn}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pmfd">Product mfDate :</label>
                <input type="date" name="pmfd" id="pmfd" class="form-control-sm-color:red" placeholder="Enter product mfDate" value="${editproduct.pmfd}" required>
            </div>

            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pexpdate">Product expdate :</label>
                <input type="date" name="pexpdate" id="pexpdate" class="form-control-sm" placeholder="Enter product expdate" value="${editproduct.pexpdate}" required>
            </div>
            
            <!-- Display the current product image -->
            <div class="form-group">
                <label class="font-italic font-weight-bold" for="pimage">Current Product Image:</label><br>
                <img id="current Image"  name="pimage" src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(editproduct.pimage)}" alt="product image"style="max-width: 100px; max-height: 100px;"><br>
                <input type="hidden" id="pimage" name="pimage" value="${editproduct.pimage}"/>
            </div>

            <!-- Allow the user to upload a new image  -->
            <div class="form-group">
                <label class="font-static font-weight-bold" for="New_Image">New Product Image:</label>
                <input type="file" class="form-control-file-sm" id="New_Image" name="New_Image" accept="image/*"  >
            </div>
            
            <div class="form-group">
                <input type="submit" value="Update Product" class="btn btn-success">
            </div>
        </form>
    </div>
</body>
</html>
