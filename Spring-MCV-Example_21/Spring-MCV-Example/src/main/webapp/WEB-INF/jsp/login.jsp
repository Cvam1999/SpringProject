<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01 
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	</head>
	<body>	
	    <%@ include file="banner.jsp" %>
		
		<div style="position:absolute; left:600px; top:300px; align:center">
		     <h4>Login</h4>
		     <span style="color:red"><b>${error}</b></span>
			<form:form action="/Spring-MCV-Example/validate" method="POST" modelAttribute="user">
				<table class="table">
					<tr>
						<td>User Name:</td>
						<td><form:input path="userName"/></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><form:password path="password"/></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><button class="btn btn-primary" type="submit">Login</button>
						New user? <a href="/Spring-MCV-Example/register"> register </a>
						</td>
						
					</tr>
					
				</table>
			</form:form>
		</div>
	</body>
</html>
