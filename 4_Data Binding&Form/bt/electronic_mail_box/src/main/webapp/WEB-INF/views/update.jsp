<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/26/2023
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update new boxMail</h1>
<form:form modelAttribute="mailBox" action="/mailBox/update"  method="post">
    <table>
        <tr>
            <form:hidden path="id" ></form:hidden>
        </tr>
        <tr>
            <td>Languages:</td>
            <td>
                <form:select path="languages">
                    <form:options items="${listLanguages}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page size:</td>
            <td>Show
                <form:select path="size">
                    <form:options items="${listSize}"/>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td>Spams Filter:</td>
            <td> <form:checkbox path="spamsFilter"/>
                Enable spams filter</td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td><form:input path="signature" /></td>
        </tr>
        <tr>
            <td><button type="submit">Update</button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
