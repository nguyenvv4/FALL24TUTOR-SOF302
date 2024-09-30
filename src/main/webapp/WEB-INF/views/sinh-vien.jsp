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
<h2>Danh sach sinh vien</h2>
<table>
<thead>
<tr>
    <td>ID</td>
    <td>name</td>
    <td>address</td>
    <td>age</td>
    <td>Status</td>
    <td>Class name</td>
</tr>
</thead>
<tbody>
<c:forEach var="sinhVien" items="${list}">
    <tr>
        <td>${sinhVien.id}</td>
        <td>${sinhVien.name}</td>
        <td>${sinhVien.address}</td>
        <td>${sinhVien.age}</td>
        <td>${sinhVien.status}</td>
        <td>${sinhVien.className}</td>
        <td><a href="">Xoa</a></td>
        <td><a href="">Detail</a></td>
    </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>