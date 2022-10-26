<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01 
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">

<%@ page import ="java.util.List" %>
<%@ page import ="com.cg.spring.mvc.training.models.Employee" %>

<%@ include file="home.jsp"%>

 <div style="position:absolute; top:200px; left:100px;">

 	<% out.print("<table class=\"table table-info\"><tr><th>EMP ID</th><th>Emp Name</th> <th>Emp Salary</th></tr>"); %>
 	<% 
 	   List<Employee> employees = (List<Employee>)request.getAttribute("employees");
 	   for(Employee emp : employees){
 	   		out.print("<tr>");
 	   		out.print("<td>"+emp.getId()+"</td>");
 	   		out.print("<td>"+emp.getName()+"</td>");
 	   		out.print("<td>"+emp.getSalary()+"</td>");
			out.print("</tr>");
 	   }
 	 %>
 	<% out.print("</table>"); %>
 	
 </div>
 