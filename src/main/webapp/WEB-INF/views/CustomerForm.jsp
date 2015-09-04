<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	
	<h2>Spring's form textbox example</h2>

	<form:form method="POST" commandName="customer">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>UserName :</td>
				<td><form:input path="userName" /> dsqdqsd</td>
				<td><form:errors path="userName" cssClass"error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>

</body>

</body>
</html>
