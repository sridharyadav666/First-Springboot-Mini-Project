<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!--  <link rel="stylesheet" href="style.css">-->
</head>
<font color='green'>${status}</font>
<body>

<form:form action="add" method="post" modelAttribute="contacts">
<table>

<tr>
<td>Contact Name</td>
<td><form:input path="cname"/></td>
</tr>
<tr>
<td>EMail</td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>MobileNo</td>
<td><form:input path="cnumber"/></td>
</tr>
<tr>

<td><input type="submit" value="Add Contact"/></td>
</tr>

</table>

</form:form>

</form>
</body>
</html>