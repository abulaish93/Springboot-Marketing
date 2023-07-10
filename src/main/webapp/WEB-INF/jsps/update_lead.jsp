<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
	<h2>update Lead</h2>
	<form action="updateReg" method="post">
		<table border="1" bordercolor="green">
		<input type="hidden" name="id" value="${lead.id}"/ >
			<tr>
			
				<td>FirstName:</td>
				<td><input type="text" name="firstName"
					value="${lead.firstName}" /></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastName" value="${lead.lastName}"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" value="${lead.email}"/></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="number" name="mobile" value="${lead.mobile}"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"/></td>
			</tr>
		</table>
	</form>
	${msg}
</body>
</html>