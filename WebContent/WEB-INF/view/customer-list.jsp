<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer - List</title>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relation Mgmt</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<input type="button" value="Add Customer" 
				   class="add-button"
				   onclick="window.location.href='showFormForAdd'; return false;"/>
								
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<c:forEach var="temp" items="${customers}">
					<tr>
						<td>${temp.firstName}</td>
						<td>${temp.lastName}</td>
						<td>${temp.email}</td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>