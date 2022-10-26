<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01 
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
 
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <%@ include file="banner.jsp" %>
 <html>
 	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	</head>
	<body>
 <div style="position:absolute; left:600px; top:300px; align:center">
 	 <h4>Register</h4>
 	 <span style="color:green"><b>${message}</b></span>
	 <form:form action="/Spring-MCV-Example/register-user" method="post" modelAttribute="register">
	 	<table class="table">
	 		<tr>
	 			<td>First Name</td>
	 			<td><form:input path="firstName"/></td>
	 			<td><span style="color:red"><b><form:errors path="firstName" /></b></span></td>
	 		</tr>
	 		<tr>
	 			<td>Last Name</td>
	 			<td><form:input path="lastName"/></td>
	 			<td><span style="color:red"><b><form:errors path="lastName" /></b></span></td>
	 		</tr>
	 		<tr>
	 			<td>Email</td>
	 			<td><form:input  path="email"/></td>
	 			<td><span style="color:red"><b><form:errors path="email" /></b></span></td>
	 		</tr>
	 		<tr>
	 			<td>Phone Number</td>
	 			<td><form:input path="phoneNumber" /></td>
	 			<td><span style="color:red"><b><form:errors path="phoneNumber" /></b></span></td>
	 		</tr>
	 		<tr>
	 			<td>Password</td>
	 			<td><form:password  path="password"/></td>
	 			<td><span style="color:red"><b><form:errors path="password" /></b></span></td>
	 		</tr>
	 		<tr>
	 			<td>Confirm Password</td>
	 			<td><form:password  path="confirmPassword"/></td>
	 			<td><span style="color:red"><b><form:errors path="confirmPassword" /></b></span></td>
	 		</tr>	
	 		<tr>
	 			<td colspan="2" align="center"><button type="submit" class="btn btn-primary">Register</button></td>
	 			
	 		</tr>		
	 		
	 	</table>
	 </form:form>
 	</div>
 	</body>
 </html>