<!DOCTYPE html>
<html>
<head>
	<title>New condition</title>
</head>
<body>
	<g:each in="${flash.messages}">
		<g:message error="${it}" />
	</g:each>
	<g:form action="save">
		<label for="eventType">Type</label>
		<g:select name="eventType" from="${eventTypes}" optionKey="id" optionValue="name"/>
		<label for="initDate">Init date</label>
		<g:datePicker name="initDate" value="${new Date()}"/>
		<label for="quantity">How many</label>
		<g:textField name="quantity" value="${formatNumber(number:condition.quantity,format:'###,##0.0')}"/>
		<label for=daysRange>each days</label>
		<g:textField name="daysRange" value="1"/>
		<g:submitButton name="create" value="Grabar"/>
	</g:form>
</body>
</html>