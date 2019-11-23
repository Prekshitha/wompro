<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/register.css">
<style>
	
</style>
</head>
<body>
<form action="login.do" method="POST" modelattribute="user">
	
		<h1>Login</h1>
		  
		<fieldset>
			<legend>Welcome</legend>

			<label for="username">User Name:</label>
			<input type="text" id="username" name="username">
		
			<label for="password">Password:</label>
			<input type="password" id="password" name="password">
					  
		</fieldset>
		<button type="submit">Sign In</button>
		<button><a style="text-decoration:none" href="forgetpassword.do">Forget Password</a></button>
		${message}
		
	</form>
</body>
</body>
</html>