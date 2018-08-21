<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/style.css"/>
</head>
<body>

<h1>Hello ${ user.firstName } ${user.lastName}, you are registered!</h1>

<p>${user.firstName}, please take a moment your verify your information below.</p>

<p>Email: ${user.email }<br>Password: ${user.confirmedPassword },<br>Number: ${user.number}<br>Age: ${user.age}.<br>If this information is correct please continue. </p>

<p>If not please go back to registration</p> 
<a href= "/register-form" class="btn btn-secondary">Back to Registration</a>
</body>
</html>