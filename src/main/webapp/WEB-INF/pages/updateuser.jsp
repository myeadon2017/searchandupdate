<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search for user and update the information</title>
</head>
<body>
	Enter the username to find user with that username, if the user exists it will edit
	<br />
	<form method="post">
		Username: <input type="text" name="uname" /> <br /> 
		Password: <input type="password" name="pass" /><br /> 
		City: <input type="text" name="city" /> <br /> 
		<br />
		<button type="submit">update user</button>
	</form>
</body>
</html>