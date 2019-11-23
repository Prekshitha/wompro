<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<center>

<form method="POST" action="sukanya1.do" enctype="multipart/form-data">
<table>
<tr>
   <td>Guardian/Parent name:</td>
   <td><input name="gname" type="text" required/></td>
</tr>
<tr>
   <td>Child name:</td>
   <td><input name="cname" type="text" required/></td>
</tr>
<tr>
   <td>Child Date of birth:</td>
   <td><input type="date" name="udob" required></td>
   <td><input type="file" name="file" id="dob_certificate"></td>
 
<tr>
   <td>Nationality:</td>
   <td><input name="nationality" type="text"required/></td>
</tr>
<tr>
   <td>Guardian Aadhar Number:</td>
   <td><input name="gaadhar" type="text"required/></td>
   <td><input type="file" name="file" id="guardian_aadhar"></td>
</tr>
<tr>
   <td>Address:</td>
 <td><textarea rows="4" cols="50" name="address" required></textarea></td>
</tr>
<tr>
   <td colspan="2">
   <input type="submit" value="submit"/>
   </td>
</tr>

</table>

</form>
</center>
</html>