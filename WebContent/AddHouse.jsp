<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add House Info</title>
</head>
<body>

<form  action="Controller2" method="post" onsubmit = "return validate()" >

Title: <input  type="text" name="houseId" /> <br>
City: <input  type="text" name="city" /> <br>
Code Postal: <input  type="text" name="codePostal" /> <br>
Location: <input type="text" name="location" /> <br>
Data Available: <input type="date" name="dataAvailable" /> to <input type="date" name="dataAvailable" /><br>
Number of people: <input  type="text" name="number" /> <br>

House Type:  <select name="houseType">
<option value="Apartment">Apartment</option>
<option value="House">House</option>
<option value="Studio">Studio</option>
</select><br>
<br>
Services<br>
WIFI<input name="service" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;
Clean the house<input name="service" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;
Hot Water 24h<input name="service" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;<br>

<br>
Constraints<br>
No smoking in the accommodation<input name="constraint" type="checkbox" value=""/>&nbsp;&nbsp;&nbsp;&nbsp;
No noise after 23h<input name="constraint" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;
No children<input name="constraint" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;
No pets allowed<input name="constraint" type="checkbox" value="" />&nbsp;&nbsp;&nbsp;&nbsp;<br>










</form>



</body>
</html>