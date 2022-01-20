<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>		
		<title>Success</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	</head>
	<body>
		<div class="container">
	    	<h2 align="center" class="text-primary">Spring Mvc Pagination Example</h2><hr />
	    	<div>&nbsp;</div>
	    	
	    	<!-- Table to show the data fetched from the db. -->   	    	
	        <table class="table" align="center">
			    <thead>
			      <tr>
			        <th>Id</th><th>Name</th><th>Designation</th><th>Salary</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="emp" items="${list}">
				      <tr>
				        <td>${emp.id}</td><td>${emp.name}</td><td>${emp.designation}</td><td>${emp.salary}</td> 
				      </tr>
				    </c:forEach>
			    </tbody>
			  </table>
			  
			  <!-- Pagination links in spring mvc. -->			  
			  <ul class="pagination pagination-sm">
			  	<li class="page-item"><a class="page-link" href="/SpringMvcPagination/init/1">1</a></li>
			  	<li class="page-item"><a class="page-link" href="/SpringMvcPagination/init/2">2</a></li>
			  	<li class="page-item"><a class="page-link" href="/SpringMvcPagination/init/3">3</a></li>
			  </ul>
	    </div>		
	</body>
</html>