<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/12/2023
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chào bạn ${name}</h1>
<table class="table">
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Score</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
<tbody>
<c:forEach var="student" items="${studentList}" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${status.name}</td>
        <td>${status.score}</td>
        <td>
            <button type="button" class="btn btn-danger">Delete</button>
        </td>
        <td>
            <button type="button" class="btn btn-primary">Update</button>
        </td>
    </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>
