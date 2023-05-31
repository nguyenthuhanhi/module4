<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2023
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SHOWLIST</title>
    <style>
        table, th, td{
            border:1px solid black;
        }
        table{
            border-collapse:collapse;
        }
    </style>
</head>
<body>
    <h2>SHOW LIST</h2>
<table>
    <tr>
        <td>Languages</td>
        <td>Page size</td>
        <td>SpamsFilter</td>
        <td>Signature</td>
        <td>Chức năng</td>
    </tr>
    <c:forEach var="mailBox" items="${listMainBox}">
        <tr>
            <td>${mailBox.languages}</td>
            <td>${mailBox.size}</td>
            <td>${mailBox.spamsFilter}</td>
            <td>${mailBox.signature}</td>
            <td><a href="/mailBox/update/${mailBox.id}">Update</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
