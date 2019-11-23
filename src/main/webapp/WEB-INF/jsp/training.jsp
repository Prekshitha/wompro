<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<b><center>
<h1>Training Details</h1>
<form method="POST" action="training.do">
<table>
<tr>
<td>Training Name</td>
<td><input name="tname" type='text'/></td>
</tr>
<tr>
<td>Duration</td>
<td>
<select name="tduration">
<option value="1">1 Month</option>
<option value="2">2 Months</option>
<option value="3">3 Months</option>
<option value="4">4 Months</option>
<option value="5">5 Months</option>
<option value="6">6 Months</option>
<option value="7">7 Months</option>
<option value="8">8 Months</option>
<option value="9">9 Months</option>
<option value="10">10 Months</option>
<option value="11">11 Months</option>
<option value="12">12 Months</option>
</select>
</td>
</tr>
<tr>
<td>Training For</td>
<td>
<select name="ttype">
<option value="self-emp">Self-Employment</option>
<option value="workplace">Workplace</option>
</select>
</td>
</tr>
<tr>
<th>
Upcoming Batch Starts On</th>
<td><input type="date" name="sdate"></td>
</tr>
<tr>
<th>End Date</th>
<td><input type="date" name="edate"></td>
</tr>
<tr>
<th>Next batch</th>
<td><input type="date" name="nbatch"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="submit" />
</td>
</tr>
</table>
</form>
</center>
</body>
</html>