<!doctype html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/product/update/${product.id}" method="post">
    <lable>Name</lable>
    <input type="text" name="name" value="${product.name}"><br>
    <lable>Price</lable>
    <input type="text" name="price" value="${product.price}"><br>
    <lable>Category</lable>
    <select name="category" id="">
        <c:forEach var="category" items="${listCategory}">
            <option value="${category.name}" ${product.category == category.name ? 'selected':''} >${category.name}</option>
        </c:forEach>
    </select><br>
    <lable>Status</lable>
    <input type="radio" value="active" name="status" ${product.status == 'active' ? 'checked' : ''}> active
    <input type="radio" value="inactive" name="status" ${product.status == 'inactive' ? 'checked' : ''}> inactive
    <br>
    <button type="submit">Update</button>
</form>
</body>
</html>