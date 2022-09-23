<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<center><h1>Registration Form</h1></center>
<hr style="background-color:black;width:100px;height:3px;">
	<div class="wrapper">
	<center>
		<form action ="Register" method = "get" class="login-register-form">
		<div class="container">
<b>Employee Id:</b><input type="text" name="empId"  placeholder="Employee Id"><br><br>
<b>Employee Name:</b><input type="text" name="empName"  placeholder="Employee Name"><br><br>
<b>Email:</b><input type="text" name="empEmail" id='txtEmail' placeholder="Employee Email"><br>
<center><input type="reset" value="Reset" style="text-align:center;  color: gray; padding: 6px 5px;margin: 5px 0;border:none;cursor: pointer;
  background-color: blue">
 <input type="submit" value="register" onclick='Javascript:checkEmail()';   style="text-align:center;  color: white;padding: 6px 5px;margin: 5px 0;border:none;cursor: pointer;
  background-color: green">
  <br><br>
  </center>
  Already have an account?<a href="index.jsp">Login In</center>
  </div>
</form>

</center>
</div>
<script src="index.js"></script>
</body>
</html>