function valids()
	{
 
 
		var name = document.getElementById('name').value;
		var username = document.getElementById('username').value;
/*		var date_of_birth = document.getElementById('date_of_birth').value;*/
		var email_id = document.getElementById('email_id').value;
		var contact_number = document.getElementById('contact_number').value;
 
 
 
 
		var id1 = document.getElementById('id1');
		var id2 = document.getElementById('id2');
	/*	var id3 = document.getElementById('id3');*/
		var id4 = document.getElementById('id4');
		var id5 = document.getElementById('id5');
 
 
		var regex = /^[a-zA-Z ]{5,}$/;
		var userregex = /^[a-zA-Z0-9 ]{6,}$/;
		var emailregex = /^([a-z 0-9\.-]+)@([a-z 0-9-]+).([a-z]{2,8})$/;
/*		var dobregex = /^([0-9]{2})\/([0-9]{2})\/([0-9]{4})$/;*/
		var conregex = /^([0-9]){10,10}$/;
 
 
		var flag=true;
 
 
		id1.innerHTML='';
		id2.innerHTML='';
/*		id3.innerHTML='';*/
		id4.innerHTML='';
		id5.innerHTML='';
 
 
		if(name=='' || name.length==0)
		{
		    id1.innerHTML='Please fill Name';
			id1.style.color = "red";
		    flag=false;
		}
		else if(regex.test(name) == false)
		{
		     id1.innerHTML="Name must be in alphabets only";
		     id1.style.color = "red";
		     flag=false;
		}
 
 
		if(username=='' || username.length==0)
		{
		    id2.innerHTML='Please fill User Name';
			id2.style.color = "red";
		    flag=false;
		}
		else if(userregex.test(username) == false)
		{
		     id2.innerHTML="Username must be in alphabets and numbers only";
		     id2.style.color = "red";
		     flag=false;
		}
 
	/*	if(date_of_birth=='' || date_of_birth.length==0)
		{
		    id3.innerHTML='Please fill Date of Birth';
			id3.style.color = "red";
		    flag=false;
		}
		else if(dobregex.test(date_of_birth) == false)
		{
		     id3.innerHTML="Fill the Date Properly";
		     id3.style.color = "red";
		     flag=false;
		}*/
 
		if(email_id=='' || email_id.length==0)
		{
		    id4.innerHTML='Please fill Email ID';
			id4.style.color = "red";
		    flag=false;
		}
		else if(emailregex.test(email_id) == false)
		{
		     id4.innerHTML="Fill the Email Id Properly";
		     id4.style.color = "red";
		     flag=false;
		}
 
 
		if(contact_number=='' || contact_number.length==0)
		{
		    id5.innerHTML='Please fill Contact Number';
			id5.style.color = "red";
		    flag=false;
		}
		else if(conregex.test(contact_number) == false)
		{
		     id5.innerHTML="Fill the Contact Number Properly";
		     id5.style.color = "red";
		     flag=false;
		}
 
		return flag;
 
	}	
 
 function check() {
	  if (document.getElementById('password').value ==
	    document.getElementById('confirm_password').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'Matched';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'Not Matching';
	  }
 
	  	var myInput = document.getElementById("password");
		var letter = document.getElementById("letter");
		var capital = document.getElementById("capital");
		var number = document.getElementById("number");
		var length = document.getElementById("length");
 
 
		myInput.onfocus = function() {
		  document.getElementById("msg").style.display = "block";
		}
 
 
		myInput.onblur = function() {
		  document.getElementById("msg").style.display = "none";
		}
 
 
		myInput.onkeyup = function() {
		  var lowerCaseLetters = /[a-z]/g;
		  if(myInput.value.match(lowerCaseLetters)) {
		    letter.classList.remove("invalid");
		    letter.classList.add("valid");
		  } else {
		    letter.classList.remove("valid");
		    letter.classList.add("invalid");
		}
 
 
		  var upperCaseLetters = /[A-Z]/g;
		  if(myInput.value.match(upperCaseLetters)) {
		    capital.classList.remove("invalid");
		    capital.classList.add("valid");
		  } else {
		    capital.classList.remove("valid");
		    capital.classList.add("invalid");
		  }
 
 
		  var numbers = /[0-9]/g;
		  if(myInput.value.match(numbers)) {
		    number.classList.remove("invalid");
		    number.classList.add("valid");
		  } else {
		    number.classList.remove("valid");
		    number.classList.add("invalid");
		  }
 
		  if(myInput.value.length >= 8) {
		    length.classList.remove("invalid");
		    length.classList.add("valid");
		  } else {
		    length.classList.remove("valid");
		    length.classList.add("invalid");
		  }
		}
	}