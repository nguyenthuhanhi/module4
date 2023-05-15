<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="dictionary" method="post">
    <h1 STYLE="color: red">TỪ ĐIỂN ANH - VIỆT</h1>
    <label>English:</label>
    <input type="text" name="english" value="${english}">
    <label>Việt Nam: ${vns}</label>
    <input type="submit" value="Find">
</form>
</body>
</html>