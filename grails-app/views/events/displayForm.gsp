<!DOCTYPE html>
<html>
<head>
	<title>New event</title>
</head>
<body>
	<g:each in="${flash.messages}">
		<g:message error="${it}" />
	</g:each>
	<g:form action="save">
		<label for="type">Type</label>
		<g:select name="type" from="${eventTypes}" optionKey="id" optionValue="name"/>
		<label for="time">Date</label>
		<g:datePicker name="time" value="${new Date()}"/>
		<g:textField name="quantity" value="1"/>
		<g:submitButton name="create" value="Grabar"/>
	</g:form>
</body>
</html>