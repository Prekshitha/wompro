<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/NgoReg.css">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	
	
	<link rel="stylesheet" href="css/register.css">
	
	
	<script type="text/javascript" src="js/reg.js"></script>
</head>
<body><center>
<h2> Register your NGO here and be a HELPING HAND at MWCD</h2>
<form method="POST" action="ngo.do">
<table>
<tr>
<td>NGO Name</td>
<td><input name="nname" type='text'/></td>
</tr>
<tr>
<td>Manager: Name</td>
<td><input name="nman" type='text'/></td>
</tr>
<tr>
<td>Contact</td>
<td><input name="contact" type='tel'/></td>
</tr>
<tr>
<td>NGO Objective</td>
<td>
<select name="nobj">
<option value="training">Training</option>
<option value="hostel">Hostel</option>
</td>
</tr>
<tr>
<td>NGO Address</td>
<td><textarea name="nloc" cols="8" rows="2"></textarea></td>
</tr>

<!-- <tr>
<td>NGO Govt Approved certificate</td>
<td><td><input type="file" name="file" id="ncertificate"></td></td>
</tr> -->

<tr>
<td colspan="2">
<input type="submit" value="submit" />
</td>
</tr>
</table>

</form>
</center>
</body>
</body>
</html>