<!DOCTYPE html>
<html>
<head>
	<title>Conditions</title>
</head>
<body>
	Conditions
	<ul>
	<g:each in="${list}" var="condition">
		<li>${condition.initDate},${condition.eventType.name},${condition.quantity} every ${condition.daysRange} days</li>
	</g:each>
	</ul>
</body>
</html>