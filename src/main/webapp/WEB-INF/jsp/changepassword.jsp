<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Forget Password</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/register.css">
	<script type="text/javascript" src="js/reg.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="changepassword.do" method="POST">

	<h1>Change Password</h1>
	<fieldset>
			
		
			<label for="password">Old Password:</label>
			<input type="password" id="opassword" name="opassword">
			
			<label for="password">New Password:</label>
			<input type="password" id="npassword" name="npassword">
			
			<label for="password">Re-Type Password:</label>
			<input type="password" id="rpassword" name="rpassword">
			
			<button type="submit" id="login" name="updatepassword">Update Password</button>
					  
		</fieldset>

</form>
</body>
</html>