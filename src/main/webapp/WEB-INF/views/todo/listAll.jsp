<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Todo List</title>
</head>
<body>
<h1>Todo List</h1>
<a href='<c:url value="input"/>'>Add Todo</a>
 <table border= 1px solid black>
 	<tr>
 		<th>User</th>
 		<th>Description</th>
 		<th>Target Date</th>
 		<th>Star Meter</th>
 		<th>Options</th>
 	</tr>
 	<c:forEach items="${todos}" var="todo">
 	<tr>
 		<td>${todo.user}</td>
 		<td>${todo.description}</td>
 		<td>${todo.targetDate}</td>
 		<td>${todo.starMeter}</td>
 		<td>
 		<a href="edit/${ todo.id }">Edit</a><br>
 		<a href="delete/${ todo.id }">Delete</a>
 		</td>
 	</tr>
 	</c:forEach>
 </table>
 
 
</body>
</html>