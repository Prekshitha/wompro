<!--   <!DOCTYPE html>  -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Sign Up Form</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	
	
	<link rel="stylesheet" href="css/register.css">
	
	
	<script type="text/javascript" src="js/reg.js"></script>

	
	
</head>
<body>


	<form action="register.do" method="POST" onsubmit="return valids()">
	
		<h1>Sign Up</h1>
		  
		<fieldset>
			<legend>Your basic info</legend>
		  	
			<label for="name">Name:</label>
			<input type="text" id="name" name="name" ></input>
		
			<label for="username">User Name:</label>
			<input type="text" id="username" name="username" ></input>
			
		<div id="msg">
 	 		<p id="letter" class="invalid"></p>
			<p id="capital" class="invalid"></p>
  			<p id="number" class="invalid"></p>
  			<p id="length" class="invalid"></p>
		</div>
			
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" onkeyup='check();'>
				 <h4>Password must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters</h4>
				
		
		 	
			<label for="confirm_password">Confirm Password:
			<input type="password" id="confirm_password" name="confirm_password" onkeyup='check();'   >
	
			<span id='message'></span>
		    </label>
		    
	
			<label for="date_of_birth">Date Of Birth:</label>  
			<input type="date" name="date_of_birth" id="date_of_birth" ></input>
			
			<label for="email_id">Email Id:</label>
			<input type="email" id="email_id" name="email_id" ></input>
			
		       
			<label for="contact_number">Contact Number:</label>
			<input type="text" id="contact_number" name="contact_number" ></input>
			
			<label for="role">Role:</label>
			<select name="role">
			<option value="NGO">NGO</option>
			<option value="workingwomen">Working Women</option>
			<option value="admin">Admin</option>
			</select>
		  
		</fieldset>
		<button type="submit" id="login" name="login">Sign Up</button>
		
		
	</form>

</body>
</html>