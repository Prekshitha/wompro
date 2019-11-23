<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	
	
	<link rel="stylesheet" href="css/register.css">
	
	
	<script type="text/javascript" src="js/reg.js"></script>
</head>
<body>
<table border="2">
<tr>
<td>Id</td>
<td>Hostel name</td>
<td>Hostel address</td>
<td>Room count</td>

</tr>
<c:forEach items="${obj}" var="user">
<div><tr>
    <td>${user.hid}</td>
    <td>${user.hname}</td>
	<td>${user.haddress}</td>
	<td>${user.roomcount}</td>
	
	</div>
</c:forEach>
</table>
</body>
</html>