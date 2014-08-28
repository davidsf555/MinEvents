<!DOCTYPE html>
<html>
<head>
	<title>Events</title>
</head>
<body>
	Events
	<ul>
	<g:each in="${list}" var="event">
		<li>${event.time},${event.type.description},${event.quantity}</li>
	</g:each>
	</ul>
</body>
</html>