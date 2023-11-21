<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student List</h1>

<div align="center">
<table border="1">
<thead>
<tr>
<td>ID</td>
<td>NAME</td>
<td>MOBILE</td>
<td>COUNTRY</td>
</tr>
</thead>


<c:forEach  var="student" items="${studentlist}">
<tr>
<td> ${student.id}</td>
<td> ${student.name}</td>
<td> ${student.mobile}</td>
<td> ${student.country}</td>
</tr>



</c:forEach>
</table>
</div>
</body>
</html>