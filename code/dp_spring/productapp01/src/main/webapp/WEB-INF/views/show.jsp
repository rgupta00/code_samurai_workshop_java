<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.demo.Product"%>
<html>
<head>
<meta charset="UTF-8">
<title>Amdoc product app</title>
</head>
<body>
<table border=1>
    <thead>
    <tr>
        <th>product id</th>
        <th>name</th>
        <th>price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id } </td>
            <td>${product.name} </td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>