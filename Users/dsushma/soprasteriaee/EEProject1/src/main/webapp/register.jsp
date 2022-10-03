<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body text-align="center">
<div class="registerform">
<h2> Registration form</h2>
<form action="Register" method="post">
<div class="container">
<label> Username  </label>
<input type="text" name="username" placeholder="Enter Username"><br>
<label>  Password </label>
<input type="password" name="password" placeholder="password"><br>
<label> Confirm-password </label> 
<input type="password" name="password" placeholder="Re-Enter Username"><br>
<label> Email </label>
<input type="email" name="email" placeholder="Enter email-id"><br>
<input type="reset" value="Reset" style="background-color:buttonface;"><br>
<input type="submit" value="Register" class="submitbutton">
</div>
</form>
</div>
</body>
</html>