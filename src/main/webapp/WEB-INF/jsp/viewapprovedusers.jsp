<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<td>User</td>
<td>Adhar</td>
<td>Address</td>
<td>DOB</td>
<td>Caste:</td>
<td>Contact</td>
<td>Physically Challenged</td>
<td>work period</td>
<td>Gross Income</td>
<td>Status</td>
<td>Age proof</td>
<td>Address Proof</td>
<td>image</td>
<td>approve</td>
</tr>
<c:forEach items="${list}" var="user">

<div><tr>
    <td>${user.wid}</td>
    <td>${user.name}</td>
	<td>${user.adharno}</td>
	<td>${user.address}</td>
	<td>${user.dob}</td>
	<td>${user.caste}</td>
	<td>${user.contact}</td>
	<td>${user.phychal}</td>
    <td>${user.trainingperiod}</td>
    <td>${user.grossIncome}</td> 
    <td>${user.status}</td>
   <!--<td><img src="${pageContext.request.contextPath}/download/image.do?fileName=${user.image}" height="100" width="100"></td>-->
    <td><a target="_self" href="${pageContext.request.contextPath}/download/pdf.do?fileName=${user.dob_fname}">Download Date Of Birth Document</a></td>
    <td><a target="_self" href="${pageContext.request.contextPath}/download/pdf.do?fileName=${user.address_fname}">Download Address Document</a></td>
    <td><a target="_self" href="${pageContext.request.contextPath}/download/image.do?fileName=${user.image}">Download Image</a></td>
    <%-- <td><a target="_self" name="nemail" href="${pageContext.request.contextPath}/nsendmail.do?wid=${user.wid}">Send Confirmation mail</a> --%>
  
	
	
</div>
</c:forEach>

</body>
</html>