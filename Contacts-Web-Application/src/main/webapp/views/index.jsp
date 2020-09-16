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
<p align="center"><font color='green'>${msg}</font></p><br>
<body>

<form:form action="add" modelAttribute="contacts" method="post">
<table align="center">
<tr>
<td><form:hidden path="cid"/></td>
</tr>
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

<td><input type="submit" value="sub"/></td>
</tr>

</table>
<p align="center"><a href="viewall">View All Contacts</a></p>
</form:form>


</body>
</html>