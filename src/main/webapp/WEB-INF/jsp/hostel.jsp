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
<h1>Hostel Details</h1>
<form method="POST" action="hostel.do">
<table>
<tr>
   <td>Hostel Name:</td>
   <td><input name="hname" type="text"required/></td>
</tr>
<tr>
   <td>Hostel Address:</td>
   <td><input name="haddress" type="text"required/></td>
</tr>
<tr>
   <td>Room Count:</td>
   <td><input type="text" name="roomcount"required></td>
 </tr>
<tr>
   <td colspan="2">
   <input type="submit" value="submit"/>
   </td>
</tr>

</table>

</form>
</center>
</body>
</html>