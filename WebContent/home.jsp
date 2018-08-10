<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix = "jstl" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
<th>Book ID </th>
<th> Book Name </th>
<th> Book Author </th>
<th> Book Description </th>
<th> Book Price </th>
</tr>
<tr>
<jstl:forEach var = "book" items = "${sessionScope.book}">
<tr>
<td>${book.ID}</td>
<td>${book.Name}</td>
<td>${book.Author }</td>
<td>${book.Description }</td>
<td>${book.Price }</td>

<td><a href= "addToCart.app?id=${book.id }">Add to Cart</a>
</tr>
</jstl:forEach>
</tr>
</table>

</body>
</html>