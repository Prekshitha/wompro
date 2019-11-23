<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Password Change</title>

	<link rel="stylesheet" href="css/register.css">
</head>
<body>
	<form action="enterpassword.do" method="post">
		<table>
	<tr>
				<td>Enter registered mail</td>
				<td>:</td>

				<td><input type="text" class="textfields" name="email_id"></td>
			</tr>
			<tr>
				<td>Security question</td></tr>
				<tr><td>Your current contact no</td>
				<td>:</td>

				<td><input type="text" class="textfields" name="contact_number"></td>
			</tr>
			<tr>
			<tr>
				<td>New Password</td>
				<td>:</td>

				<td><input type="password" class="textfields" id="password" name="password"></td>
			</tr>

			<tr>
				<td>Confirm Password</td>
				<td>:</td>

				<td><input type="password" id="cpassword" 	class="textfields" name="cpassword"></td>
			</tr>
			<tr>
				<td colspan=4><br></td>
			</tr>
			<tr>
				<td colspan=3 align="center"><input type="submit" class="button" value="Reset">
			</tr>

		</table>
	</form>
</body>
</html>