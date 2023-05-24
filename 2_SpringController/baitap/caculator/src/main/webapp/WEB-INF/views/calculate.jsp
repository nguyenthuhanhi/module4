<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2023
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="caculator" method="post">
    <input type="text" name="calculation1" value="${calculation1}">
    <input type="text" name="calculation2" value="${calculation2}"><br><br>
    <button type="submit" value="+" name="calculation">Additon(+)</button>
    <button type="submit" value="-" name="calculation">Subtraction(-)</button>
    <button type="submit" value="*" name="calculation">Multiplication(*)</button>
    <button type="submit" value="/" name="calculation">Division(/)</button>
</form>
<p>Result: ${result}</p>
</body>
</html>
