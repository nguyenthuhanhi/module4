<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2023
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Sandwich Condiments</h1>
<form action="sandwich" method="post">
    <input type="checkbox" id="item1" name="condiment" value="Lettuce">
    <label for="item1">Rau xà lách</label><br>

    <input type="checkbox" id="item2" name="condiment" value="Tomato">
    <label for="item2">Cà chua</label><br>

    <input type="checkbox" id="item3" name="condiment" value="Mustard">
    <label for="item3">Bù tạc</label><br>

    <input type="checkbox" id="item4" name="condiment" value="Sprouts">
    <label for="item4">Giá đỡ</label><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
