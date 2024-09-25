<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form:form action="/product/add" method="post" modelAttribute="pro">
    <lable>ID</lable>
    <input type="text" name="id"><br>
    <lable>Name</lable>
    <input type="text" name="name">
    <form:errors path="name"></form:errors> <br>
    <lable>Price</lable>
    <input type="text" name="price"><br>
    <lable>Category</lable>
    <select name="category" id="">
        <c:forEach var="category" items="${listCategory}">
            <option value="${category.name}">${category.name}</option>
        </c:forEach>
    </select><br>
    <lable>Status</lable>
    <input type="radio" value="active" name="status"> active
    <input type="radio" value="inactive" name="status"> inactive
    <br>
    <button type="submit" onclick="return confirm('Ban co muon them khong ?')">Add</button>
</form:form>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>Product name</td>
        <td>Category</td>
        <td>Price</td>
        <td>Status</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${listProduct}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.category}</td>
            <td>${product.price}</td>
            <td>${product.status}</td>
            <td><a href="/product/delete/${product.id}">Xoa</a></td>
            <td><a href="/product/detail/${product.id}">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>