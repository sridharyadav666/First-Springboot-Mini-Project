<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<script type="text/javascript">
function deleteAction() {
	return confirm()
}
</script>

<form:form action="viewall" method="get" modelAttribute="contacts">
<h2 align="center">Contacts Info</h2><br>
<p align="center"><font color="green">${dltmsg}</font></p><br>
<div style="text-align: center;"><a href="/">+Add New Contact</a></div><br>
  <table border="1" align="center">
  <tr>
  <th>Contact Name</th>
  <th>Email</th>
  <th>Number</th>
  <th>Action</th>
  </tr>
  <c:forEach var="contact" items="${contacts}">
  <tr>
  <td>${contact.cname}</td>
  <td>${contact.email}</td>
  <td>${contact.cnumber}</td>
  <td>
  <a href="editContact?id=${contact.cid}">Edit</a>
  <a href="deleteContact?id=${contact.cid}" onclick="return confirm('Are you Sure want you delete this contact');">Delete</a>
  </td>
  </tr>
  </c:forEach>
  
  </table>
  
</form:form>

</body>
</html>