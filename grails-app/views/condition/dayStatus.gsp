<!DOCTYPE html>
<html>
<head>
	<title>Conditions</title>
</head>
<body>
	Conditions
	<ul>
	<g:each in="${conditions}" var="condition">
		<li><ul>
			<li>${condition.key.eventType.name},${condition.key.quantity} every ${condition.key.daysRange} days</li>
			<li><g:if test="${condition.value.completed}">OK</g:if><g:else>Progress ${condition.value.quantity}/${condition.key.quantity}</g:else></li>
		</ul></li>
	</g:each>
	</ul>
</body>
</html>