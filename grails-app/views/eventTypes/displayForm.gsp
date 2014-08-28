<!DOCTYPE html>
<html>
<head>
	<title>New event type</title>
</head>
<body>
	<g:each in="${flash.messages}">
		<g:message error="${it}" />
	</g:each>
	<g:form action="save">
		<label for="name">Name</label>
		<g:textField name="name" value="${type.name}"/>
		<label for="des">Description</label>
		<g:textField name="description" value="${type.description}"/>
		<g:submitButton name="create" value="Grabar"/>
	</g:form>
</body>
</html>