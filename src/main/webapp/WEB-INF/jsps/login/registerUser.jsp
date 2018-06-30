<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="registerUser" method="post">
First name: <input type="text" name="firstName" />
<hr>
Last name: <input type="text" name="lastName" />
<hr>
Email: <input type="text" name="email" />
<hr>
Password: <input type="password" name="password" />
<hr>
Confirm password: <input type="password" name="confirmPassword" />
<hr>
<input type="submit" value=register" />
</form>
</body>
</html>