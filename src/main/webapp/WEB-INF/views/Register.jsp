<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Ecommerce</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap  3.3.7 -->
  
    
</head>

<body>

<form action="doRegister" method="post">
	<label for="name">Name:</label>
	<input name="name" type="text"><br><br>
	<label for="email">Email:</label>
	<input name="email" type="email"><br><br>
	<label for="password">Password:</label>
	<input name="password" type="password"><br><br>
	<input type="file" name="image"><br><br>
	<input type="submit">
</form>
</body>
</html>
