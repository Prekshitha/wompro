<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/one.css">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	
	
	<link rel="stylesheet" href="css/register.css">
	
	
	<script type="text/javascript" src="js/reg.js"></script>
</head>
<body>
<form action="query.do" method="POST" enctype="multipart/form-data">


<table>

<tr>
<th>Name:</th>
<td><input type="text" name="name" type="name" required></td>
</tr>

<tr>
<td><form:label path="image">Upload Profile Image</form:label></td>
<td><input type="file" name="file" id="image"></td>
</tr>

<tr>
<th>AdharNo:</th>
<td><input type="text" name="ano" type="ano" required></td>
</tr>

<tr>
<th>Address</th>
<td><textarea rows="4" cols="50" name="add" required></textarea></td>
<td><input type="file" name="file" id="address_fname"></td>
</tr>

<tr>
<th>DOB:</th>
<td><input type="date" name="date" type="date" required></td>
<td><input type="file" name="file" id="dob_fname"></td>
</tr>

<tr>
<th>Caste:</th>
<td>
<select name="caste">
  <option value="OBC">OBC</option>
  <option value="SC/ST">SC/ST</option>
  <option value="Others">Others</option>
 
</select></td>

</tr>

<tr>
<th>Contact:</th>
<td><input type="text" name="contact" type="contact" required></td>
</tr>

<tr>
<th>Physically Challenged:</th>
<td><input type="radio" name="phychal" value="yes"> yes<br>
<input type="radio" name="phychal" value="no"> no<br></td>
</tr>

<tr>
<th>NGO:</th>
<td><input type="radio" name="ngo" value="ngo1"> ngo1<br>
<select name="ngo">
  <option value="Bangalore">Bangalore</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Chennai">Chennai</option>
  <option value="Hyderabad">Hyderabad</option>
 
</select></td>


<td><input type="radio" name="ngo" value="ngo2"> ngo2<br>
<select name="ngo">
  <option value="Kolkata">Kolkata</option>
  <option value="Uttar Pradesh">Uttar Pradesh</option>
  <option value="Bihar">Bihar</option>
  <option value="Orissa">Orissa</option>
</select></td>

</tr>

<tr>
<th>Working Period in  months:</th>
<td>
<select name="wp">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  <option value="12">12</option>
</select>
</td>
</tr>
<tr>
<th>Gender of child:</th>
<td><input type="radio" name="gender" value="male"> male<br>
<input type="radio" name="gender" value="female"> female<br>
</tr>

<tr>
<th>DOB of child:</th>
<td><input type="date" name="date1" type="date1" required></td>
</tr>




<tr>
<th>Gross Income:</th>
<td><input type="text" name="gi" type="gi"></td>
</tr>




<tr><td colspan="2"><input type="submit" value="submit"></td><tr>


</table>
</form>


</body>
</html>