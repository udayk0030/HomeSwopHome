<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal Information</title>
</head>
<body>

<jsp:useBean id="UserInfo" type="lab.mvc.model.UserInfo" scope="request"> </jsp:useBean>

<jsp:getProperty property="email" name="UserInfo"/>
<jsp:getProperty property="password" name="UserInfo"/>
<jsp:getProperty property="firstName" name="UserInfo"/>
<jsp:getProperty property="lastName" name="UserInfo"/>
<jsp:getProperty property="tel" name="UserInfo"/>

Hello

</body>
</html>