<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2023
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Các món bạn đã chọn</h2>
<c:forEach items="${save}" var="item">
<p>${item}</p>
</c:forEach>
</body>
</html>
