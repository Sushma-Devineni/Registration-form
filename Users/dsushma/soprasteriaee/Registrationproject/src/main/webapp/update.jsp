<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href ="css/style.css">
</head>
<body>
		<form action = "Update" method="get">
			<div class = "container">
				<label> Enter the Employee id to update their profile </label>
				<input type="text" name = "empId" placeholder="Employee Id"><br>
				
				<label> Enter the updated Employee name </label>
				<input type="text" name = "empName" placeholder="Employee Name"><br>
				
				<input type="submit" value="Update" class = "submit-button">
			</div>
		</form>
</body>
</html>