<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css"/>
</head>
<body >
<main class="container">

<h1> <image src="/Paper_Cups_-_isolated.png"/> Please fill out the form to register</h1> 


<form action= "/register-result" method="post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">email</label>
      <input name="email" type="email" class="form-control" id="inputEmail4" placeholder="proper format with (@)">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">password</label>
      <input name="password" type="password" class="form-control" id="inputPassword4" 
      required minlength="8" maxLength= "12" placeholder="8-12 characters "><br>
      <label for="inputPassword4">Confirm Password</label>
      <input name="password2" type="password" class="form-control" id="inputPassword4" 
      required minlength="8" maxLength= "12" placeholder="must match above">
    </div>
    
  </div>
  <div class="form-group">
    <label for="inputAddress">First Name</label>
    <input name="firstname" type="text" class="form-control" id="inputAddress"
    required minlength="2" pattern="[A-Z][a-z]*" placeholder="at least 2 characters">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Last Name</label>
    <input name ="lastname" type="text" class="form-control" id="inputAddress2"
     required minlength="2" pattern="[A-Z][a-z]*" placeholder="at least 2 characters">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Phone Number</label>
      <input name="number" type="text" class="form-control" id="inputCity" 
       required pattern ="\d\d\d\d\d\d\d\d\d\d"  placeholder="needs at least 10 numbers">
    </div>
    
      <div style= "margin-top: 35px; margin-left: 10px;"  class="form-check">
        <input class="form-check-input" type="checkbox" >
        <label class="form-check-label">
         Sign Up for promotions?
        </label>
      </div>
      
      <div style= "margin-top: 35px; margin-left: 10px;"  class="form-check">
        <input class="form-check-input" type="checkbox" >
        <label class="form-check-label">
         Sign Up for points?
        </label>
      </div>
      
       <div class="form-group col-md-4">
      <label for="inputState">Age</label>
      
      <select name= "age" type="text" id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option value="13-18">13-18</option>
        <option value="18-21">18-21</option>
        <option value="21-30">21-30 </option>
        <option value="30-50">30-50<option>
        <option value="51 and above">51 and above</option>  
        
      </select>
      
      
    </div>
  </div>

  <button type="submit" class="btn btn-primary">Register</button>
  <c: if test="${not empty firstName }">
  <a href= "/register-form" class="btn btn-secondary">Clear</a>
  </c:if>
</form>
</main>
</body>
</html>