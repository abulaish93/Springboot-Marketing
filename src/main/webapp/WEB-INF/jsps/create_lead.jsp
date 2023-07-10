<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
	<h2>HELLO</h2>
	<form action="saveReg" method="post">
		<table border="1" bordercolor="red">
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstName"/></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastName"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"/></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="number" name="mobile"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"/></td>
			</tr>
		</table>
	</form>
	${msg}
</body>
</html>