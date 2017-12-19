<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login here</title>

<link rel="stylesheet" type="text/css" href="SignPage.css"> 

<script>
function validate(){
	
	
	var email = document.loginform.email.value;
	var pass = document.loginform.password.value;
	if(email==null || email==""){
		alert("Email cannot be blank");
		return false;
	}else if(pass==null || pass==""){
		alert("Password cannot be blank");
		return false;
	}else if(email.match("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")==null){  
        alert("Email not correct");  
        return false;  
    }
	
}


</script>

</head>
<body>


<div>
<form name="loginform" action="ControllerUser" method="get" onsubmit = "return validate()">



<h1 id="h">Login Here</h1>

<p>

Email: <input  type="text" name="email" /> <br>
<br>
Password: <input  type="password" name="password" /> <br>


<br>
<input type="submit" value="Login" /><br>

<br>
<a href="Register.jsp">Don't have an account? </a>

</p>

</form>

</div>


</body>
</html>