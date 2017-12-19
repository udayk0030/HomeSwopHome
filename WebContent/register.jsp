<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register here</title>
<link rel="stylesheet" type="text/css" href="SignPage.css"> 

<script>
function validate(){
	var email = document.registerform.email.value;
	var pass = document.registerform.password.value;
	var repass = document.registerform.repassword.value;
	
	
	if(email==null || email==""){
		alert("Email cannot be blank");
		return false;
	}else if(pass==null || pass==""){
		alert("Password cannot be blank");
		return false;
	}else if(email.match("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")==null){  
        alert("Email not correct");  
        return false;  
    }else if(pass != repass){
    	alert("Confirm Password incorrect");
    }
	
	
}

</script>

</head>
<body>
<<<<<<< HEAD

<div>
<form name="registerform" action="ControllerUser" method="post" onsubmit = "return validate()" >

<h1 id="h">Register Here</h1>

<p>

Email Address: <input  type="text" name="email" /> <br>
Password: <input type="password" name="password" /> <br>
Confirm Password: <input type="password" name="repassword" /> <br>

<br>
Personal Information <br>
<br>
First Name: <input  type="text" name="firstName" /> <br>
Last Name: <input  type="text" name="lastName" /> <br>
Telephone Number: <input  type="text" name="tel" /> <br>



<br>
<input type="submit" value="Submit" />

</p>
</form>
</div>


=======
	<jsp:include page="design/header.jsp" />

	<form name="registerform" action="ControllerUser" method="post" onsubmit = "return validate()" >
		<h1 id="h">Register Here</h1>
		<label>Email:</label> <input  type="text" name="email" /> <br>
		<label>Password:</label> <input type="password" name="password" /> <br>
		<label>Confirm Password:</label> <input type="password" name="repassword" /> <br>
		<br>
		Personal Information <br>
		<br>
		<label>First Name:</label> <input  type="text" name="firstName" /> <br>
		<label>Last Name:</label> <input  type="text" name="lastName" /> <br>
		<label>Telephone Number:</label> <input  type="text" name="tel" /> <br>
		<br>
		<input type="submit" value="Submit" />
	</form>
	
	<jsp:include page="design/footer.jsp" />
>>>>>>> ca321f6f958836b501129de6246ebce3261dc6c3
</body>
</html>