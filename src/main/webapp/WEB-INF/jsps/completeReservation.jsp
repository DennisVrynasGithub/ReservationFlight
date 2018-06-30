<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- To taglib einai gia to JSTL  -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- M to proigoumeno tag kapoioi browsers petane sfalma kai t apofeugoume me auth ti grammi -->
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h3>Complete reservation</h3>
Airline: ${flight.operatingAirlines}
Departure city: ${flight.departureCity}
Arrival city: ${flight.arrivalCity}

<form action="completeReservation" method="post">
<h2>Passenger details:</h2>
First name: <input type="text" name="passengerFirstName" />
<br>
Last name: <input type="text" name="passengerLastName" />
<br>
Email: <input type="text" name="passengerEmail" />
<br>
Phone: <input type="text" name="passengerPhone" />
<br>

<h2>Card details</h2>
Name  on the card: <input type="text" name="nameOnTheCard" />
<br>
Card no: <input type="text" name="cardNumber" />
<br>
Expiry Date: <input type="text" name="expirationDate" />
<br>
Three digits: <input type="text" name="securityCode" />
<br>
<input type="hidden" name="flightId" value="${flight.id }" />
<input type="submit" value="confirm" />
</form>
</body>
</html>