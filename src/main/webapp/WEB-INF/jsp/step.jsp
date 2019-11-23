<!--   <!DOCTYPE html>  -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Step Form</title>
	<link rel="stylesheet" href="css/normalize.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
	
	
	<link rel="stylesheet" href="css/register.css">
	
	
	<script type="text/javascript" src="js/reg.js"></script>

	
	
</head>
<body>


	<form action="step.do" method="POST" onsubmit="return valids()" enctype="multipart/form-data">
	
		<h1>Fill in details to register</h1>
		  
		<fieldset>
			<legend>Personal Details</legend>
		  	
			<label for="name">Name:</label>
			<input type="text" id="name" name="name" ></input>
		
			<label for="aadhar">Aadhar Number:</label>
			<input type="text" id="aadhar" name="aadhar" ></input>
			
		<!-- <div id="msg">
 	 		<p id="letter" class="invalid"></p>
			<p id="capital" class="invalid"></p>
  			<p id="number" class="invalid"></p>
  			<p id="length" class="invalid"></p>
		</div>
			
 -->
		 	
			<!-- <label for="confirm_password">Confirm Password:
			<input type="password" id="confirm_password" name="confirm_password" onkeyup='check();'   > -->
	
			<!-- <span id='message'></span>
		    </label> -->
		    
	
			<label for="stepdob">Date Of Birth:</label>  
			<input type="date" name="stepdob" id="stepdob" ></input>
			
			<label for="marital">Marital Status:</label>
		<select name="marital">
			<option value="single">Single</option>
			<option value="married">Married</option>
			<option value="divorced">Divorced</option>
			<option value="widowed">Widowed</option>
			<option value="separated">Separated</option>
			</select>
			
			
			<label for="qualification">Qualifications:</label>
			<select name="qualification">
   			<option value = "Primary education" >Primary education</option>
   			<option value = "Secondary education" >Secondary education</option>
   			<option value = "Bachelor" >Bachelor</option>
			</select>
		  
		  <legend>Family Details</legend>
			
				<label for="fathername">Father Name:</label>
			<input type="text" id="fathername" name="fathername" ></input>
			
				<label for="mothername">Mother Name:</label>
			<input type="text" id="mothername" name="mothername" ></input>
			
			
				<label for="spousename">Spouse Name:</label>
			<input type="text" id="spousename" name="spousename" ></input>
			
			<label for="child">Children</label>

			<input type="radio" name="child" checked>Yes</input>


			<input type="radio" name="child">No</input>
    
    		<legend>Contact Details</legend>
			
			
			<label for="address">Address:</label>
			<input type="text" id="address" name="address" ></input>
			
			
			<label for="stepemail">Email Id:</label>
			<input type="email" id="stepemail" name="stepemail" ></input>
			
		       
			<label for="cont">Contact Number:</label>
			<input type="text" id="cont" name="cont" ></input>
			
			<legend>Document Section</legend>
			<label for="aadhar_file">Aadhar:</label>
			<input type="file" name="file" id="aadhar_file">
			
				<label for="pan">Pan Card:</label>
			<input type="file" name="file" id="pan">
			
			
			
				<label for="course">Course Certification(if any):</label>
			<input type="file" name="file" id="course">
		  
		</fieldset>
		<button type="submit" id="step" name="submit">Sign Up</button>
		
		
	</form>

</body>
</html>