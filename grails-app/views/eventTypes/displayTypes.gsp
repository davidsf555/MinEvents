<!DOCTYPE html>
<html>
<head>
	<title>Event types</title>
</head>
<body>
	Types
	<ul>
	<g:each in="${list}" var="type">
		<li>${type.name},${type.description}</li>
	</g:each>
	</ul>
</body>
</html>