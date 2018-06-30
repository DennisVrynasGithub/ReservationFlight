<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find flighs</title>
</head>
<body>
<h2>Find flights: </h2>
<form action="findFlights" method="post">
From: <input type="text" name="from" />
<br>
To: <input type="text" name="to" />
<br>
Departure date: <input type="text" name="departureDate" />
<br>
<input type="submit" value="search" />
</form>
</body>
</html>