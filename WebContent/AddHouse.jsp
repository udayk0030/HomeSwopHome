<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add House Info</title>
</head>
</head>
<body background="C:\Users\udayk\Documents\GitHub\hsh fork\WebContent\images\add home.jpg">



<div>
<form  action="Controller2" method="post" onsubmit = "return validate()" >


<div align="center">
Title: <input  type="text" name="houseId" /> <br>
City: <input  type="text" name="city"  /> <br>
Code Postal: <input  type="text" name="codePostal" /> <br>
Location: <input type="text" name="location" /> <br>
<style type="text/css">
          #map{ width:700px; height: 500px; }
        </style>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>
        <title>Save Marker Example</title>
    </head>
    <body>
        <h1>Select a location!</h1>
        <p>Click on a location on the map to select it. Drag the marker to change location.</p>
        
        <!--map div-->
        <div id="map"></div>
        
        <!--our form-->
        <h2>Chosen Location</h2>
        <form method="post">
            <input type="text" id="lat" readonly="yes"><br>
            <input type="text" id="lng" readonly="yes">
        </form>
        
        <script type="text/javascript" src="map.js"></script>
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

</div>










</form>
</div>



</body>
</html>