<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<form class="newcontact" action="add" method="post">
<h1>New Contact</h1>
<input type="text" name="cname" placeholder="Name">
<input type="text" name="cnumber" placeholder="MobileNO">
<input type="text" name="email" placeholder="Mail">
<input type="submit" value="ADD">
<a href="viewall">View All Contacts</a>


</form>
</body>
</html>