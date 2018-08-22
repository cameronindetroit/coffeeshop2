<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css"/>
</head>
<body>

<h1>Welcome to GC COFFEE</h1>
<div class="divMain">
<img src="/coffee-shop-1149155_1280.jpg" class="indexImage" >
</div>

<div class="container">
<br>
		<h1>Items at the coffee shop</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
				<tr>
					<td><a href="/items/${items.id}">${items.name}</a></td>
					<td>${items.description}</td>
					<td>${items.quantity}</td>
					<td>${items.price}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

<p class="buttonAlign">
	<a href="register-form" >Please Register!</a>
</p>

</body>
</html>