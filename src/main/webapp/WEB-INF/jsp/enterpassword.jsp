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
		
		<fieldset>
			<legend>Password Reset</legend>
	
		
			<label for="email_id">Enter registered mail:</label>

				<input type="text" name="email_id">
		
				<legend>Security question</legend>
			
				<label for="contact_number">Your current contact no:</label>
				<input type="text"  name="contact_number">
		
				
				<label for="password">New Password:</label>
				<input type="password" id="password" name="password">
		
				
					<label for="cpassword">Confirm Password:</label>

				<input type="password" id="cpassword" name="cpassword">
		

		
		</fieldset>
		<button type="submit"  value="Reset">Reset</button>
	</form>
</body>
</html>